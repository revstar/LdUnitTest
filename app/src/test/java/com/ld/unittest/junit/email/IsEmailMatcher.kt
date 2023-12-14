package com.ld.unittest.junit.email

import com.ld.unittest.utils.RegexUtils
import org.hamcrest.BaseMatcher
import org.hamcrest.Description

/**
 *Create on 2023/12/11 16:48
 *author cqx
 */
class IsEmailMatcher : BaseMatcher<String>() {

    override fun describeTo(description: Description?) {
        description?.appendText("The input is email!")
    }

    override fun matches(item: Any?): Boolean {
        return if (item == null) false else RegexUtils.isEmail(item as String?)
    }

    override fun describeMismatch(item: Any?, description: Description?) {
        description?.appendText("The input is not an email")
    }
}