package org.frc5572.robotools;

import java.util.Arrays;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.Modifier;
import javax.lang.model.type.TypeMirror;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;

/** Template builder for TypeState Builders */
public class TypeStateBuilder {

    private final Fields[] permutations;
    private final int num_permutable_fields;

    /** Template builder for TypeState Builders */
    public TypeStateBuilder(String name, Field[] fields_, TypeMirror result) {
        num_permutable_fields =
            (int) Arrays.stream(fields_).filter((x) -> !(x instanceof InitField)).count();
        permutations = new Fields[1 << num_permutable_fields];
        boolean[] start = new boolean[num_permutable_fields];
        Fields fields = new Fields(name, fields_, start, result);
        while (true) {
            int index = encodePermutationAsInt(start);
            permutations[index] = fields;
            start = Arrays.copyOf(start, start.length);
            if (!advance(start)) {
                break;
            }
            fields = new Fields(name, fields_, start, result);
        }
    }

    /** Create typestate builders and write them to a typespec */
    public void apply(TypeSpec.Builder builder) {
        Fields base = permutations[encodePermutationAsInt(new boolean[num_permutable_fields])];
        base.write_fields(builder);
        base.write_constructor(builder, true);
        base.write_methods(builder, permutations);
        for (int i = 1; i < permutations.length; i++) {
            if (permutations[i] == null) {
                continue;
            }
            TypeSpec.Builder subBuilder = TypeSpec.classBuilder(permutations[i].class_name())
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL);
            permutations[i].write_fields(subBuilder);
            permutations[i].write_constructor(subBuilder, false);
            permutations[i].write_methods(subBuilder, permutations);
            builder.addType(subBuilder.build());
        }
    }

    private static boolean advance(boolean[] permutation) {
        for (int i = 0; i < permutation.length; i++) {
            if (!permutation[i]) {
                permutation[i] = true;
                return true;
            }
        }
        return false;
    }

    /** Base class for fields */
    public static class Field {
        /** Field type */
        public final TypeMirror type;
        /** Field name */
        public final String name;

        /** Base class for fields */
        public Field(TypeMirror type, String name) {
            this.type = type;
            this.name = name;
        }
    }

    /** Field that must be provided when creating a builder */
    public static class InitField extends Field {
        /** Field that must be provided when creating a builder */
        public InitField(TypeMirror type, String name) {
            super(type, name);
        }
    }

    /** A non-init field */
    public static class MethodField extends Field {
        /** An alternative method for fulfilling this field. */
        public final AltMethod alt;

        /** A non-init field */
        public MethodField(TypeMirror type, String name, AltMethod alt) {
            super(type, name);
            this.alt = alt;
        }

        /** A non-init field */
        public MethodField(TypeMirror type, String name) {
            this(type, name, null);
        }
    }

    /** A field that is required to finish the builder. */
    public static class RequiredField extends MethodField {

        /** A field that is required to finish the builder. */
        public RequiredField(TypeMirror type, String name, AltMethod alt) {
            super(type, name, alt);
        }

        /** A field that is required to finish the builder. */
        public RequiredField(TypeMirror type, String name) {
            super(type, name);
        }

        /** A field that is required to finish the builder. */
        public static RequiredField fromAnnotation(TypeMirror type, String name,
            AnnotationMirror mirror) {
            AltMethod alt = null;
            for (var ev : mirror.getElementValues().entrySet()) {
                if (ev.getKey().getSimpleName().toString().equals("alt")) {
                    AnnotationMirror altMirror =
                        ev.getValue().accept(new AnnotationMirrorVisitor(), null);
                    alt = AltMethod.fromAnnotation(altMirror, name);
                }
            }
            return new RequiredField(type, name, alt);
        }
    }


    /** A field that has a default in case it is not specified. */
    public static class OptionalField extends MethodField {
        /** Java expression that provides the default value. */
        public final String default_code;

        /** A field that has a default in case it is not specified. */
        public OptionalField(TypeMirror type, String name, AltMethod alt, String default_code) {
            super(type, name, alt);
            this.default_code = default_code;
        }

        /** A field that has a default in case it is not specified. */
        public OptionalField(TypeMirror type, String name, String default_code) {
            super(type, name);
            this.default_code = default_code;
        }

        /** A field that has a default in case it is not specified. */
        public static OptionalField fromAnnotation(TypeMirror type, String name,
            AnnotationMirror mirror) {
            String defaultCode = "";
            AltMethod alt = null;
            for (var ev : mirror.getElementValues().entrySet()) {
                if (ev.getKey().getSimpleName().toString().equals("value")) {
                    defaultCode = ev.getValue().accept(new StringVisitor(), null);
                } else if (ev.getKey().getSimpleName().toString().equals("alt")) {
                    AnnotationMirror altMirror =
                        ev.getValue().accept(new AnnotationMirrorVisitor(), null);
                    alt = AltMethod.fromAnnotation(altMirror, name);
                }
            }
            return new OptionalField(type, name, alt, defaultCode);
        }
    }

    /** Alternative method for a field. */
    public static record AltMethod(TypeMirror type, String parameterName, String code) {
        /** Alternative method for a field. */
        public static AltMethod fromAnnotation(AnnotationMirror mirror, String defaultName) {
            if (mirror == null) {
                System.out.println("annotation is null");
                return null;
            }

            if (!mirror.getAnnotationType().asElement().getSimpleName().toString()
                .equals("AltMethod")) {
                System.out.println("annotation name doesn't match "
                    + mirror.getAnnotationType().asElement().getSimpleName().toString());
                return null;
            }
            TypeMirror type = null;
            String parameterName = defaultName;
            String code = null;

            for (var ev : mirror.getElementValues().entrySet()) {
                if (ev.getKey().getSimpleName().toString().equals("type")) {
                    type = ev.getValue().accept(new ClassVisitor(), null);
                } else if (ev.getKey().getSimpleName().toString().equals("parameter_name")) {
                    parameterName = ev.getValue().accept(new StringVisitor(), null);
                } else if (ev.getKey().getSimpleName().toString().equals("value")) {
                    code = ev.getValue().accept(new StringVisitor(), null);
                }
            }

            if (type == null) {
                System.out.println("Missing type");
                return null;
            }
            if (code == null) {
                System.out.println("Missing code");
                return null;
            }

            return new AltMethod(type, parameterName, code);
        }
    }


    /** A specific permutation of fields. */
    public static record Fields(String name, Field[] fields, boolean[] permutation,
        TypeMirror result) {
        /** A unique class name */
        public String class_name() {
            StringBuilder sb = new StringBuilder(name);
            for (int i = 0; i < permutation.length; i++) {
                sb.append(permutation[i] ? 1 : 0);
            }
            return sb.toString();
        }

        /** A unique class name */
        public TypeName type_name() {
            return ClassName.get("", class_name());
        }

        /** True if all required fields are filled. */
        public boolean could_finish() {
            int j = 0;
            for (int i = 0; i < fields.length; i++) {
                if (fields[i] instanceof MethodField) {
                    if (fields[i] instanceof RequiredField) {
                        if (!permutation[j]) {
                            return false;
                        }
                    }
                    j++;
                }
            }
            return true;
        }

        /** True if all fields are filled. */
        public boolean is_full() {
            for (int i = 0; i < permutation.length; i++) {
                if (!permutation[i]) {
                    return false;
                }
            }
            return true;
        }

        /** Get the permutation if a given index is additionally filled. */
        public boolean[] next_permutation(int index) {
            boolean[] next_ = new boolean[permutation.length];
            System.arraycopy(permutation, 0, next_, 0, permutation.length);
            next_[index] = true;
            return next_;
        }

        /** Write constructor to typespec builder */
        public void write_constructor(TypeSpec.Builder builder, boolean is_public) {
            var constructor = MethodSpec.constructorBuilder()
                .addModifiers(is_public ? Modifier.PUBLIC : Modifier.PRIVATE);
            int j = 0;
            for (int i = 0; i < fields.length; i++) {
                if (fields[i] instanceof MethodField) {
                    if (!permutation[j++]) {
                        continue;
                    }
                }
                constructor.addParameter(TypeName.get(this.fields[i].type),
                    this.fields[i].name + "_");
                constructor
                    .addCode("this." + this.fields[i].name + "_ = " + this.fields[i].name + "_;\n");
            }
            builder.addMethod(constructor.build());
        }

        /** Write fields to typespec builder */
        public void write_fields(TypeSpec.Builder builder) {
            int j = 0;
            for (int i = 0; i < fields.length; i++) {
                if (fields[i] instanceof MethodField) {
                    if (!permutation[j++]) {
                        continue;
                    }
                }
                builder.addField(FieldSpec.builder(TypeName.get(fields[i].type),
                    fields[i].name + "_", Modifier.PRIVATE, Modifier.FINAL).build());
            }
        }

        /** Write method to typespec builder */
        private void write_method(TypeSpec.Builder builder, int index, MethodField field,
            TypeName result) {
            var method =
                MethodSpec.methodBuilder(field.name).addModifiers(Modifier.PUBLIC, Modifier.FINAL)
                    .returns(result).addParameter(TypeName.get(field.type), field.name + "_");
            method.addCode("return new $T(", result);
            int j = 0;
            boolean is_first = true;
            for (int i = 0; i < fields.length; i++) {
                if (i == index) {
                    if (!is_first) {
                        method.addCode(", ");
                    }
                    method.addCode(field.name + "_");
                    is_first = false;
                }
                if (fields[i] instanceof MethodField) {
                    if (!permutation[j++]) {
                        continue;
                    }
                }
                if (!is_first) {
                    method.addCode(", ");
                }
                method.addCode("this." + fields[i].name + "_");
                is_first = false;
            }
            method.addCode(");");
            builder.addMethod(method.build());
            if (field.alt != null) {
                method = MethodSpec.methodBuilder(field.name)
                    .addModifiers(Modifier.PUBLIC, Modifier.FINAL).returns(result)
                    .addParameter(TypeName.get(field.alt.type), field.alt.parameterName);
                method.addCode("return this." + field.name + "(" + field.alt.code + ");");
                builder.addMethod(method.build());
            }
        }

        /** Write method to complete builder to typespec builder */
        private void write_finish(TypeSpec.Builder builder) {
            var method = MethodSpec.methodBuilder("finish")
                .addModifiers(Modifier.PUBLIC, Modifier.FINAL).returns(TypeName.get(result));
            method.addCode("return new $T(", TypeName.get(result));
            int j = 0;
            for (int i = 0; i < fields.length; i++) {
                if (i != 0) {
                    method.addCode(", ");
                }
                if (fields[i] instanceof OptionalField optional_field) {
                    if (!permutation[j++]) {
                        method.addCode(optional_field.default_code);
                        continue;
                    }
                }
                if (fields[i] instanceof RequiredField) {
                    j++;
                }
                method.addCode("this." + fields[i].name + "_");
            }
            method.addCode(");");
            builder.addMethod(method.build());
        }

        /** Write methods to advance builder to typespec builder */
        public void write_methods(TypeSpec.Builder builder, Fields[] permutations) {
            int j = 0;
            for (int i = 0; i < this.fields.length; i++) {
                if (fields[i] instanceof MethodField method_field) {
                    if (!permutation[j]) {
                        boolean[] next = next_permutation(j);
                        int next_index = encodePermutationAsInt(next);
                        TypeName result = permutations[next_index].type_name();
                        write_method(builder, i, method_field, result);
                        break;
                    }
                    j++;
                }
            }
            if (could_finish()) {
                write_finish(builder);
            }
        }
    }

    private static int encodePermutationAsInt(boolean[] permutation) {
        int res = 0;
        for (int i = 0; i < permutation.length; i++) {
            if (permutation[i]) {
                res += 1;
            }
            res <<= 1;
        }
        return res >> 1;
    }

}
