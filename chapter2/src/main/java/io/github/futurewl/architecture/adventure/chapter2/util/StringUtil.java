package io.github.futurewl.architecture.adventure.chapter2.util;

import org.apache.commons.lang3.StringUtils;

/**
 * ==========================
 * 功能描述：字符串操作工具类
 * ==========================
 *
 * @author weilai
 * @version 1.0.0
 */
public final class StringUtil {

    /**
     * 判断 字符串 是否为空
     *
     * @param string
     * @return
     */
    public static boolean isEmpty(String string) {
        if (string != null) {
            string = string.trim();
        }
        return StringUtils.isEmpty(string);
    }

    /**
     * 判断 字符串 是否非空
     *
     * @param string
     * @return
     */
    public static boolean isNotEmpty(String string) {
        return !isEmpty(string);
    }

}
