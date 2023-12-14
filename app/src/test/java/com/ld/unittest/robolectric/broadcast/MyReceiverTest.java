package com.ld.unittest.robolectric.broadcast;

import android.content.Intent;


import androidx.test.core.app.ApplicationProvider;

import com.ld.unittest.receiver.MyBroadCastReceiver;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertEquals;



@RunWith(RobolectricTestRunner.class)
public class MyReceiverTest{
    @Test
    public void testBroadcastReceiver() {
        // 创建广播接收器实例
        MyBroadCastReceiver receiver = new MyBroadCastReceiver();

        // 创建广播意图
        Intent intent = new Intent("com.example.ACTION_MY_BROADCAST");
        intent.putExtra("key", "value");

        // 模拟广播接收
        receiver.onReceive(ApplicationProvider.getApplicationContext(), intent);

        // 验证接收器行为
        assertEquals("processed: value", receiver.getResult());
    }

}
