package org.frc5572.util.profiler;

import java.util.Collections;
import java.util.List;

public final class EmptyProfileResult implements ProfileResult {

    public static final EmptyProfileResult INSTANCE = new EmptyProfileResult();
    private EmptyProfileResult() {}

    @Override
    public List<ProfilerTiming> getTimings(String parentPath) {
        return Collections.emptyList();
    }

    @Override
    public int getStartTick() {
        return 0;
    }

    @Override
    public long getStartTime() {
        return 0;
    }

    @Override
    public int getEndTick() {
        return 0;
    }

    @Override
    public long getEndTime() {
        return 0;
    }
}
