package org.frc5572.plugin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import org.frc5572.util.profiler.Profiling;
import org.frc5572.util.profiler.TextProfileLoggingFormat;
import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.jvm.tasks.Jar;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.ClassNode;

public class MainPlugin implements Plugin<Project> {

    @Override
    public void apply(Project target) {
        target.getTasks().withType(Jar.class).forEach(task -> {
            task.doLast(ctx -> {
                File plugin_timings = new File(target.getProjectDir(), "plugin-timings.txt");
                Profiling.setLoggingProfiler(plugin_timings.getAbsolutePath(), () -> System.nanoTime(), () -> 0, 1e9,
                        TextProfileLoggingFormat.INSTANCE);
                task.getOutputs().getFiles().forEach(file -> {
                    Profiling.startTick();
                    Profiling.push("oldJarName");
                    var pathparts = file.getAbsolutePath().split("\\.");
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < pathparts.length - 1; i++) {
                        if (i != 0) {
                            sb.append('.');
                        }
                        sb.append(pathparts[i]);
                    }
                    sb.append(".old.jar");
                    File newJar = file.getAbsoluteFile();
                    File oldJar = new File(sb.toString());
                    Profiling.swap("moveNewToOld");
                    try {
                        Files.move(newJar.toPath(), oldJar.toPath(), StandardCopyOption.REPLACE_EXISTING);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Profiling.swap("mixinIndex");
                    Map<String, MixinData> mixins = new HashMap<>();
                    Set<String> skip = new HashSet<>();
                    try {
                        try (var zipFile = new ZipFile(oldJar)) {
                            var entries = zipFile.entries();
                            while (entries.hasMoreElements()) {
                                Profiling.push("entry");
                                ZipEntry entry = entries.nextElement();
                                if (entry.isDirectory()) {
                                    Profiling.pop();
                                    continue;
                                }
                                if (!entry.getName().endsWith(".class")) {
                                    Profiling.pop();
                                    continue;
                                }

                                // Heuristics for skipping certain packages
                                if (entry.getName().startsWith("com/ctre/phoenix6/") // Phoenix6
                                        || entry.getName().startsWith("com/fasterxml/") // Jackson
                                        || entry.getName().startsWith("com/google/") // Protobuf
                                        || entry.getName().startsWith("com/kauailabs/") // NavX
                                        || entry.getName().startsWith("com/pathplanner/") // Pathplanner
                                        || entry.getName().startsWith("com/revrobotics/") // REVLib
                                        || entry.getName().startsWith("edu/wpi/first/") // WPILib
                                        || entry.getName().startsWith("it/unimi/dsi/") // FastUtil
                                        || entry.getName().startsWith("kotlin/") // Kotlin Language
                                        || entry.getName().startsWith("org/apache/") // Apache Commons
                                        || entry.getName().startsWith("org/ejml/") // EJML
                                        || entry.getName().startsWith("org/intellij/") // IntelliJ
                                        || entry.getName().startsWith("org/jetbrains/") // JetBrains
                                        || entry.getName().startsWith("org/json/") // Jackson
                                        || entry.getName().startsWith("org/littletonrobotics/") // AdvantageKit
                                        || entry.getName().startsWith("org/opencv/") // OpenCV
                                        || entry.getName().startsWith("org/photonvision/") // PhotonVision
                                        || entry.getName().startsWith("pabeles/") // ConcurrencyUtil
                                        || entry.getName().startsWith("us/hebi/quickbuf/") // QuickBuf
                                ) {
                                    Profiling.pop();
                                    continue;
                                }

                                System.out.println(entry.getName());

                                InputStream stream = zipFile.getInputStream(entry);
                                byte[] content = stream.readAllBytes();
                                ClassReader reader = new ClassReader(content);
                                MixinData data = new MixinData(Opcodes.ASM9);
                                reader.accept(data,
                                        ClassReader.SKIP_CODE | ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);
                                if (data.isMixin) {
                                    // System.out.println(entry.getName());
                                    skip.add(entry.getName());
                                }
                                Profiling.pop();
                            }
                        }
                        Profiling.swap("processMixins");
                        Set<String> seenAlready = new HashSet<>();
                        try (var fos = new FileOutputStream(newJar)) {
                            try (var zos = new ZipOutputStream(fos)) {
                                try (var zipFile = new ZipFile(oldJar)) {
                                    var entries = zipFile.entries();
                                    while (entries.hasMoreElements()) {
                                        Profiling.push("entry");
                                        ZipEntry entry = entries.nextElement();
                                        if(skip.contains(entry.getName())) {
                                            Profiling.push("skipped");
                                            Profiling.pop();
                                            Profiling.pop();
                                            continue;
                                        }
                                        if (seenAlready.contains(entry.getName())) {
                                            Profiling.push("seenAlready");
                                            Profiling.pop();
                                            Profiling.pop();
                                            continue;
                                        }
                                        seenAlready.add(entry.getName());
                                        if (entry.isDirectory()) {
                                            Profiling.push("simpleDir");
                                            zos.putNextEntry(entry);
                                            Profiling.pop();
                                            Profiling.pop();
                                            continue;
                                        }
                                        if (!mixins.containsKey(entry.getName())) {
                                            Profiling.push("simpleCopy");
                                            zos.putNextEntry(entry);
                                            InputStream stream = zipFile.getInputStream(entry);
                                            stream.transferTo(zos);
                                            Profiling.pop();
                                            Profiling.pop();
                                            continue;
                                        }
                                        Profiling.push("readClass");
                                        InputStream stream = zipFile.getInputStream(entry);
                                        byte[] content = stream.readAllBytes();
                                        ClassReader reader = new ClassReader(content);
                                        ClassNode node = new ClassNode();
                                        reader.accept(node, 0);
                                        Profiling.swap("processClass");

                                        // TODO processing

                                        Profiling.swap("writeClass");
                                        ClassWriter writer = new ClassWriter(0);
                                        node.accept(writer);
                                        zos.putNextEntry(entry);
                                        zos.write(writer.toByteArray());
                                        Profiling.pop();
                                        Profiling.pop();
                                    }
                                }
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        throw new RuntimeException(e);
                    }
                    Profiling.pop();
                    Profiling.endTick();
                });
                Profiling.save();
            });
        });
    }

}
