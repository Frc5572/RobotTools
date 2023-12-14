package org.frc5572.robotools;

import java.io.IOException;
import java.io.Writer;

import javax.annotation.processing.Filer;
import javax.tools.JavaFileObject;

public class GeneratedAnnotation {
    
    public static interface GeneratedAnnotationArgument {
        public void write(Writer w) throws IOException;
        // TODO parse from AnnotationMirror
    }

    public static class StringAnnotationArgument implements GeneratedAnnotationArgument {
        public final String name;

        public StringAnnotationArgument(String name) {
            this.name = name;
        }

        public StringAnnotationArgument() {
            this("value");
        }

        @Override
        public void write(Writer w) throws IOException {
            w.write("String ");
            w.write(name);
            w.write("()");
        }
    }

    public final String packageName;
    public final String name;
    public final GeneratedAnnotationArgument[] arguments;
    public final boolean isRepeatable;

    public GeneratedAnnotation(String packageName, String name, boolean isRepeatable, GeneratedAnnotationArgument... arguments) {
        this.packageName = packageName;
        this.name = name;
        this.isRepeatable = isRepeatable;
        this.arguments = arguments;
    }

    public GeneratedAnnotation(String packageName, String name, GeneratedAnnotationArgument... arguments) {
        this(packageName, name, false, arguments);
    }

    private static String packageNameFromQualifiedName(String qualifiedName) {
        StringBuilder builder = new StringBuilder();
        String[] parts = qualifiedName.split("\\.");
        for(int i = 0; i < parts.length - 1; i++) {
            if(!builder.isEmpty()) {
                builder.append('.');
            }
            builder.append(parts[i]);
        }
        return builder.toString();
    }

    private static String classNameFromQualifiedName(String qualifiedName) {
        String[] parts = qualifiedName.split("\\.");
        return parts[parts.length - 1];
    }

    public GeneratedAnnotation(String qualifiedName, boolean isRepeatable, GeneratedAnnotationArgument... arguments) {
        this(packageNameFromQualifiedName(qualifiedName), classNameFromQualifiedName(qualifiedName), isRepeatable, arguments);
    }

    public GeneratedAnnotation(String qualifiedName, GeneratedAnnotationArgument... arguments) {
        this(packageNameFromQualifiedName(qualifiedName), classNameFromQualifiedName(qualifiedName), false, arguments);
    }

    public void generateJavaFiles(Filer filer) throws IOException {
        JavaFileObject newJavaFile = filer.createSourceFile(this.packageName + "." + this.name);
        try(Writer w = newJavaFile.openWriter()) {
            w.write("package ");
            w.write(this.packageName);
            w.write(";\n\n");
            // TODO repeatable
            w.write("public @interface ");
            w.write(this.name);
            w.write(" {\n");
            for(GeneratedAnnotationArgument arg : this.arguments) {
                w.write('\t');
                arg.write(w);
                w.write(";\n");
            }
            w.write("}\n");
        }
    }

}
