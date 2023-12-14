package com.ld.unittest.junit.email

import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

/**
 *Create on 2023/12/11 16:54
 *author cqx
 */
class EmailTest {

    @Test
    fun testIsEmail_withString_ReturnIsEmail(){
        assertThat("1967919189@qq.com",IsEmailMatcher())
        assertThat("454545@qq.com",IsEmailMatcher())
        assertThat("454545@163.com",IsEmailMatcher())
    }
}