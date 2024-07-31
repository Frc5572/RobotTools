package org.frc5572.util.profiler;

import java.io.OutputStream;

import org.frc5572.util.profiler.LoggingProfiler.LocatedInfo;

public interface ProfileLoggingFormat {
    
    public int compare(String leftName, LocatedInfo leftInfo, String rightName, LocatedInfo rightInfo);

    public void write(String name, LocatedInfo info, double timeDivisor, OutputStream outStream);

    public void begin(OutputStream outputStream);

    public void end(OutputStream outputStream);

}
