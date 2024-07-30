package org.frc5572.util.profiler;

import it.unimi.dsi.fastutil.Pair;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;
import it.unimi.dsi.fastutil.objects.Object2LongMap;
import it.unimi.dsi.fastutil.objects.Object2LongMaps;
import it.unimi.dsi.fastutil.objects.Object2LongOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

import static org.frc5572.util.profiler.ProfileResult.SPLIT_CHAR;

public final class LoggingProfiler implements ReadableProfiler {
    private boolean tickStarted;

    private final List<String> path = new ArrayList<>();

    private final LongList timeList = new LongArrayList();

    private final Map<String, LoggingProfiler.LocatedInfo> locationInfos = new HashMap<>();

    private final IntSupplier endTickGetter;

    private final LongSupplier timeGetter;

    private final long startTime;

    private final int startTick;

    private String fullPath = "";

    private LoggingProfiler.LocatedInfo currentInfo;

    private final String filePath;

    public LoggingProfiler(String filePath, LongSupplier timeGetter, IntSupplier tickGetter) {
        this.filePath = filePath;
        this.startTime = timeGetter.getAsLong();
        this.timeGetter = timeGetter;
        this.startTick = tickGetter.getAsInt();
        this.endTickGetter = tickGetter;
    }

    @Override
    public ProfileResult getResult() {
        return new ProfileResultImpl(this.locationInfos, this.startTime, this.startTick, this.timeGetter.getAsLong(), this.endTickGetter.getAsInt());
    }

    @Nullable
    @Override
    public LocatedInfo getInfo(String name) {
        return this.locationInfos.get(name);
    }

    @Override
    public void save() {

    }

    @Override
    public void startTick() {
        if(this.tickStarted) {
            // TODO error: Profiler tick already started - missing endTick()?
        } else {
            this.tickStarted = true;
            this.fullPath = "";
            this.path.clear();
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
            if(!this.fullPath.isEmpty()) {
                // TODO error: Profiler tick ended before path was fully popped (remainder: '{}'). Mismatched push/pop?
            }
        }
    }

    @Override
    public void push(String location) {
        if(!this.tickStarted) {
            // TODO error: Cannot push '{}' to profiler if profiler tick hasn't started - missing startTick()?
        } else {
            if(!this.fullPath.isEmpty()) {
                this.fullPath = this.fullPath + SPLIT_CHAR;
            }
            this.fullPath += location;
            this.path.add(this.fullPath);
            this.timeList.add(timeGetter.getAsLong());
            this.currentInfo = null;
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
        } else if(this.timeList.isEmpty()) {
            // TODO error: Tried to pop one too many times! Mismatched push() and pop()?
        } else {
            this.path.remove(this.path.size() - 1);

            long currentTime = timeGetter.getAsLong();
            long startTime = this.timeList.removeLong(this.timeList.size() - 1);
            long timeSpan = currentTime - startTime;

            LocatedInfo locatedInfo = this.getCurrentInfo();

            locatedInfo.totalTime += timeSpan;
            locatedInfo.visits ++;
            locatedInfo.maxTime = Math.max(locatedInfo.maxTime, timeSpan);
            locatedInfo.minTime = Math.min(locatedInfo.minTime, timeSpan);
            this.fullPath = this.path.isEmpty() ? "" : this.path.get(this.path.size() - 1);
            this.currentInfo = null;
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
        this.push(locationGetter);
    }

    private LocatedInfo getCurrentInfo() {
        if(this.currentInfo == null) {
            this.currentInfo = this.locationInfos.computeIfAbsent(this.fullPath, _k -> new LocatedInfo());
        }
        return this.currentInfo;
    }

    public static class LocatedInfo implements ProfileLocationInfo {
        long maxTime = Long.MIN_VALUE;
        long minTime = Long.MAX_VALUE;
        long totalTime;
        long visits;
        final Object2LongOpenHashMap<String> counts = new Object2LongOpenHashMap<>();

        @Override
        public long getTotalTime() {
            return this.totalTime;
        }

        @Override
        public long getMaxTime() {
            return this.maxTime;
        }

        @Override
        public long getVisitCount() {
            return this.visits;
        }

        @Override
        public Object2LongMap<String> getCounts() {
            return Object2LongMaps.unmodifiable(this.counts);
        }
    }

}
