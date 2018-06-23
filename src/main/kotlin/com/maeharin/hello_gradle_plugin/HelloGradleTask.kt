package com.maeharin.hello_gradle_plugin

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

open class HelloGradleTask: DefaultTask() {
    @TaskAction
    fun hello() {
        val message = HelloGradleCore().hello()
        println(message)
    }
}