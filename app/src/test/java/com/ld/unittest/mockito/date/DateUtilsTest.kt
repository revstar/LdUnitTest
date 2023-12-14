package com.ld.unittest.mockito.date

import android.content.Context
import com.ld.unittest.R
import com.ld.unittest.utils.DateUtils
import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertNotNull
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
/**
 *Create on 2023/12/11 15:27
 *author cqx
 */
class DateUtilsTest {
    private val timeOneHourStamp = 60L
    private val timeOneDayHourStamp = 24 * timeOneHourStamp

    @Mock
    private val mockContext: Context? = null

    @Before
    fun setUp() {
        println("test start！")
        MockitoAnnotations.openMocks(this)
    }

    @Test
    fun testFormatNum_WithLongDate_ReturnFormatDate() {
        println("stampToDateTest！")
        assertNotNull(mockContext)

        //使用模拟的 getString() 方法
        Mockito.`when`(mockContext?.getString(R.string.unit_test_day)).thenReturn("天")
        Mockito.`when`(mockContext?.getString(R.string.unit_test_hour)).thenReturn("时")
        Mockito.`when`(mockContext?.getString(R.string.unit_test_minute)).thenReturn("分")

        //40分
        assertEquals("40分", DateUtils.formatNum(40, mockContext))
        //1天
        assertEquals("1时", DateUtils.formatNum(1*timeOneHourStamp, mockContext))
        //100天15时
        assertEquals(
            "100天15时",
            DateUtils.formatNum(100 * timeOneDayHourStamp + 15 * timeOneHourStamp, mockContext)
        )
        //365天1时
        assertEquals(
            "365天1时",
            DateUtils.formatNum(365 * timeOneDayHourStamp + 1 * timeOneHourStamp, mockContext)
        )
    }

    @After
    fun tearDown() {
        println("test end！")
    }
}