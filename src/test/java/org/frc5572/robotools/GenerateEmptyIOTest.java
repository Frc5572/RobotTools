package org.frc5572.robotools;

import static com.google.testing.compile.CompilationSubject.assertThat;
import static com.google.testing.compile.Compiler.javac;

import com.google.testing.compile.Compilation;
import com.google.testing.compile.JavaFileObjects;
import javax.tools.JavaFileObject;
import org.junit.Test;

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

    /** Test simple execution */
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
}
