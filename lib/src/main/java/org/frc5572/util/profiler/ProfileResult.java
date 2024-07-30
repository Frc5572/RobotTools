package org.frc5572.util.profiler;

import java.util.List;

public sealed interface ProfileResult permits EmptyProfileResult, ProfileResultImpl {
    char SPLIT_CHAR = '\u001e';

    List<ProfilerTiming> getTimings(String parentPath);

    int getStartTick();

    long getStartTime();

    int getEndTick();

    long getEndTime();

    default long getTimeSpan() {
        return this.getEndTime() - this.getStartTime();
    }

    static String getHumanReadableName(String path) {
        return path.replace(SPLIT_CHAR, '.');
    }
}
