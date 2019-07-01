package org.koin.core

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.koin.core.definition.Properties
import kotlin.test.Test

class AttributesTest {

    @Test
    fun `can store & get an attribute value`() {
        val attr = Properties()

        attr.set("myKey", "myString")

        val string = attr.get<String>("myKey")
        assertEquals("myString", string)
    }

    @Test
    fun `attribute empty - no value`() {
        val attr = Properties()

        assertTrue(attr.getOrNull<String>("myKey") == null)
    }

    @Test
    fun `attribute value overwrite`() {
        val attr = Properties()

        attr.set("myKey", "myString")
        attr.set("myKey", "myString2")

        val string = attr.get<String>("myKey")
        assertEquals("myString2", string)
    }
}
