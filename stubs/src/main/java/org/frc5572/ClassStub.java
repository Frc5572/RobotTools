package org.frc5572;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.lang.model.element.Modifier;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import com.squareup.javapoet.ArrayTypeName;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.CodeBlock;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.ParameterSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;

public class ClassStub {

    private ClassReader body;
    private ArrayList<ClassStub> subClasses = new ArrayList<>();

    public ClassStub() {
    }

    public void setContents(ClassReader classBody) {
        this.body = classBody;
    }

    public void addInnerClass(ClassReader classBody) {
        ClassStub inner = new ClassStub();
        inner.setContents(classBody);
        subClasses.add(inner);
    }

    private TypeSpec getSpec() {
        TypeSpec[] subclasses = this.subClasses.stream().map(ClassStub::getSpec).toArray(TypeSpec[]::new);
        String className = nameFromInternalName(this.body.getClassName());
        if (Character.isDigit(className.charAt(0))) {
            return null;
        }
        int access = body.getAccess();
        TypeSpec.Builder builder;
        if ((access & 0x4000) != 0) {
            // Enum
            EnumVisitor visitor = new EnumVisitor(className);
            body.accept(visitor, ClassReader.SKIP_CODE);
            builder = visitor.builder;
        } else if ((access & 0x2000) != 0) {
            // Annotation
            AnnotationVisitor visitor = new AnnotationVisitor(className);
            body.accept(visitor, ClassReader.SKIP_CODE);
            builder = visitor.builder;
        } else if ((access & 0x0200) != 0) {
            // Interface
            InterfaceVisitor visitor = new InterfaceVisitor(className);
            body.accept(visitor, ClassReader.SKIP_CODE);
            builder = visitor.builder;
        } else {
            // Class
            RegularVisitor visitor = new RegularVisitor(className);
            body.accept(visitor, ClassReader.SKIP_CODE);
            builder = visitor.builder;
        }

        for (var subclass : subclasses) {
            if (subclass == null) {
                continue;
            }
            subclass = subclass.toBuilder().addModifiers(Modifier.STATIC).build();
            builder.addType(subclass);
        }
        return builder.build();
    }

    private static class EnumVisitor extends ClassVisitor {
        private TypeSpec.Builder builder;

        protected EnumVisitor(String name) {
            super(Opcodes.ASM9);
            builder = TypeSpec.enumBuilder(name);
        }

        @Override
        public void visit(int version, int access, String name, String signature, String superName,
                String[] interfaces) {
            builder.addModifiers(classModifiers(access));
        }

        @Override
        public FieldVisitor visitField(int access, String name, String descriptor, String signature, Object value) {
            if ((access & 0x4000) != 0) {
                builder.addEnumConstant(name);
            }
            return null;
        }
    }

    private static class RegularVisitor extends ClassVisitor {
        private TypeSpec.Builder builder;

        protected RegularVisitor(String name) {
            super(Opcodes.ASM9);
            builder = TypeSpec.classBuilder(name);
        }

        @Override
        public void visit(int version, int access, String name, String signature, String superName,
                String[] interfaces) {
            builder.addModifiers(classModifiers(access));
            builder.superclass(fromInternalName(superName));
            for (var iface : interfaces) {
                builder.addSuperinterface(fromInternalName(iface));
            }
        }

        @Override
        public MethodVisitor visitMethod(int access, String name, String descriptor, String signature,
                String[] exceptions) {
            if (name.equals("<clinit>")) {
                return null;
            }
            if (name.equals("<init>")) {
                MethodSpec.Builder mBuilder = MethodSpec.constructorBuilder();
                mBuilder.addModifiers(methodModifiers(access));
                methodDescriptor(descriptor, mBuilder, true);
                builder.addMethod(mBuilder.build());
                return null;
            }
            MethodSpec.Builder mBuilder = MethodSpec.methodBuilder(name);
            mBuilder.addModifiers(methodModifiers(access));
            methodDescriptor(descriptor, mBuilder, false);
            methodReturnsSomething(mBuilder, access, descriptor);
            builder.addMethod(mBuilder.build());
            return null;
        }
    }

    private static class InterfaceVisitor extends ClassVisitor {
        private TypeSpec.Builder builder;

        protected InterfaceVisitor(String name) {
            super(Opcodes.ASM9);
            builder = TypeSpec.interfaceBuilder(name);
        }

        @Override
        public void visit(int version, int access, String name, String signature, String superName,
                String[] interfaces) {
            builder.addModifiers(classModifiers(access));
            for (var iface : interfaces) {
                builder.addSuperinterface(fromInternalName(iface));
            }
        }

        @Override
        public MethodVisitor visitMethod(int access, String name, String descriptor, String signature,
                String[] exceptions) {
            MethodSpec.Builder mBuilder = MethodSpec.methodBuilder(name);
            mBuilder.addModifiers(methodModifiers(access));
            methodDescriptor(descriptor, mBuilder, false);
            builder.addMethod(mBuilder.build());
            return null;
        }
    }

    private static class AnnotationVisitor extends ClassVisitor {
        private TypeSpec.Builder builder;

        protected AnnotationVisitor(String name) {
            super(Opcodes.ASM9);
            builder = TypeSpec.classBuilder(name);
        }

        @Override
        public void visit(int version, int access, String name, String signature, String superName,
                String[] interfaces) {
            builder.addModifiers(classModifiers(access));
        }
    }

    public void toFile(File directory) throws IOException {
        TypeSpec classSpec = getSpec();
        String packg = packageFromInternalName(this.body.getClassName());
        JavaFile file = JavaFile.builder(packg, classSpec).build();
        file.writeTo(directory);
    }

    private static final ClassName fromInternalName(String name) {
        String pckg = "";
        ArrayList<String> names = new ArrayList<>();
        while (name.indexOf('/') != -1) {
            int indx = name.indexOf('/');
            if (!pckg.isEmpty()) {
                pckg += ".";
            }
            pckg += name.substring(0, indx);
            name = name.substring(indx + 1);
        }
        while (name.indexOf('$') != -1) {
            int indx = name.indexOf('$');
            names.add(name.substring(0, indx));
            name = name.substring(indx + 1);
        }
        names.add(name);
        String mainName = names.remove(0);
        String[] subNames = names.toArray(String[]::new);
        return ClassName.get(pckg, mainName, subNames);
    }

    private static final String packageFromInternalName(String name) {
        String pckg = "";
        while (name.indexOf('/') != -1) {
            int indx = name.indexOf('/');
            if (!pckg.isEmpty()) {
                pckg += ".";
            }
            pckg += name.substring(0, indx);
            name = name.substring(indx + 1);
        }
        return pckg;
    }

    private static final String nameFromInternalName(String name) {
        while (name.indexOf('/') != -1) {
            int indx = name.indexOf('/');
            name = name.substring(indx + 1);
        }
        while (name.indexOf('$') != -1) {
            int indx = name.indexOf('$');
            name = name.substring(indx + 1);
        }
        return name;
    }

    private static final void methodDescriptor(String descriptor, MethodSpec.Builder builder, boolean isConstructor) {
        assert descriptor.charAt(0) == '(';
        descriptor = descriptor.substring(1);
        String params = descriptor.substring(0, descriptor.indexOf(')'));
        String returns = descriptor.substring(descriptor.indexOf(')') + 1);
        if(!isConstructor) {
            if (returns.charAt(0) == 'V') {
                builder.returns(TypeName.VOID);
            } else {
                builder.returns(typeDescriptor(returns).typeName);
            }
        }
        int idx = 0;
        while (params.length() > 0) {
            var param = typeDescriptor(params);
            builder.addParameter(ParameterSpec.builder(param.typeName, "arg" + idx).build());
            params = params.substring(param.len);
            idx += 1;
        }
    }

    private static record TypeNameAndInt(TypeName typeName, int len) {
    }

    private static final TypeNameAndInt typeDescriptor(String descriptor) {
        switch (descriptor.charAt(0)) {
            case 'B':
                return new TypeNameAndInt(TypeName.BYTE, 1);
            case 'C':
                return new TypeNameAndInt(TypeName.CHAR, 1);
            case 'D':
                return new TypeNameAndInt(TypeName.DOUBLE, 1);
            case 'F':
                return new TypeNameAndInt(TypeName.FLOAT, 1);
            case 'I':
                return new TypeNameAndInt(TypeName.INT, 1);
            case 'J':
                return new TypeNameAndInt(TypeName.LONG, 1);
            case 'S':
                return new TypeNameAndInt(TypeName.SHORT, 1);
            case 'Z':
                return new TypeNameAndInt(TypeName.BOOLEAN, 1);
            case 'L':
                int index = descriptor.indexOf(';');
                return new TypeNameAndInt(fromInternalName(descriptor.substring(1, index)), index + 1);
            case '[':
                var inner = typeDescriptor(descriptor.substring(1));
                return new TypeNameAndInt(ArrayTypeName.of(inner.typeName), inner.len + 1);
            default:
                throw new RuntimeException("invalid descriptor: " + descriptor);
        }
    }

    private static final Modifier[] classModifiers(int access) {
        ArrayList<Modifier> modifiers = new ArrayList<>();
        if ((access & 0x0001) != 0) {
            modifiers.add(Modifier.PUBLIC);
        }
        if ((access & 0x0010) != 0) {
            modifiers.add(Modifier.FINAL);
        }
        if ((access & 0x0400) != 0 && (access & 0x0200) == 0) {
            modifiers.add(Modifier.ABSTRACT);
        }
        return modifiers.toArray(Modifier[]::new);
    }

    private static final Modifier[] fieldModifiers(int access) {
        ArrayList<Modifier> modifiers = new ArrayList<>();
        if ((access & 0x0001) != 0) {
            modifiers.add(Modifier.PUBLIC);
        }
        if ((access & 0x0002) != 0) {
            modifiers.add(Modifier.PRIVATE);
        }
        if ((access & 0x0004) != 0) {
            modifiers.add(Modifier.PROTECTED);
        }
        if ((access & 0x0008) != 0) {
            modifiers.add(Modifier.STATIC);
        }
        if ((access & 0x0010) != 0) {
            modifiers.add(Modifier.FINAL);
        }
        if ((access & 0x0040) != 0) {
            modifiers.add(Modifier.VOLATILE);
        }
        if ((access & 0x0080) != 0) {
            modifiers.add(Modifier.TRANSIENT);
        }
        return modifiers.toArray(Modifier[]::new);
    }

    private static final Modifier[] methodModifiers(int access) {
        ArrayList<Modifier> modifiers = new ArrayList<>();
        if ((access & 0x0001) != 0) {
            modifiers.add(Modifier.PUBLIC);
        }
        if ((access & 0x0002) != 0) {
            modifiers.add(Modifier.PRIVATE);
        }
        if ((access & 0x0004) != 0) {
            modifiers.add(Modifier.PROTECTED);
        }
        if ((access & 0x0008) != 0) {
            modifiers.add(Modifier.STATIC);
        }
        if ((access & 0x0010) != 0) {
            modifiers.add(Modifier.FINAL);
        }
        if ((access & 0x0020) != 0) {
            modifiers.add(Modifier.SYNCHRONIZED);
        }
        if ((access & 0x0100) != 0) {
            modifiers.add(Modifier.NATIVE);
        }
        if ((access & 0x0400) != 0) {
            modifiers.add(Modifier.ABSTRACT);
        }
        if ((access & 0x0800) != 0) {
            modifiers.add(Modifier.STRICTFP);
        }
        return modifiers.toArray(Modifier[]::new);
    }

    private static final void methodReturnsSomething(MethodSpec.Builder builder, int access, String descriptor) {
        if((access & 0x0400) != 0) {
            return;
        }
        String part = descriptor.substring(descriptor.indexOf(')') + 1);
        if(part.charAt(0) == 'V') {
            return;
        }
        var typeName = typeDescriptor(part).typeName;
        if(typeName.equals(TypeName.BOOLEAN)) {
            builder.addCode(CodeBlock.builder().addStatement("return false").build());
        } else if(typeName.equals(TypeName.BYTE)) {
            builder.addCode(CodeBlock.builder().addStatement("return (byte)0").build());
        } else if(typeName.equals(TypeName.CHAR)) {
            builder.addCode(CodeBlock.builder().addStatement("return '_'").build());
        } else if(typeName.equals(TypeName.DOUBLE)) {
            builder.addCode(CodeBlock.builder().addStatement("return 0.0D").build());
        } else if(typeName.equals(TypeName.FLOAT)) {
            builder.addCode(CodeBlock.builder().addStatement("return 0.0F").build());
        } else if(typeName.equals(TypeName.INT)) {
            builder.addCode(CodeBlock.builder().addStatement("return 0").build());
        } else if(typeName.equals(TypeName.LONG)) {
            builder.addCode(CodeBlock.builder().addStatement("return 0L").build());
        } else if(typeName.equals(TypeName.SHORT)) {
            builder.addCode(CodeBlock.builder().addStatement("return (short)0").build());
        } else {
            builder.addCode(CodeBlock.builder().addStatement("return null").build());
        }
    }

}
