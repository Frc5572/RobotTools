package org.frc5572.gradle;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.plugins.JavaPlugin;
import org.gradle.api.plugins.JavaPluginExtension;
import org.gradle.api.tasks.SourceSet;

public class RobotToolPlugin implements Plugin<Project> {

    private Project project;
    private BasePlugin basePlugin;

    @Override
    public void apply(Project project) {
        this.project = project;

        this.basePlugin = project.getPlugins().apply(BasePlugin.class);

        project.getPlugins().withType(JavaPlugin.class, javaPlugin -> configureJavaPluginDefaults());
    }

    private void configureJavaPluginDefaults() {
        JavaPluginExtension javaPluginExtension = project.getExtensions().getByType(JavaPluginExtension.class);

        javaPluginExtension.getSourceSets().all(this::configureSourceSetDefaults);
    }

    private void configureSourceSetDefaults(SourceSet sourceSet) {
        project.getConfigurations().getByName(sourceSet.getCompileOnlyConfigurationName()).extendsFrom(basePlugin.geConfiguration());
        project.getConfigurations().getByName(sourceSet.getAnnotationProcessorConfigurationName()).extendsFrom(basePlugin.geConfiguration());
    }
    
}
