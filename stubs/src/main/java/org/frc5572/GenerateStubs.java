package org.frc5572;

import java.io.IOException;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import org.objectweb.asm.ClassReader;

public class GenerateStubs {

    private static void printParts(Stream<Path> p) throws IOException {
        var paths = p.iterator();
        Map<String, ClassStub> classes = new HashMap<>();
        while (paths.hasNext()) {
            var path = paths.next();
            String pathstr = path.toString();
            if(pathstr.endsWith(".class")) {
                System.out.println(pathstr);
                byte[] data = Files.readAllBytes(path);
                ClassReader reader = new ClassReader(data);
                int dolla = reader.getClassName().indexOf('$');
                if(dolla != -1) {
                    String className = reader.getClassName().substring(0, dolla) + ".class";
                    if(!classes.containsKey(className)) {
                        classes.put(className, new ClassStub(className));
                    }
                    classes.get(className).addInnerClass(reader);
                } else {
                    String className = reader.getClassName();
                    if(!classes.containsKey(className)) {
                        classes.put(className, new ClassStub(className));
                    }
                    classes.get(className).setContents(reader);
                }
            } else {
                try {
                    try(Stream<Path> p2 = Files.list(path)) {
                        printParts(p2);
                    }
                } catch(Exception e) {}
            }
        }
    }

    public static void main(String[] args) throws IOException {
        var fs = FileSystems.newFileSystem(URI.create("jrt:/"), Collections.emptyMap());
        try (Stream<Path> p = Files.list(fs.getPath("/modules/jdk.compiler/com/sun/tools/"))) {
            printParts(p);
        }
    }

}
