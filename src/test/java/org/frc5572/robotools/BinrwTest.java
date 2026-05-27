package org.frc5572.robotools;

import static com.google.testing.compile.CompilationSubject.assertThat;
import static com.google.testing.compile.Compiler.javac;
import javax.tools.JavaFileObject;
import org.junit.Test;
import com.google.testing.compile.Compilation;
import com.google.testing.compile.JavaFileObjects;

/** Tests for {@code @Binrw} annotation processor. */
public class BinrwTest {

    // @formatter:off
    private static final JavaFileObject BINRW = JavaFileObjects.forSourceLines(
        "frc.robot.util.binrw.Binrw",
        "package frc.robot.util.binrw;",
        "import java.lang.annotation.*;",
        "@Target(ElementType.TYPE)",
        "@Retention(RetentionPolicy.SOURCE)",
        "public @interface Binrw {",
        "    Class<?> value() default void.class;",
        "}"
    );

    private static final JavaFileObject BRW_IGNORE = JavaFileObjects.forSourceLines(
        "frc.robot.util.binrw.BrwIgnore",
        "package frc.robot.util.binrw;",
        "import java.lang.annotation.*;",
        "@Target({ElementType.FIELD, ElementType.RECORD_COMPONENT})",
        "@Retention(RetentionPolicy.SOURCE)",
        "public @interface BrwIgnore {}"
    );
    // @formatter:on

    private Compilation compile(JavaFileObject... inputs) {
        JavaFileObject[] all = new JavaFileObject[inputs.length + 2];
        all[0] = BINRW;
        all[1] = BRW_IGNORE;
        System.arraycopy(inputs, 0, all, 2, inputs.length);
        return javac().withProcessors(new RobotProcessor()).compile(all);
    }

    /** Primitive and String fields generate reader/writer with correct method calls. */
    @Test
    public void primitiveAndStringFields() {
        // @formatter:off
        JavaFileObject input = JavaFileObjects.forSourceLines(
            "frc.robot.test.Dog",
            "package frc.robot.test;",
            "import frc.robot.util.binrw.Binrw;",
            "@Binrw",
            "public class Dog {",
            "    public int boneCount;",
            "    public double weight;",
            "    public String name;",
            "    public Dog(int boneCount, double weight, String name) {}",
            "}"
        );
        // @formatter:on

        Compilation c = compile(input);
        assertThat(c).succeeded();
        assertThat(c).generatedSourceFile("frc/robot/test/DogReader");
        assertThat(c).generatedSourceFile("frc/robot/test/DogWriter");
        assertThat(c).generatedSourceFile("frc/robot/test/DogReader").contentsAsUtf8String()
            .contains("stream.readInt()");
        assertThat(c).generatedSourceFile("frc/robot/test/DogReader").contentsAsUtf8String()
            .contains("stream.readDouble()");
        assertThat(c).generatedSourceFile("frc/robot/test/DogReader").contentsAsUtf8String()
            .contains("stream.readUTF()");
        assertThat(c).generatedSourceFile("frc/robot/test/DogWriter").contentsAsUtf8String()
            .contains("stream.writeInt(obj.boneCount)");
        assertThat(c).generatedSourceFile("frc/robot/test/DogWriter").contentsAsUtf8String()
            .contains("stream.writeDouble(obj.weight)");
        assertThat(c).generatedSourceFile("frc/robot/test/DogWriter").contentsAsUtf8String()
            .contains("stream.writeUTF(obj.name)");
    }

    /** Primitive array fields write length then elements. */
    @Test
    public void primitiveArrayField() {
        // @formatter:off
        JavaFileObject input = JavaFileObjects.forSourceLines(
            "frc.robot.test.Wave",
            "package frc.robot.test;",
            "import frc.robot.util.binrw.Binrw;",
            "@Binrw",
            "public class Wave {",
            "    public double[] samples;",
            "    public Wave(double[] samples) {}",
            "}"
        );
        // @formatter:on

        Compilation c = compile(input);
        assertThat(c).succeeded();
        assertThat(c).generatedSourceFile("frc/robot/test/WaveReader").contentsAsUtf8String()
            .contains("readInt()");
        assertThat(c).generatedSourceFile("frc/robot/test/WaveReader").contentsAsUtf8String()
            .contains("new double[");
        assertThat(c).generatedSourceFile("frc/robot/test/WaveReader").contentsAsUtf8String()
            .contains("readDouble()");
        assertThat(c).generatedSourceFile("frc/robot/test/WaveWriter").contentsAsUtf8String()
            .contains("writeInt(obj.samples.length)");
        assertThat(c).generatedSourceFile("frc/robot/test/WaveWriter").contentsAsUtf8String()
            .contains("writeDouble(");
    }

    /** List fields write size then elements. */
    @Test
    public void listField() {
        // @formatter:off
        JavaFileObject input = JavaFileObjects.forSourceLines(
            "frc.robot.test.Basket",
            "package frc.robot.test;",
            "import frc.robot.util.binrw.Binrw;",
            "import java.util.List;",
            "@Binrw",
            "public class Basket {",
            "    public List<String> items;",
            "    public Basket(List<String> items) {}",
            "}"
        );
        // @formatter:on

        Compilation c = compile(input);
        assertThat(c).succeeded();
        assertThat(c).generatedSourceFile("frc/robot/test/BasketReader").contentsAsUtf8String()
            .contains("new ArrayList<>");
        assertThat(c).generatedSourceFile("frc/robot/test/BasketReader").contentsAsUtf8String()
            .contains("readUTF()");
        assertThat(c).generatedSourceFile("frc/robot/test/BasketWriter").contentsAsUtf8String()
            .contains("writeInt(obj.items.size())");
        assertThat(c).generatedSourceFile("frc/robot/test/BasketWriter").contentsAsUtf8String()
            .contains("writeUTF(");
    }

    /** Map fields write size then key-value pairs. */
    @Test
    public void mapField() {
        // @formatter:off
        JavaFileObject input = JavaFileObjects.forSourceLines(
            "frc.robot.test.Registry",
            "package frc.robot.test;",
            "import frc.robot.util.binrw.Binrw;",
            "import java.util.Map;",
            "@Binrw",
            "public class Registry {",
            "    public Map<String, Integer> counts;",
            "    public Registry(Map<String, Integer> counts) {}",
            "}"
        );
        // @formatter:on

        Compilation c = compile(input);
        assertThat(c).succeeded();
        assertThat(c).generatedSourceFile("frc/robot/test/RegistryReader").contentsAsUtf8String()
            .contains("new LinkedHashMap<>");
        assertThat(c).generatedSourceFile("frc/robot/test/RegistryReader").contentsAsUtf8String()
            .contains("readUTF()");
        assertThat(c).generatedSourceFile("frc/robot/test/RegistryReader").contentsAsUtf8String()
            .contains("readInt()");
        assertThat(c).generatedSourceFile("frc/robot/test/RegistryWriter").contentsAsUtf8String()
            .contains("writeInt(obj.counts.size())");
        assertThat(c).generatedSourceFile("frc/robot/test/RegistryWriter").contentsAsUtf8String()
            .contains("entrySet()");
    }

    /** Fields annotated @BrwIgnore are excluded from generated code. */
    @Test
    public void ignoredField() {
        // @formatter:off
        JavaFileObject input = JavaFileObjects.forSourceLines(
            "frc.robot.test.Sensor",
            "package frc.robot.test;",
            "import frc.robot.util.binrw.Binrw;",
            "import frc.robot.util.binrw.BrwIgnore;",
            "@Binrw",
            "public class Sensor {",
            "    public double voltage;",
            "    @BrwIgnore public double debugValue;",
            "    public Sensor(double voltage) {}",
            "}"
        );
        // @formatter:on

        Compilation c = compile(input);
        assertThat(c).succeeded();
        assertThat(c).generatedSourceFile("frc/robot/test/SensorWriter").contentsAsUtf8String()
            .contains("writeDouble(obj.voltage)");
        assertThat(c).generatedSourceFile("frc/robot/test/SensorWriter").contentsAsUtf8String()
            .doesNotContain("debugValue");
    }

    /** Nested @Binrw type fields delegate to the nested type's reader/writer. */
    @Test
    public void nestedBinrwType() {
        // @formatter:off
        JavaFileObject inner = JavaFileObjects.forSourceLines(
            "frc.robot.test.Point",
            "package frc.robot.test;",
            "import frc.robot.util.binrw.Binrw;",
            "@Binrw",
            "public class Point {",
            "    public double x;",
            "    public double y;",
            "    public Point(double x, double y) {}",
            "}"
        );
        JavaFileObject outer = JavaFileObjects.forSourceLines(
            "frc.robot.test.Shape",
            "package frc.robot.test;",
            "import frc.robot.util.binrw.Binrw;",
            "@Binrw",
            "public class Shape {",
            "    public Point[] center;",
            "    public Shape(Point[] center) {}",
            "}"
        );
        // @formatter:on

        Compilation c = compile(inner, outer);
        assertThat(c).succeeded();
        assertThat(c).generatedSourceFile("frc/robot/test/PointReader");
        assertThat(c).generatedSourceFile("frc/robot/test/ShapeReader");
        assertThat(c).generatedSourceFile("frc/robot/test/ShapeReader").contentsAsUtf8String()
            .contains("PointReader.read(stream)");
        assertThat(c).generatedSourceFile("frc/robot/test/ShapeWriter").contentsAsUtf8String()
            .contains("PointWriter.write(stream");
    }

    /** Record components are serialized via their accessor methods in the writer. */
    @Test
    public void recordType() {
        // @formatter:off
        JavaFileObject input = JavaFileObjects.forSourceLines(
            "frc.robot.test.Velocity",
            "package frc.robot.test;",
            "import frc.robot.util.binrw.Binrw;",
            "@Binrw",
            "public record Velocity(double linear, double angular) {}"
        );
        // @formatter:on

        Compilation c = compile(input);
        assertThat(c).succeeded();
        assertThat(c).generatedSourceFile("frc/robot/test/VelocityReader").contentsAsUtf8String()
            .contains("readDouble()");
        assertThat(c).generatedSourceFile("frc/robot/test/VelocityWriter").contentsAsUtf8String()
            .contains("obj.linear()");
        assertThat(c).generatedSourceFile("frc/robot/test/VelocityWriter").contentsAsUtf8String()
            .contains("obj.angular()");
    }

    // Minimal WPILib stubs shared across units tests
    // @formatter:off
    private static final JavaFileObject WPI_MEASURE = JavaFileObjects.forSourceLines(
        "edu.wpi.first.units.Measure",
        "package edu.wpi.first.units;",
        "public interface Measure<U> {",
        "    double baseUnitMagnitude();",
        "}"
    );
    private static final JavaFileObject WPI_PER_UNIT = JavaFileObjects.forSourceLines(
        "edu.wpi.first.units.PerUnit",
        "package edu.wpi.first.units;",
        "public class PerUnit<N, D> {",
        "    public Measure<?> of(double v) { return null; }",
        "    public <D2> PerUnit<PerUnit<N, D>, D2> per(D2 d) { return null; }",
        "}"
    );
    private static final JavaFileObject WPI_DISTANCE_UNIT = JavaFileObjects.forSourceLines(
        "edu.wpi.first.units.DistanceUnit",
        "package edu.wpi.first.units;",
        "public class DistanceUnit {",
        "    public edu.wpi.first.units.measure.Distance of(double v) { return null; }",
        "    public <D> PerUnit<DistanceUnit, D> per(D d) { return null; }",
        "}"
    );
    private static final JavaFileObject WPI_ANGLE_UNIT = JavaFileObjects.forSourceLines(
        "edu.wpi.first.units.AngleUnit",
        "package edu.wpi.first.units;",
        "public class AngleUnit {",
        "    public edu.wpi.first.units.measure.Angle of(double v) { return null; }",
        "    public <D> PerUnit<AngleUnit, D> per(D d) { return null; }",
        "}"
    );
    private static final JavaFileObject WPI_TIME_UNIT = JavaFileObjects.forSourceLines(
        "edu.wpi.first.units.TimeUnit",
        "package edu.wpi.first.units;",
        "public class TimeUnit {",
        "    public edu.wpi.first.units.measure.Time of(double v) { return null; }",
        "}"
    );
    private static final JavaFileObject WPI_ANGULAR_VELOCITY_UNIT = JavaFileObjects.forSourceLines(
        "edu.wpi.first.units.AngularVelocityUnit",
        "package edu.wpi.first.units;",
        "public class AngularVelocityUnit",
        "    extends PerUnit<AngleUnit, TimeUnit> {",
        "    public edu.wpi.first.units.measure.AngularVelocity of(double v) { return null; }",
        "}"
    );
    private static final JavaFileObject WPI_DISTANCE_MEASURE = JavaFileObjects.forSourceLines(
        "edu.wpi.first.units.measure.Distance",
        "package edu.wpi.first.units.measure;",
        "public interface Distance",
        "    extends edu.wpi.first.units.Measure<edu.wpi.first.units.DistanceUnit> {}"
    );
    private static final JavaFileObject WPI_ANGLE_MEASURE = JavaFileObjects.forSourceLines(
        "edu.wpi.first.units.measure.Angle",
        "package edu.wpi.first.units.measure;",
        "public interface Angle",
        "    extends edu.wpi.first.units.Measure<edu.wpi.first.units.AngleUnit> {}"
    );
    private static final JavaFileObject WPI_TIME_MEASURE = JavaFileObjects.forSourceLines(
        "edu.wpi.first.units.measure.Time",
        "package edu.wpi.first.units.measure;",
        "public interface Time",
        "    extends edu.wpi.first.units.Measure<edu.wpi.first.units.TimeUnit> {}"
    );
    private static final JavaFileObject WPI_ANGULAR_VELOCITY_MEASURE = JavaFileObjects.forSourceLines(
        "edu.wpi.first.units.measure.AngularVelocity",
        "package edu.wpi.first.units.measure;",
        "public interface AngularVelocity",
        "    extends edu.wpi.first.units.Measure<edu.wpi.first.units.AngularVelocityUnit> {}"
    );
    private static final JavaFileObject WPI_BASE_UNITS = JavaFileObjects.forSourceLines(
        "edu.wpi.first.units.BaseUnits",
        "package edu.wpi.first.units;",
        "public final class BaseUnits {",
        "    public static final DistanceUnit DistanceUnit = null;",
        "    public static final AngleUnit AngleUnit = null;",
        "    public static final TimeUnit TimeUnit = null;",
        "}"
    );
    // @formatter:on

    private Compilation compileWithWpi(JavaFileObject... inputs) {
        JavaFileObject[] all = new JavaFileObject[inputs.length + 13];
        all[0] = BINRW;
        all[1] = BRW_IGNORE;
        all[2] = WPI_MEASURE;
        all[3] = WPI_PER_UNIT;
        all[4] = WPI_DISTANCE_UNIT;
        all[5] = WPI_ANGLE_UNIT;
        all[6] = WPI_TIME_UNIT;
        all[7] = WPI_ANGULAR_VELOCITY_UNIT;
        all[8] = WPI_DISTANCE_MEASURE;
        all[9] = WPI_ANGLE_MEASURE;
        all[10] = WPI_TIME_MEASURE;
        all[11] = WPI_ANGULAR_VELOCITY_MEASURE;
        all[12] = WPI_BASE_UNITS;
        System.arraycopy(inputs, 0, all, 13, inputs.length);
        return javac().withProcessors(new RobotProcessor()).compile(all);
    }

    /** Base unit Measure fields (Distance) use BaseUnits.XxxUnit.of() directly. */
    @Test
    public void wpilibBaseUnitMeasureField() {
        // @formatter:off
        JavaFileObject input = JavaFileObjects.forSourceLines(
            "frc.robot.test.Pose",
            "package frc.robot.test;",
            "import frc.robot.util.binrw.Binrw;",
            "import edu.wpi.first.units.measure.Distance;",
            "@Binrw",
            "public class Pose {",
            "    public Distance x;",
            "    public Pose(Distance x) {}",
            "}"
        );
        // @formatter:on

        Compilation c = compileWithWpi(input);
        assertThat(c).succeeded();
        assertThat(c).generatedSourceFile("frc/robot/test/PoseWriter").contentsAsUtf8String()
            .contains("baseUnitMagnitude()");
        assertThat(c).generatedSourceFile("frc/robot/test/PoseReader").contentsAsUtf8String()
            .contains("BaseUnits.DistanceUnit.of(");
    }

    /**
     * Compound unit Measure fields (AngularVelocity) use per() chaining, not a direct BaseUnits
     * field.
     */
    @Test
    public void wpilibCompoundUnitMeasureField() {
        // @formatter:off
        JavaFileObject input = JavaFileObjects.forSourceLines(
            "frc.robot.test.Spin",
            "package frc.robot.test;",
            "import frc.robot.util.binrw.Binrw;",
            "import edu.wpi.first.units.measure.AngularVelocity;",
            "@Binrw",
            "public class Spin {",
            "    public AngularVelocity rate;",
            "    public Spin(AngularVelocity rate) {}",
            "}"
        );
        // @formatter:on

        Compilation c = compileWithWpi(input);
        assertThat(c).succeeded();
        assertThat(c).generatedSourceFile("frc/robot/test/SpinWriter").contentsAsUtf8String()
            .contains("baseUnitMagnitude()");
        assertThat(c).generatedSourceFile("frc/robot/test/SpinReader").contentsAsUtf8String()
            .contains("(AngularVelocity) BaseUnits.AngleUnit.per(BaseUnits.TimeUnit).of(");
    }

    /** {@code @Binrw(Impl.class)} delegates to static methods on the provided class. */
    @Test
    public void implClassDelegation() {
        // @formatter:off
        JavaFileObject impl = JavaFileObjects.forSourceLines(
            "frc.robot.test.TokenImpl",
            "package frc.robot.test;",
            "import java.io.DataInputStream;",
            "import java.io.DataOutputStream;",
            "import java.io.IOException;",
            "public class TokenImpl {",
            "    public static Token read(DataInputStream s) throws IOException { return null; }",
            "    public static void write(DataOutputStream s, Token t) throws IOException {}",
            "}"
        );
        JavaFileObject input = JavaFileObjects.forSourceLines(
            "frc.robot.test.Token",
            "package frc.robot.test;",
            "import frc.robot.util.binrw.Binrw;",
            "@Binrw(TokenImpl.class)",
            "public class Token {",
            "    public int id;",
            "}"
        );
        // @formatter:on

        Compilation c = compile(impl, input);
        assertThat(c).succeeded();
        assertThat(c).generatedSourceFile("frc/robot/test/TokenReader").contentsAsUtf8String()
            .contains("TokenImpl.read(stream)");
        assertThat(c).generatedSourceFile("frc/robot/test/TokenWriter").contentsAsUtf8String()
            .contains("TokenImpl.write(stream, obj)");
    }
}
