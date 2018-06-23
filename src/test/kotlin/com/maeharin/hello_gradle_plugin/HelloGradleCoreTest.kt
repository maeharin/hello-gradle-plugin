package com.maeharin.hello_gradle_plugin

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class HelloGradleCoreTest {
    @Test
    fun testHello() {
        val core = HelloGradleCore()
        assertEquals("hello world", core.hello())
    }
}