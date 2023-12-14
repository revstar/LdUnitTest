package com.ld.unittest.mockito.initParams

import com.ld.unittest.bean.Person
import junit.framework.Assert.assertNotNull
import org.junit.Rule
import org.junit.Test
import org.mockito.Mock
import org.mockito.junit.MockitoJUnit
import org.mockito.junit.MockitoRule


/**
 *Create on 2023/12/11 21:16
 *author cqx
 */
class MockitoRuleTest {
    @Mock
    var mPerson: Person? = null

    @get:Rule
    val mockitoRule: MockitoRule = MockitoJUnit.rule()

    @Test
    fun testIsNotNull_WithPerson_ReturnCheckIsNitNull() {
        assertNotNull(mPerson)
    }
}
