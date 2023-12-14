package com.ld.unittest.utils;



/**
 * Create on 2022/9/17 19:06
 * author cqx
 */
public class PhoneUtils {
    /**
     * [手机号码] 前三位，后三位，其他隐藏<例子:138*******534>
     *
     * @param num
     * @return
     */
    public static String mobilePhone(String num) {
        if (isEmpty(num)) {
            return "";
        }
        if (num.length()!=11){
            return num;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(num.subSequence(0, 3));
        for (int i = 0; i < num.length() - 6; i++) {
            sb.append("*");
        }
        sb.append(num.substring(num.length() - 3));
        return sb.toString();
    }

    public static boolean isEmpty(final CharSequence s) {
        return s == null || s.length() == 0;
    }
}
