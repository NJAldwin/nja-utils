package com.njalabs.utils

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PlaceholderTest {
    @Test
    fun `it returns the expected information`() {
        assertEquals("Placeholder: Initial Version", Placeholder.placeholder())
    }
}
