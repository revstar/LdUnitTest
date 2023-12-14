package com.ld.unittest.mockito.initParams

import com.ld.unittest.bean.Person
import junit.framework.Assert.assertNotNull
import org.junit.Test
import org.mockito.Mockito.mock

/**
 *Create on 2023/12/11 21:45
 *author cqx
 */
class MockitoTest {
    @Test
    fun testIsNotNull_WithPerson_ReturnCheckIsNotNull() {
        val mPerson: Person = mock(Person::class.java) //<--使用mock方法
        assertNotNull(mPerson)
    }
}
