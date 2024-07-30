package org.frc5572.util.profiler;

import it.unimi.dsi.fastutil.Pair;
import org.jetbrains.annotations.Nullable;

import java.util.Set;

public sealed interface ReadableProfiler extends Profiler permits EmptyProfiler, LoggingProfiler, ValidatingProfiler {

    ProfileResult getResult();

    @Nullable
    LoggingProfiler.LocatedInfo getInfo(String name);

    void save();

}
