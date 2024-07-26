package org.frc5572.robotools;

import java.nio.file.Path;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.Set;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ModuleElement;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;

import org.apache.commons.lang3.SystemUtils;

import com.sun.source.util.Trees;

/**
 * Annotation processor for checks. Used by VS Code.
 */
@SupportedAnnotationTypes("*")
@SupportedSourceVersion(SourceVersion.RELEASE_11)
public class RobotProcessor extends AbstractProcessor {

    private boolean hasProcessed;

    /** Initialization function */
    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
        hasProcessed = false;
    }

    public native String run(String name);

    /** Process all elements. */
    @Override
    public boolean process(Set<? extends TypeElement> arg0, RoundEnvironment roundEnv) {
        if (hasProcessed) {
            return false;
        }
        hasProcessed = true;
        Trees trees = Trees.instance(processingEnv);
        outer:
        for (ModuleElement mod : processingEnv.getElementUtils().getAllModuleElements()) {
            if (!mod.isUnnamed()) {
                continue;
            }
            for (Element element : mod.getEnclosedElements()) {
                if (element instanceof PackageElement) {
                    PackageElement packageElement = (PackageElement) element;
                    for (Element element2 : packageElement.getEnclosedElements()) {
                        if (element2 instanceof TypeElement) {
                            TypeElement typeElement = (TypeElement) element2;
                            var treePath = trees.getPath(typeElement);
                            if (treePath == null) {
                                continue;
                            }
                            long num_parents = typeElement.getQualifiedName().chars().filter((x) -> {
                                return x == ((int) '.');
                            }).count();
                            Path p = Path.of(treePath.getCompilationUnit().getSourceFile().getName());
                            for(int i = 0; i < num_parents; i++) {
                                p = p.getParent();
                            }
                            p = p.getParent().getParent().getParent().getParent();
                            String generated = run(p.toString());
                            try {
                                var file = processingEnv.getFiler().createSourceFile("org.frc5572.Generated");
                                try(var writer = file.openWriter()) {
                                    writer.write(generated);
                                }
                            } catch(IOException e) {
                                e.printStackTrace();
                            }

                            break outer;
                        }
                    }
                }
            }
        }
        return false;
    }

    static {
        try {
            loadLib("robot_tools");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void loadLib(String name) throws IOException {
        String filename;
        if(SystemUtils.IS_OS_LINUX) {
            filename = "lib" + name + ".so";
        } else if (SystemUtils.IS_OS_WINDOWS) {
            filename = name + ".dll";
        } else {
            throw new RuntimeException("Unsupported OS");
        }
        Path temp = Files.createTempDirectory("");
        File file = new File(temp.toFile(), filename);
        System.out.println(file.getAbsolutePath());
        InputStream in = RobotProcessor.class.getClassLoader().getResourceAsStream(filename);
        byte[] buf = new byte[4096];
        try(FileOutputStream outStream = new FileOutputStream(file)) {
            while(true) {
                int count = in.read(buf);
                if(count <= 0) {
                    break;
                }
                outStream.write(buf, 0, count);
            }
        }
        System.load(file.getAbsolutePath());
    }

}
