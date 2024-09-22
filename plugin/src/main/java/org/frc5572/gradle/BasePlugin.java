package org.frc5572.gradle;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.artifacts.Configuration;

public class BasePlugin implements Plugin<Project> {

    private RobotToolExtension rtExtension;
    private Configuration rtConfiguration;

    @Override
    public void apply(Project project) {
        rtExtension = project.getExtensions().create("robot_tools", RobotToolExtension.class);

        rtConfiguration = project.getConfigurations().create("robot_tools");
        rtConfiguration.defaultDependencies(dependencySet -> dependencySet.add(project.getDependencies().create("TODO:TODO:" + rtExtension.getVersion().get())));
    }

    public Configuration geConfiguration() {
        return rtConfiguration;
    }

}
