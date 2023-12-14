package com.ld.unittest.junit.assertThat

import android.text.TextUtils
import com.ld.unittest.utils.PhoneUtils
import org.hamcrest.CoreMatchers.*
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.IsNull.nullValue
import org.junit.Rule
import org.junit.Test
import org.mockito.Mock

/**
 *Create on 2023/12/11 16:26
 *author cqx
 */
class AssertThatTest {

    @get:Rule
    val rule = MyRule()

    @Test
    fun testAssertThat1_withIntValue_IsIntValue() {
        assertThat(6, `is`(6))
    }

    @Test
    fun testAssertThat2_withNullValue_IsNullValue() {
        assertThat(null, nullValue())
    }

    @Test
    fun testMobilePhone_withPhone_ReturnFormatMobilePhone() {
        assertThat("152*****541",
        `is`(PhoneUtils.mobilePhone("15245628541")))
    }

}