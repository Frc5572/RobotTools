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
            // TODO error: Profiler tick already started - missing endTick()?
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
            // TODO error: Profiler tick already ended - missing startTick()?
        } else {
            this.pop();
            this.tickStarted = false;
            if(!this.fullPathEmpty) {
                // TODO error: Profiler tick ended before path was fully popped (remainder: '{}'). Mismatched push/pop?
            }
        }
    }

    @Override
    public void push(String location) {
        if(!this.tickStarted) {
            // TODO error: Cannot push '{}' to profiler if profiler tick hasn't started - missing startTick()?
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
            // TODO error: Cannot pop from profiler if profiler tick hasn't started - missing startTick()?
        } else if(pathLen == 0) {
            // TODO error: Tried to pop one too many times! Mismatched push() and pop()?
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
