package com.ld.unittest.utils;


import java.util.regex.Pattern;

/**
 * Create on 2023/12/13 14:33
 * author cqx
 */
public class RegexUtils {
    /**
     * 验证邮箱格式是否合法
     */
    private final static Pattern P3 = Pattern.compile("^w+([-+.]w+)*@w+([-.]w+)*.w+([-.]w+)*$");
    /**
     * 判断邮箱是否符合规范
     * @param email 邮箱地址
     * @return 返回是否为邮箱
     */
    public static boolean isEmail(String email){
        boolean isMatch = true;
        if (email==null||email.equals(""))return false;
        if (!email.matches("[\\w.\\-]+([\\w\\-]+\\.)+[\\w\\-]+")) {
            isMatch = false;
        }
        return isMatch;
    }
}
