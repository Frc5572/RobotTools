package org.frc5572.util.profiler;

import java.io.IOException;
import java.io.OutputStream;

import org.frc5572.util.profiler.LoggingProfiler.LocatedInfo;

public class TextProfileLoggingFormat implements ProfileLoggingFormat {

    private TextProfileLoggingFormat() {}

    public static final TextProfileLoggingFormat INSTANCE = new TextProfileLoggingFormat();

    @Override
    public int compare(String leftName, LocatedInfo leftInfo, String rightName, LocatedInfo rightInfo) {
        return -Long.compare(leftInfo.totalTime, rightInfo.totalTime);
    }

    @Override
    public void write(String name, LocatedInfo info, double timeDivisor, OutputStream outStream) {
        try {
            outStream.write((name + "\n").getBytes());
            outStream.write(("    visitCount: " + info.getVisitCount() + "\n").getBytes());
            outStream.write(("    totalTime: " + info.getTotalTime() / timeDivisor + "\n").getBytes());
            outStream.write(("    maxTime: " + info.getMaxTime() / timeDivisor + "\n").getBytes());
            outStream.write(("    minTime: " + info.minTime / timeDivisor + "\n").getBytes());
            outStream.write(("    avgTime: " + info.getTotalTime() / info.getVisitCount() / timeDivisor + "\n").getBytes());
        } catch(IOException e) {
            throw new RuntimeException(e);
        } 
    }

    @Override
    public void begin(OutputStream outputStream) {
        try {
            outputStream.write(("Performance Log\n" + //
                            "================================================================================\n").getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void end(OutputStream outputStream) {
        
    }
    
}
