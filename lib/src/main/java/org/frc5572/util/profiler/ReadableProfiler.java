package org.frc5572.util.profiler;

import org.jetbrains.annotations.Nullable;


public sealed interface ReadableProfiler extends Profiler permits EmptyProfiler, LoggingProfiler, ValidatingProfiler {

    ProfileResult getResult();

    @Nullable
    LoggingProfiler.LocatedInfo getInfo(String name);

    void save();

}
