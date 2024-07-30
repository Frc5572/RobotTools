package org.frc5572.util.profiler;

import it.unimi.dsi.fastutil.Pair;
import org.jetbrains.annotations.Nullable;

import java.util.Set;
import java.util.function.Supplier;

public final class EmptyProfiler implements ReadableProfiler {
    public static final EmptyProfiler INSTANCE = new EmptyProfiler();

    private EmptyProfiler() {
    }

    @Override
    public ProfileResult getResult() {
        return EmptyProfileResult.INSTANCE;
    }

    @Nullable
    @Override
    public LoggingProfiler.LocatedInfo getInfo(String name) {
        return null;
    }

    @Override
    public void save() {

    }

    @Override
    public void startTick() {

    }

    @Override
    public void endTick() {

    }

    @Override
    public void push(String location) {

    }

    @Override
    public void push(Supplier<String> locationGetter) {

    }

    @Override
    public void pop() {

    }

    @Override
    public void swap(String location) {

    }

    @Override
    public void swap(Supplier<String> locationGetter) {

    }
}
