package org.frc5572.robotools;

import static com.google.testing.compile.CompilationSubject.assertThat;
import static com.google.testing.compile.Compiler.javac;
import javax.tools.JavaFileObject;
import org.junit.Test;
import com.google.testing.compile.Compilation;
import com.google.testing.compile.JavaFileObjects;

/** Tests for {@code @TypeStateBuilder} */
public class TypeStateBuilderTest {

    // @formatter:off
    private static final JavaFileObject ANN_TYPESTATE_BUILDER = JavaFileObjects.forSourceLines(
        "frc.robot.util.typestate.TypeStateBuilder",
        "package frc.robot.util.typestate;",
        "import java.lang.annotation.*;",
        "@Retention(RetentionPolicy.CLASS)",
        "@Target(ElementType.CONSTRUCTOR)",
        "public @interface TypeStateBuilder {",
        "    String value() default \"\";",
        "    boolean linear() default false;",
        "}"
    );
    private static final JavaFileObject ANN_INIT_FIELD = JavaFileObjects.forSourceLines(
        "frc.robot.util.typestate.InitField",
        "package frc.robot.util.typestate;",
        "import java.lang.annotation.*;",
        "@Retention(RetentionPolicy.CLASS)",
        "@Target(ElementType.PARAMETER)",
        "public @interface InitField {}"
    );
    private static final JavaFileObject ANN_REQUIRED_FIELD = JavaFileObjects.forSourceLines(
        "frc.robot.util.typestate.RequiredField",
        "package frc.robot.util.typestate;",
        "import java.lang.annotation.*;",
        "@Retention(RetentionPolicy.CLASS)",
        "@Target(ElementType.PARAMETER)",
        "public @interface RequiredField {",
        "    AltMethod[] alt() default {};",
        "}"
    );
    private static final JavaFileObject ANN_OPTIONAL_FIELD = JavaFileObjects.forSourceLines(
        "frc.robot.util.typestate.OptionalField",
        "package frc.robot.util.typestate;",
        "import java.lang.annotation.*;",
        "@Retention(RetentionPolicy.CLASS)",
        "@Target(ElementType.PARAMETER)",
        "public @interface OptionalField {",
        "    String value();",
        "    AltMethod[] alt() default {};",
        "}"
    );
    private static final JavaFileObject ANN_ALT_METHOD = JavaFileObjects.forSourceLines(
        "frc.robot.util.typestate.AltMethod",
        "package frc.robot.util.typestate;",
        "public @interface AltMethod {",
        "    Class<?> type();",
        "    String parameter_name() default \"\";",
        "    String value();",
        "}"
    );
    // @formatter:on

    private Compilation compile(JavaFileObject input) {
        return javac().withProcessors(new RobotProcessor()).compile(ANN_TYPESTATE_BUILDER,
            ANN_INIT_FIELD, ANN_REQUIRED_FIELD, ANN_OPTIONAL_FIELD, ANN_ALT_METHOD, input);
    }

    /** No value() -> builder name is {ClassName}Builder. */
    @Test
    public void generatesBuilderWithDefaultName() {
        // @formatter:off
        JavaFileObject input = JavaFileObjects.forSourceLines(
            "frc.robot.util.tunable.Color",
            "package frc.robot.util.tunable;",
            "import frc.robot.util.typestate.*;",
            "public class Color {",
            "    public final int r;",
            "    @TypeStateBuilder",
            "    public Color(@RequiredField int r) { this.r = r; }",
            "}"
        );
        // @formatter:on

        Compilation compilation = compile(input);

        assertThat(compilation).succeeded();
        assertThat(compilation).generatedSourceFile("frc/robot/util/tunable/ColorBuilder");
    }

    /** value() overrides the builder name. */
    @Test
    public void generatesBuilderWithCustomName() {
        // @formatter:off
        JavaFileObject input = JavaFileObjects.forSourceLines(
            "frc.robot.util.tunable.Config",
            "package frc.robot.util.tunable;",
            "import frc.robot.util.typestate.*;",
            "public class Config {",
            "    public final double value;",
            "    @TypeStateBuilder(\"SpecialBuilder\")",
            "    public Config(@RequiredField double value) { this.value = value; }",
            "}"
        );
        // @formatter:on

        Compilation compilation = compile(input);

        assertThat(compilation).succeeded();
        assertThat(compilation).generatedSourceFile("frc/robot/util/tunable/SpecialBuilder");
    }

    /**
     * Each @RequiredField becomes a setter; finish() appears only when all are set.
     */
    @Test
    public void requiredFieldsGenerateSettersThenFinish() {
        // @formatter:off
        JavaFileObject input = JavaFileObjects.forSourceLines(
            "frc.robot.util.tunable.Point",
            "package frc.robot.util.tunable;",
            "import frc.robot.util.typestate.*;",
            "public class Point {",
            "    public final int x, y;",
            "    @TypeStateBuilder",
            "    public Point(@InitField String label, @RequiredField int x, @RequiredField int y) {",
            "        this.x = x; this.y = y;",
            "    }",
            "}"
        );
        // @formatter:on

        Compilation compilation = compile(input);

        assertThat(compilation).succeeded();
        // Initial builder exposes setters for all required fields
        assertThat(compilation).generatedSourceFile("frc/robot/util/tunable/PointBuilder")
            .contentsAsUtf8String().containsMatch("PointBuilder10 x\\(");
        assertThat(compilation).generatedSourceFile("frc/robot/util/tunable/PointBuilder")
            .contentsAsUtf8String().containsMatch("PointBuilder01 y\\(");
        // finish() only available once both are set
        assertThat(compilation).generatedSourceFile("frc/robot/util/tunable/PointBuilder")
            .contentsAsUtf8String().containsMatch("Point finish\\(");
    }

    /**
     * @OptionalField gets a setter at every stage and defaults on the no-arg constructor.
     */
    @Test
    public void optionalFieldHasSetterAndDefault() {
        // @formatter:off
        JavaFileObject input = JavaFileObjects.forSourceLines(
            "frc.robot.util.tunable.Gains",
            "package frc.robot.util.tunable;",
            "import frc.robot.util.typestate.*;",
            "public class Gains {",
            "    public final double kP, kI;",
            "    @TypeStateBuilder",
            "    public Gains(@InitField String name, @RequiredField double kP, @OptionalField(\"0.0\") double kI) {",
            "        this.kP = kP; this.kI = kI;",
            "    }",
            "}"
        );
        // @formatter:on

        Compilation compilation = compile(input);

        assertThat(compilation).succeeded();
        // finish() available on the state where kP is set
        assertThat(compilation).generatedSourceFile("frc/robot/util/tunable/GainsBuilder")
            .contentsAsUtf8String().containsMatch("Gains finish\\(");
        // kI setter present at the initial state
        assertThat(compilation).generatedSourceFile("frc/robot/util/tunable/GainsBuilder")
            .contentsAsUtf8String().containsMatch("GainsBuilder kI\\(");
    }

    /**
     * linear=true exposes only the next required field setter at each step.
     */
    @Test
    public void linearBuilderExposesOnlyNextStep() {
        // @formatter:off
        JavaFileObject input = JavaFileObjects.forSourceLines(
            "frc.robot.util.tunable.Step",
            "package frc.robot.util.tunable;",
            "import frc.robot.util.typestate.*;",
            "public class Step {",
            "    public final int a, b;",
            "    @TypeStateBuilder(linear = true)",
            "    public Step(@RequiredField int a, @RequiredField int b) {",
            "        this.a = a; this.b = b;",
            "    }",
            "}"
        );
        // @formatter:on

        Compilation compilation = compile(input);

        assertThat(compilation).succeeded();
        // Initial builder only exposes 'a', not 'b' yet
        assertThat(compilation).generatedSourceFile("frc/robot/util/tunable/StepBuilder")
            .contentsAsUtf8String().containsMatch("StepBuilder10 a\\(");
        assertThat(compilation).generatedSourceFile("frc/robot/util/tunable/StepBuilder")
            .contentsAsUtf8String().doesNotContainMatch("StepBuilder0. b\\(");
    }
}
