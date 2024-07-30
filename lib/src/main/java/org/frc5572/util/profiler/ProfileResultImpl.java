package org.frc5572.util.profiler;

import it.unimi.dsi.fastutil.objects.Object2LongMap;
import it.unimi.dsi.fastutil.objects.Object2LongMaps;

import java.util.*;

public final class ProfileResultImpl implements ProfileResult {
    private final Map<String, ? extends ProfileLocationInfo> locationInfos;
    private final long startTime;
    private final int startTick;
    private final long endTime;
    private final int endTick;
    private final int tickDuration;

    public ProfileResultImpl(Map<String, ? extends ProfileLocationInfo> locationInfos, long startTime, int startTick, long endTime, int endTick) {
        this.locationInfos = locationInfos;
        this.startTime = startTime;
        this.startTick = startTick;
        this.endTime = endTime;
        this.endTick = endTick;
        this.tickDuration = endTick - startTick;
    }

    private ProfileLocationInfo getInfo(String path) {
        ProfileLocationInfo profileLocationInfo = this.locationInfos.get(path);
        return profileLocationInfo != null ? profileLocationInfo : EMPTY_INFO;
    }

    @Override
    public List<ProfilerTiming> getTimings(String parentPath) {
        String orig = parentPath;
        ProfileLocationInfo profileLocationInfo = this.getInfo("root");
        long totalTime1 = profileLocationInfo.getTotalTime();
        ProfileLocationInfo profileLocationInfo2 = this.getInfo(parentPath);
        long totalTime2 = profileLocationInfo2.getTotalTime();
        long visitCount = profileLocationInfo2.getVisitCount();
        List<ProfilerTiming> list = new ArrayList<>();
        if (!parentPath.isEmpty()) {
            parentPath = parentPath + "\u001e";
        }
        long totalSubTime = 0L;
        for (String string : this.locationInfos.keySet()) {
            if (isSubpath(parentPath, string)) {
                totalSubTime += this.getInfo(string).getTotalTime();
            }
        }

        long subTime = totalSubTime;
        if (totalSubTime < totalTime2) {
            totalSubTime = totalTime2;
        }

        if (totalTime1 < totalSubTime) {
            totalTime1 = totalSubTime;
        }

        for (String string : this.locationInfos.keySet()) {
            if (isSubpath(parentPath, string)) {
                ProfileLocationInfo profileLocationInfo3 = this.getInfo(string);
                long totalTime = profileLocationInfo3.getTotalTime();
                double parentUsagePercentage = (double) totalTime * 100.0 / totalSubTime;
                double totalUsagePercentage = (double) totalTime * 100.0 / totalTime1;
                String pathComponent = string.substring(parentPath.length());
                list.add(new ProfilerTiming(pathComponent, parentUsagePercentage, totalUsagePercentage, profileLocationInfo3.getVisitCount()));
            }
        }

        if (totalSubTime > subTime) {
            long omf = totalSubTime - subTime;
            list.add(new ProfilerTiming("unspecified", (double) omf * 100.0 / totalSubTime, (double) omf * 100.0 / totalTime1, visitCount));
        }

        Collections.sort(list);
        list.add(0, new ProfilerTiming(orig, 100.0, (double) totalSubTime * 100.0 / totalTime1, visitCount));
        return list;
    }

    @Override
    public int getStartTick() {
        return this.startTick;
    }

    @Override
    public long getStartTime() {
        return this.startTime;
    }

    @Override
    public int getEndTick() {
        return this.endTick;
    }

    @Override
    public long getEndTime() {
        return this.endTime;
    }

    private static boolean isSubpath(String parent, String path) {
        return path.length() > parent.length() && path.startsWith(parent) && path.indexOf(30, parent.length() + 1) < 0;
    }

    private static final ProfileLocationInfo EMPTY_INFO = new ProfileLocationInfo() {
        @Override
        public long getTotalTime() {
            return 0L;
        }

        @Override
        public long getMaxTime() {
            return 0L;
        }

        @Override
        public long getVisitCount() {
            return 0L;
        }

        @Override
        public Object2LongMap<String> getCounts() {
            return Object2LongMaps.emptyMap();
        }
    };

    @Override
    public long getTimeSpan() {
        return this.tickDuration;
    }
}
