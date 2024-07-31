package org.frc5572.mixin;

import org.gradle.api.Project
import org.gradle.api.Plugin
import org.gradle.api.Task
import org.gradle.api.tasks.JavaExec
import org.gradle.jvm.tasks.Jar

class MixinPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        target.tasks.withType(Jar::class.java) { task ->
            task.doLast {
                task.outputs.files.forEach {
                    println(it.path)
                }
            }
        }
    }
}