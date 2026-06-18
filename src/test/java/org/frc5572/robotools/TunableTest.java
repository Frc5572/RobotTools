package org.frc5572.robotools;

import static com.google.testing.compile.CompilationSubject.assertThat;
import static com.google.testing.compile.Compiler.javac;
import static org.junit.Assert.assertTrue;
import javax.tools.JavaFileObject;
import org.junit.Test;
import com.google.testing.compile.Compilation;
import com.google.testing.compile.JavaFileObjects;

/**
 * Tests for the {@code @Tunable} annotation processor.
 *
 * <p>
 * The generated wrappers reference WPILib NetworkTables / SmartDashboard and AdvantageKit types. We
 * provide minimal stubs of that API surface (see {@link #STUBS}) so the generated source actually
 * compiles — letting us assert that the generated code is well-formed in addition to checking its
 * contents.
 */
public class TunableTest {

    // @formatter:off
    private static final JavaFileObject TUNABLE = JavaFileObjects.forSourceLines(
        "frc.robot.util.tunable.Tunable",
        "package frc.robot.util.tunable;",
        "import java.lang.annotation.*;",
        "@Target(ElementType.TYPE)",
        "@Retention(RetentionPolicy.SOURCE)",
        "public @interface Tunable {}"
    );

    /** Minimal stand-ins for the WPILib / AdvantageKit types the generated code references. */
    private static final JavaFileObject[] STUBS = new JavaFileObject[] {
        JavaFileObjects.forSourceLines("edu.wpi.first.math.geometry.Rotation2d",
            "package edu.wpi.first.math.geometry;",
            "public class Rotation2d {",
            "    public double getDegrees() { return 0.0; }",
            "    public static Rotation2d fromDegrees(double degrees) { return new Rotation2d(); }",
            "}"),
        JavaFileObjects.forSourceLines("edu.wpi.first.networktables.Topic",
            "package edu.wpi.first.networktables;",
            "public class Topic {}"),
        JavaFileObjects.forSourceLines("edu.wpi.first.networktables.DoublePublisher",
            "package edu.wpi.first.networktables;",
            "public class DoublePublisher { public void accept(double value) {} }"),
        JavaFileObjects.forSourceLines("edu.wpi.first.networktables.BooleanPublisher",
            "package edu.wpi.first.networktables;",
            "public class BooleanPublisher { public void accept(boolean value) {} }"),
        JavaFileObjects.forSourceLines("edu.wpi.first.networktables.StringPublisher",
            "package edu.wpi.first.networktables;",
            "public class StringPublisher { public void accept(String value) {} }"),
        JavaFileObjects.forSourceLines("edu.wpi.first.networktables.DoubleTopic",
            "package edu.wpi.first.networktables;",
            "public class DoubleTopic extends Topic {",
            "    public DoublePublisher publish() { return new DoublePublisher(); }",
            "}"),
        JavaFileObjects.forSourceLines("edu.wpi.first.networktables.BooleanTopic",
            "package edu.wpi.first.networktables;",
            "public class BooleanTopic extends Topic {",
            "    public BooleanPublisher publish() { return new BooleanPublisher(); }",
            "}"),
        JavaFileObjects.forSourceLines("edu.wpi.first.networktables.StringTopic",
            "package edu.wpi.first.networktables;",
            "public class StringTopic extends Topic {",
            "    public StringPublisher publish() { return new StringPublisher(); }",
            "}"),
        JavaFileObjects.forSourceLines("edu.wpi.first.networktables.NetworkTableValue",
            "package edu.wpi.first.networktables;",
            "public class NetworkTableValue {",
            "    public double getDouble() { return 0.0; }",
            "    public boolean getBoolean() { return false; }",
            "    public String getString() { return \"\"; }",
            "}"),
        JavaFileObjects.forSourceLines("edu.wpi.first.networktables.ValueEventData",
            "package edu.wpi.first.networktables;",
            "public class ValueEventData { public NetworkTableValue value; }"),
        JavaFileObjects.forSourceLines("edu.wpi.first.networktables.NetworkTableEvent",
            "package edu.wpi.first.networktables;",
            "public class NetworkTableEvent {",
            "    public ValueEventData valueData;",
            "    public enum Kind { kValueAll }",
            "}"),
        JavaFileObjects.forSourceLines("edu.wpi.first.networktables.NetworkTableInstance",
            "package edu.wpi.first.networktables;",
            "import java.util.EnumSet;",
            "import java.util.function.Consumer;",
            "public class NetworkTableInstance {",
            "    public static NetworkTableInstance getDefault() { return new NetworkTableInstance(); }",
            "    public DoubleTopic getDoubleTopic(String name) { return new DoubleTopic(); }",
            "    public BooleanTopic getBooleanTopic(String name) { return new BooleanTopic(); }",
            "    public StringTopic getStringTopic(String name) { return new StringTopic(); }",
            "    public int addListener(Topic topic, EnumSet<NetworkTableEvent.Kind> kinds,",
            "        Consumer<NetworkTableEvent> listener) { return 0; }",
            "}"),
        JavaFileObjects.forSourceLines("edu.wpi.first.wpilibj.smartdashboard.SendableChooser",
            "package edu.wpi.first.wpilibj.smartdashboard;",
            "import java.util.function.Consumer;",
            "public class SendableChooser<V> {",
            "    public void addOption(String name, V object) {}",
            "    public void setDefaultOption(String name, V object) {}",
            "    public void onChange(Consumer<V> listener) {}",
            "}"),
        JavaFileObjects.forSourceLines("edu.wpi.first.wpilibj.smartdashboard.SmartDashboard",
            "package edu.wpi.first.wpilibj.smartdashboard;",
            "public class SmartDashboard {",
            "    public static void putData(String key, SendableChooser<?> chooser) {}",
            "}"),
        JavaFileObjects.forSourceLines("org.littletonrobotics.junction.LogTable",
            "package org.littletonrobotics.junction;",
            "public class LogTable {",
            "    public void put(String key, double value) {}",
            "    public void put(String key, boolean value) {}",
            "    public void put(String key, String value) {}",
            "    public double get(String key, double defaultValue) { return defaultValue; }",
            "    public boolean get(String key, boolean defaultValue) { return defaultValue; }",
            "    public String get(String key, String defaultValue) { return defaultValue; }",
            "}"),
        JavaFileObjects.forSourceLines("org.littletonrobotics.junction.inputs.LoggableInputs",
            "package org.littletonrobotics.junction.inputs;",
            "import org.littletonrobotics.junction.LogTable;",
            "public interface LoggableInputs {",
            "    void toLog(LogTable table);",
            "    void fromLog(LogTable table);",
            "}"),
        JavaFileObjects.forSourceLines("org.littletonrobotics.junction.Logger",
            "package org.littletonrobotics.junction;",
            "import org.littletonrobotics.junction.inputs.LoggableInputs;",
            "public class Logger {",
            "    public static void processInputs(String key, LoggableInputs inputs) {}",
            "}"),
    };
    // @formatter:on

    private Compilation compile(JavaFileObject... inputs) {
        JavaFileObject[] all = new JavaFileObject[inputs.length + 1 + STUBS.length];
        all[0] = TUNABLE;
        System.arraycopy(STUBS, 0, all, 1, STUBS.length);
        System.arraycopy(inputs, 0, all, 1 + STUBS.length, inputs.length);
        return javac().withProcessors(new RobotProcessor()).compile(all);
    }

    /** double / boolean / String fields produce the matching NT topics and a logging Inputs. */
    @Test
    public void primitiveAndStringFields() {
        // @formatter:off
        JavaFileObject input = JavaFileObjects.forSourceLines(
            "frc.robot.test.Simple",
            "package frc.robot.test;",
            "import frc.robot.util.tunable.Tunable;",
            "@Tunable",
            "public class Simple {",
            "    public double kP;",
            "    public boolean enabled;",
            "    public String label;",
            "    public Simple() {}",
            "}"
        );
        // @formatter:on

        Compilation c = compile(input);
        var gen = assertThat(c).generatedSourceFile("frc/robot/test/SimpleTunable")
            .contentsAsUtf8String();
        gen.contains("getDoubleTopic(name + \"/kP\")");
        gen.contains("getBooleanTopic(name + \"/enabled\")");
        gen.contains("getStringTopic(name + \"/label\")");
        gen.contains("ev.valueData.value.getDouble()");
        gen.contains("this.isDirty = true");
        gen.contains("public Simple get()");
        gen.contains("void ifDirty(");
        gen.contains("Logger.processInputs(name, inputs)");
        gen.contains("class Inputs implements LoggableInputs");
        gen.contains("table.put(\"kP\", obj.kP)");
        gen.contains("obj.kP = table.get(\"kP\", obj.kP)");
    }

    /** enum fields go through a SendableChooser; Rotation2d is exposed as degrees. */
    @Test
    public void enumAndRotationFields() {
        // @formatter:off
        JavaFileObject input = JavaFileObjects.forSourceLines(
            "frc.robot.test.Fancy",
            "package frc.robot.test;",
            "import frc.robot.util.tunable.Tunable;",
            "import edu.wpi.first.math.geometry.Rotation2d;",
            "@Tunable",
            "public class Fancy {",
            "    public enum Mode { A, B }",
            "    public Mode mode;",
            "    public Rotation2d angle;",
            "    public Fancy() {}",
            "}"
        );
        // @formatter:on

        Compilation c = compile(input);
        var gen =
            assertThat(c).generatedSourceFile("frc/robot/test/FancyTunable").contentsAsUtf8String();
        gen.contains("new SendableChooser<>()");
        gen.contains("modeChooser.addOption(v.name(), v)");
        gen.contains("SmartDashboard.putData(name + \"/mode\", modeChooser)");
        gen.contains("Rotation2d.fromDegrees(ev.valueData.value.getDouble())");
        gen.contains("getDoubleTopic(name + \"/angle\")");
        gen.contains("obj.angle.getDegrees()");
        gen.contains(".name()");
    }

    /** Nested plain (non-@Tunable) objects are flattened into the outer wrapper. */
    @Test
    public void nestedCompoundFieldsAreFlattened() {
        // @formatter:off
        JavaFileObject inner = JavaFileObjects.forSourceLines(
            "frc.robot.test.Inner",
            "package frc.robot.test;",
            "class Inner {",
            "    public double kP;",
            "    public double kD;",
            "}"
        );
        JavaFileObject outer = JavaFileObjects.forSourceLines(
            "frc.robot.test.Outer",
            "package frc.robot.test;",
            "import frc.robot.util.tunable.Tunable;",
            "@Tunable",
            "public class Outer {",
            "    public Inner pid;",
            "    public Outer() {}",
            "}"
        );
        // @formatter:on

        Compilation c = compile(inner, outer);
        var gen =
            assertThat(c).generatedSourceFile("frc/robot/test/OuterTunable").contentsAsUtf8String();
        gen.contains("getDoubleTopic(name + \"/pid/kP\")");
        gen.contains("obj.pid.kP = ev.valueData.value.getDouble()");
        gen.contains("table.put(\"pid/kD\", obj.pid.kD)");

        // The inner type must NOT get its own wrapper.
        assertTrue("Inner should not produce a separate *Tunable wrapper",
            c.generatedSourceFiles().stream().noneMatch(f -> f.getName().contains("InnerTunable")));
    }

    /** static / final / private fields are skipped (cannot be tuned). */
    @Test
    public void skipsStaticFinalAndPrivateFields() {
        // @formatter:off
        JavaFileObject input = JavaFileObjects.forSourceLines(
            "frc.robot.test.Skips",
            "package frc.robot.test;",
            "import frc.robot.util.tunable.Tunable;",
            "@Tunable",
            "public class Skips {",
            "    public static double constant;",
            "    public final double fixed = 1.0;",
            "    private double hidden;",
            "    public double tuned;",
            "    public Skips() {}",
            "}"
        );
        // @formatter:on

        Compilation c = compile(input);
        var gen =
            assertThat(c).generatedSourceFile("frc/robot/test/SkipsTunable").contentsAsUtf8String();
        gen.contains("name + \"/tuned\"");
        gen.doesNotContain("/constant");
        gen.doesNotContain("/fixed");
        gen.doesNotContain("/hidden");
    }

    /** An unsupported public field type is a compile error. */
    @Test
    public void unsupportedFieldTypeIsAnError() {
        // @formatter:off
        JavaFileObject input = JavaFileObjects.forSourceLines(
            "frc.robot.test.Bad",
            "package frc.robot.test;",
            "import frc.robot.util.tunable.Tunable;",
            "@Tunable",
            "public class Bad {",
            "    public int count;",
            "    public Bad() {}",
            "}"
        );
        // @formatter:on

        Compilation c = compile(input);
        assertThat(c).hadErrorContaining("does not support");
    }
}
