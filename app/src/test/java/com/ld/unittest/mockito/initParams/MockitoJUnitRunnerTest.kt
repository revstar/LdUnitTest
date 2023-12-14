package com.ld.unittest.mockito.initParams

import com.ld.unittest.bean.Person
import junit.framework.Assert.assertNotNull
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner


/**
 *Create on 2023/12/11 21:16
 *author cqx
 */
@RunWith(MockitoJUnitRunner::class) //<--使用MockitoJUnitRunner
class MockitoJUnitRunnerTest {
    //<--使用@Mock注解
    @Mock
    var mPerson: Person? = null

    @Test
    fun testIsNotNull_WithPerson_ReturnCheckIsNitNull() {
        assertNotNull(mPerson)
    }
}