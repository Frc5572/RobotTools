package org.frc5572.robotools;

import static com.google.testing.compile.CompilationSubject.assertThat;
import static com.google.testing.compile.Compiler.javac;
import javax.tools.JavaFileObject;
import org.junit.Test;
import com.google.testing.compile.Compilation;
import com.google.testing.compile.JavaFileObjects;

/** Test for {@code @GenerateEmptyIO} */
public class GenerateEmptyIOTest {

    // @formatter:off
    private static final JavaFileObject ANNOTATION = JavaFileObjects.forSourceLines(
        "frc.robot.util.GenerateEmptyIO",
        "package frc.robot.util;",
        "import java.lang.annotation.*;",
        "@Target(ElementType.TYPE)",
        "@Retention(RetentionPolicy.SOURCE)",
        "public @interface GenerateEmptyIO {",
        "    Class<?>[] value() default {};",
        "}"
    );
    // @formatter:on

    /** No-arg case */
    @Test
    public void generatesEmptyClassForSimpleInterface() {
        // @formatter:off
        JavaFileObject input = JavaFileObjects.forSourceLines(
            "frc.robot.util.ExampleIO",
            "package frc.robot.util;",
            "@GenerateEmptyIO",
            "public interface ExampleIO {",
            "    void setMotorVoltage(double voltage);",
            "    void stop();",
            "}"
        );
        // @formatter:on

        Compilation compilation =
            javac().withProcessors(new RobotProcessor()).compile(ANNOTATION, input);

        assertThat(compilation).succeeded();
        assertThat(compilation).generatedSourceFile("frc/robot/util/ExampleIOEmpty");
    }

    /** Single constructor arg */
    @Test
    public void generatesConstructorWithSingleArg() {
        // @formatter:off
        JavaFileObject input = JavaFileObjects.forSourceLines(
            "frc.robot.util.OdometryIO",
            "package frc.robot.util;",
            "@GenerateEmptyIO(Runnable.class)",
            "public interface OdometryIO {",
            "    void updateInputs(Object inputs);",
            "}"
        );
        // @formatter:on

        Compilation compilation =
            javac().withProcessors(new RobotProcessor()).compile(ANNOTATION, input);

        assertThat(compilation).succeeded();
        assertThat(compilation).generatedSourceFile("frc/robot/util/OdometryIOEmpty")
            .contentsAsUtf8String().contains("OdometryIOEmpty(Runnable arg1)");
    }

    /** Multi-arg constructor */
    @Test
    public void generatesConstructorWithMultipleArgs() {
        // @formatter:off
        JavaFileObject input = JavaFileObjects.forSourceLines(
            "frc.robot.util.ModuleIO",
            "package frc.robot.util;",
            "@GenerateEmptyIO({int.class, Runnable.class})",
            "public interface ModuleIO {",
            "    void updateInputs(Object inputs);",
            "    void runDriveOpenLoop(double output);",
            "}"
        );
        // @formatter:on

        Compilation compilation =
            javac().withProcessors(new RobotProcessor()).compile(ANNOTATION, input);

        assertThat(compilation).succeeded();
        assertThat(compilation).generatedSourceFile("frc/robot/util/ModuleIOEmpty")
            .contentsAsUtf8String().contains("ModuleIOEmpty(int arg1, Runnable arg2)");
    }
}
