package org.frc5572.util.profiler;

import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public final class ValidatingProfiler implements ReadableProfiler {
    public static final ValidatingProfiler INSTANCE = new ValidatingProfiler();

    private ValidatingProfiler() {
    }

    private boolean tickStarted = false;
    private int pathLen = 0;
    private boolean fullPathEmpty = true;

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
        if(this.tickStarted) {
            throw new RuntimeException("Profiler tick already started. Missing endTick()?");
        } else {
            tickStarted = true;
            pathLen = 0;
            fullPathEmpty = true;
            this.push("root");
        }
    }

    @Override
    public void endTick() {
        if(!this.tickStarted) {
            throw new RuntimeException("Profiler tick already ended. Missing startTick()?");
        } else {
            this.pop();
            this.tickStarted = false;
            if(!this.fullPathEmpty) {
                throw new RuntimeException("Profiler tick ended before path was fully popped. Mismatched push/pop?");            }
        }
    }

    @Override
    public void push(String location) {
        if(!this.tickStarted) {
            throw new RuntimeException("Cannot push '" + location + "' to the profiler if profiler tick hasn't started. Missing startTick()?");
        } else {
            fullPathEmpty = false;
            pathLen += 1;
        }
    }

    @Override
    public void push(Supplier<String> locationGetter) {
        this.push(locationGetter.get());
    }

    @Override
    public void pop() {
        if(!this.tickStarted) {
            throw new RuntimeException("Cannot pop from profiler if profiler tick hasn't started. Missing startTick()?");
        } else if(pathLen == 0) {
            throw new RuntimeException("Tried to pop one too many times! Mismatched push() and pop()?");
        } else {
            pathLen -= 1;
        }
    }

    @Override
    public void swap(String location) {
        this.pop();
        this.push(location);
    }

    @Override
    public void swap(Supplier<String> locationGetter) {
        this.pop();
        this.push(locationGetter.get());
    }
}
