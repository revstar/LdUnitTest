package com.ld.unittest.robolectric.net

import android.util.Log
import com.ld.unittest.net.createApiService
import com.ld.unittest.utils.JSONUtils
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.withContext
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.shadows.ShadowLog

/**
 *Create on 2023/12/13 17:14
 *author cqx
 */
@RunWith(RobolectricTestRunner::class)
class NetworkRequestTest {

    private lateinit var mockWebServer: MockWebServer

    companion object{
         const val TEST_DATA = "TEST"
    }
    @Before
    fun setup() {
        ShadowLog.reset()
        ShadowLog.stream=System.out
        mockWebServer = MockWebServer()
        mockWebServer.start()
    }

    @After
    fun teardown() {
        mockWebServer.shutdown()
    }


    @Test
    @ExperimentalCoroutinesApi
    fun testGetHotKey() = runTest {
        // 执行网络请求
        val apiService = createApiService()
        val result = withContext(Dispatchers.IO) {
            apiService.getHotKey()
        }
        Log.d("testGetHotKey",JSONUtils.stringToJSON(result.toString()))
        // 验证响应
        assertEquals(39, result.data?.size ?: 0)

    }

    @Test
    fun testMockBodyRequest() = runBlocking {
        // 设置模拟的响应
        val response = MockResponse().setResponseCode(200).setBody(TEST_DATA)
        mockWebServer.enqueue(response)

        // 执行网络请求
        val apiService = createApiService(mockWebServer.url("").toString())
        val result = withContext(Dispatchers.IO) {
            apiService.mockData()
        }
        // 验证响应
        assertEquals(TEST_DATA, result.string())
    }
}