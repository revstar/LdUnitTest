package com.ld.unittest.mockito.voidFunction

import android.util.Log
import com.ld.unittest.test.TestVoid
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner
import org.robolectric.shadows.ShadowLog

/**
 *Create on 2023/12/14 11:52
 *author cqx
 */
@RunWith(MockitoJUnitRunner::class)
class TestVoid {

    @Mock
    var testVoid:TestVoid?=null

    @Before
    fun setUp(){
        ShadowLog.reset()
        ShadowLog.stream=System.out
    }
    @Test
    fun testVoid(){
        Mockito.doAnswer {
            println("doAnswer")
        }.`when`(testVoid)?.test()

        testVoid?.test()
    }
}