package com.ld.unittest.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;


public class MyBroadCastReceiver extends BroadcastReceiver {

    private String result;

    @Override
    public void onReceive(Context context, Intent intent) {
        // 处理接收到的广播
        String value = intent.getStringExtra("key");
        result = "processed: " + value;
    }

    public String getResult() {
        return result;
    }
}
