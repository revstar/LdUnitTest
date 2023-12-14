package com.ld.unittest.junit.assertTest

import org.hamcrest.Matchers.*
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Rule
import org.junit.Test

/**
 *Create on 2023/12/11 16:59
 *author cqx
 */
class AssertTest {

    @Test
    fun testAssertionMatchers() {
        // 准备测试数据
        val number = 10
        val text = "Hello, World!"
        val names: List<String> = listOf("Alice", "Bob", "Charlie")

        //断言参数等于后面给出的匹配表达式
        assertThat(number, `is`(10))
        //断言参数不等于后面给出的匹配表达式
        assertThat(number, not(8))
        //断言参数相等
        assertThat(number, equalTo(10))
        //断言字符串相等忽略大小写
        assertThat(text, equalToIgnoringCase("hello, World!"))
        //断言字符串包含某字符串
        assertThat(text, containsString("Hello"))
        //断言字符串以某字符串开始
        assertThat(text, startsWith("Hello"))
        //断言字符串以某字符串结束
        assertThat(text, endsWith("World!"))
        //断言参数的值为null
        assertThat(null, nullValue())
        //断言参数的值不为null
        assertThat(text, notNullValue())
        //断言参数大于
        assertThat(number, greaterThan(4))
        //断言参数小于
        assertThat(number, lessThan(11))
        //断言参数大于等于
        assertThat(number, greaterThanOrEqualTo(10))
        //断言参数小于等于
        assertThat(number, lessThanOrEqualTo(12))
        //断言浮点型数在某一范围内
        assertThat(4.0, closeTo(2.1, 4.6))
        //断言符合所有条件，相当于&&
        assertThat(number, allOf(greaterThan(3), lessThan(12)))
        //断言符合某一条件，相当于或
        assertThat(number, anyOf(greaterThan(3), lessThan(6)))
        val map = mapOf("a" to "b", "c" to "d")
        //断言Map集合含有此键
        assertThat(map, hasKey("a"))
        //断言Map集合含有此值
        assertThat(map, hasValue("b"))
        //断言迭代对象含有此元素
        assertThat(names, hasItem("Bob"))
    }
}