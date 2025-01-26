package com.njalabs.utils.json

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class NjaJsonTest {
    @Test
    fun `it instantiates a mapper`() {
        val mapper = NjaJson.mapper

        val value = mapper.readValue("\"hello\"", String::class.java)
        Assertions.assertEquals("hello", value)
    }
}
