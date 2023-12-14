package com.ld.unittest.utils;

import android.content.Context;
import android.text.TextUtils;


import com.ld.unittest.R;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by gongxueyong on 2017/6/2.
 * 关于时间日期的工具列...  暂时只有时间错转换为日期... 其他有需要在加...
 */

public class DateUtils {


    public static final long TIME_SECOND = 1000;
    public static final long TIME_MINUTE = 60 * TIME_SECOND;
    public static final long TIME_HOUR = 60 * TIME_MINUTE;




    public static String formatNum(long remainTime, Context context) {
        if (remainTime > 0) {
            int day = (int) (remainTime / 1440);//24*60=1440
            int hour = (int) ((remainTime - (day * 1440)) / 60);

            String dayStr = context.getString(R.string.unit_test_day);
            String hourStr = context.getString(R.string.unit_test_hour);
            String minStr = context.getString(R.string.unit_test_minute);

            if (day > 6) {
                if (hour == 0) {
                    return day + dayStr;
                } else {
                    return day + dayStr + hour + hourStr;
                }

            } else if (day == 0) {

                int min = (int) (remainTime - (hour * 60));
                String times = hour + hourStr + min + minStr;

                if (hour == 0) {
                    times = min + minStr;
                }

                if (min == 0) {
                    times = hour + hourStr;
                }
                return times;
            } else {
                String times = day + dayStr + hour + hourStr;
                if (day == 0) {
                    times = hour + hourStr;
                }
                if (hour == 0) {
                    times = day + dayStr;
                }
                return times;
            }
        } else {
            return context.getString(R.string.unit_test_device_has_expired);
        }

    }


}
