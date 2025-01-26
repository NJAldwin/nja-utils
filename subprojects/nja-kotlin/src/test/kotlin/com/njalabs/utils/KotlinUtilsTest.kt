package com.njalabs.utils

import com.njalabs.utils.kotlin.withoutNullValues
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class KotlinUtilsTest {
    @Nested
    inner class WithoutNullValues {
        @Test
        fun `it filters null values`() {
            assertEquals(mapOf(1 to 1, "two" to 2, 3.0 to 3), mapOf(1 to 1, 2 to null, "two" to 2, 3.0 to 3, 4.0 to null).withoutNullValues())
        }

        @Test
        fun `it handles an empty map`() {
            assertEquals(mapOf<String, String>(), mapOf<String, String>().withoutNullValues())
        }
    }
}
