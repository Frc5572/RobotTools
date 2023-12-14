package org.frc5572.robotools;

import com.sun.source.util.JavacTask;
import com.sun.source.util.Plugin;
import com.sun.source.util.TaskEvent;
import com.sun.source.util.TaskListener;
import com.sun.source.util.Trees;

/**
 * Javac plugin has source info, so it's used for Github Action annotations.
 */
public class RobotPlugin implements Plugin {

    /**
     * Name used in build.gradle
     */
    @Override
    public String getName() {
        return "rchk";
    }

    void printData(JavacTask task, TaskEvent e) {
                System.out.print(e.getKind());
                System.out.print(',');
                if(e.getSourceFile() != null) {
                    System.out.print(e.getSourceFile().getName());
                }
                System.out.print(',');
                if(e.getCompilationUnit() != null) {
                    System.out.print("TRUE");
                } else {
                    System.out.print("FALSE");
                }
                System.out.print(',');
                if(e.getTypeElement() != null) {
                    System.out.print("TRUE");
                } else {
                    System.out.print("FALSE");
                }
                System.out.print(',');
                if(Trees.instance(task).getPath(e.getTypeElement()) != null) {
                    System.out.print("TRUE");
                } else {
                    System.out.print("FALSE");
                }
    }

    /**
     * Function run when loaded
     */
    @Override
    public void init(JavacTask task, String... arg1) {
        task.addTaskListener(new TaskListener() {
            @Override
            public void started(TaskEvent e) {
                
            }

            @Override
            public void finished(TaskEvent e) {
                
            }
        });
    }

}
