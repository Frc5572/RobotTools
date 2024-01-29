use std::{collections::HashMap, io::{Read, Write}};

use binrw::BinRead;
use tempfile::tempdir;


mod java;

#[tokio::main]
async fn main() {
    let source_dir = std::path::Path::new(file!()).canonicalize().unwrap();
    let source_dir = source_dir.parent().unwrap().parent().unwrap().parent().unwrap();
    
    let temp_dir = tempdir().unwrap();
    
    let mut interfaces = String::from("{");
    let mut classes = String::from("{");

    let wpi = std::fs::read(source_dir.join("config.json")).unwrap();
    let wpi: HashMap<String, Vec<String>> = serde_json::from_slice(&wpi).unwrap();
    for interface in &wpi["interfaces"] {
        interfaces.push_str(&format!("\n        {:?},", interface));
    }
    for class in &wpi["classes"] {
        classes.push_str(&format!("\n        {:?},", class));
    }

    let skip = wpi["skip"].clone();

    let vendor_deps_dir = source_dir.join("vendordeps");
    for item in std::fs::read_dir(vendor_deps_dir).unwrap() {
        let item = item.unwrap();
        match item.path().extension().and_then(|x| x.to_str()) {
            Some("json") => {
                let vendordep: vendordeps::VendorDep = match serde_json::from_reader(std::fs::File::open(item.path()).unwrap()) {
                    Ok(x) => x,
                    Err(x) => {
                        eprintln!("Invalid format for vendordep at {}", item.path().display());
                        eprintln!("{}", x);
                        continue
                    },
                };
                vendordep.download_all_java_deps_to_folder(temp_dir.path()).await.unwrap();
            }
            _ => {}
        }
    }

    for item in std::fs::read_dir(temp_dir.path()).unwrap() {
        let item = item.unwrap();
        if item.file_type().unwrap().is_dir() {
            continue
        }
        let f = std::fs::File::open(item.path()).unwrap();
        let mut z = zip::ZipArchive::new(f).unwrap();
        for i in 0..z.len() {
            let mut f = z.by_index(i).unwrap();
            if !f.name().ends_with(".class") {
                continue
            }
            // ZipFile can't seek, so we need to fill it into a buffer first.
            let mut res = Vec::new();
            f.read_to_end(&mut res).unwrap();

            let mut res = std::io::Cursor::new(res);
            let class = java::MinimalJavaClass::read_be(&mut res).unwrap();

            if !class.is_public() {
                continue
            }
            if class.is_annotation() {
                continue
            }
            if class.is_enum() {
                continue
            }

            let name = class.this_class().replace('/', ".").replace('$', ".");

            if skip.contains(&name) {
                continue
            }

            if class.is_interface() {
                interfaces.push_str(&format!("\n        {:?},", name));
            } else {
                classes.push_str(&format!("\n        {:?},", name));
            }
        }
    }

    let mut outf = std::fs::File::create(source_dir.join("src/main/java/org/frc5572/robotools/IOTypes.java")).unwrap();
    writeln!(&mut outf, "package org.frc5572.robotools;\n").unwrap();
    writeln!(&mut outf, "public class IOTypes {{\n").unwrap();
    writeln!(&mut outf, "    public static String[] ioInterfaces = {}", interfaces).unwrap();
    writeln!(&mut outf, "    }};").unwrap();
    writeln!(&mut outf, "    public static String[] ioClasses = {}", classes).unwrap();
    writeln!(&mut outf, "    }};").unwrap();
    writeln!(&mut outf, "}}\n").unwrap();
}
