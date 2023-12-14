package com.ld.unittest.junit.assertThat

import org.junit.rules.TestRule
import org.junit.runner.Description
import org.junit.runners.model.Statement

/**
 *Create on 2023/12/11 16:14
 *author cqx
 */
class MyRule : TestRule {
    override fun apply(base: Statement?, description: Description?): Statement = object :
        Statement() {
        override fun evaluate() {
            // evaluate前执行方法相当于@Before
            val methodName = description?.methodName // 获取测试方法的名字
            println(methodName + "test start！")
            base?.evaluate() // 运行的测试方法
            // evaluate后执行方法相当于@After
            println(methodName + "test end！")
        }
    }

}