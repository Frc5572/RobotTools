package org.frc5572.util.profiler;

import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public final class Profiling {

    private Profiling() {}

    private static ReadableProfiler instance = EmptyProfiler.INSTANCE;

    public static void setLoggingProfiler(String path, LongSupplier timeGetter, IntSupplier tickGetter, double timeDivisor, ProfileLoggingFormat format) {
        instance = new LoggingProfiler(path, timeGetter, tickGetter, timeDivisor, format);
    }

    public static void setEmptyProfiler() {
        instance = EmptyProfiler.INSTANCE;
    }

    public static void setValidatingProfiler() {
        instance = ValidatingProfiler.INSTANCE;
    }

    public static void save() {
        instance.save();
    }

    public static void startTick() {
        instance.startTick();
    }

    public static void endTick() {
        instance.endTick();
    }

    public static void push(String location) {
        instance.push(location);
    }

    public static void push(Supplier<String> locationGetter) {
        instance.push(locationGetter);
    }

    public static void pop() {
        instance.pop();
    }

    public static void swap(String location) {
        instance.swap(location);
    }

    public static void swap(Supplier<String> locationGetter) {
        instance.swap(locationGetter);
    }

}
