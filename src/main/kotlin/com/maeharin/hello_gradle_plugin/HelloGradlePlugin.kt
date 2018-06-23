package com.maeharin.hello_gradle_plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

open class HelloGradlePlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.tasks.create("helloGradle", HelloGradleTask::class.java)
    }
}