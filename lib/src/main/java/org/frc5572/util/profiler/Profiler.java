package org.frc5572.util.profiler;

import java.util.function.Supplier;

public sealed interface Profiler permits ReadableProfiler {
    void startTick();
    void endTick();
    void push(String location);
    void push(Supplier<String> locationGetter);
    void pop();
    void swap(String location);
    void swap(Supplier<String> locationGetter);
}