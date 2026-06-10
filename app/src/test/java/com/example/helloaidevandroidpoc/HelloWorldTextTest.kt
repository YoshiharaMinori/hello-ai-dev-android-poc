package com.example.helloaidevandroidpoc

import org.junit.Assert.assertEquals
import org.junit.Test

class HelloWorldTextTest {
    @Test
    fun helloWorldText_isExactRequiredText() {
        assertEquals("Hello world!", HELLO_WORLD_TEXT)
    }
}
