package com.ld.unittest.mockito.initParams

import com.ld.unittest.bean.Person
import junit.framework.Assert.assertNotNull
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.MockitoAnnotations


/**
 *Create on 2023/12/11 21:12
 *author cqx
 */
class MockitoAnnotationsTest {
    //<--使用@Mock注解
    @Mock
    var mPerson: Person? = null

    @Before
    fun setup() {
        MockitoAnnotations.openMocks(this) //<--初始化
    }

    @Test
    fun testIsNotNull_WithPerson_ReturnCheckIsNitNull() {
        assertNotNull(mPerson)
    }
}
