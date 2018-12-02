package io.github.futurewl.architecture.adventure.smart.framework.util;

import org.apache.commons.lang3.ArrayUtils;

/**
 * ==========================
 * 功能描述：数组工具类
 * ==========================
 *
 * @author weilai
 * @version 1.0.0
 */
public final class ArrayUtil {

    /**
     * 判断数组是否非空
     *
     * @param array
     * @return
     */
    public static boolean isNotEmpty(Object[] array) {
        return !ArrayUtils.isEmpty(array);
    }

    /**
     * 判断数组是否为空
     *
     * @param array
     * @return
     */
    public static boolean isEmpty(Object[] array) {
        return ArrayUtils.isEmpty(array);
    }

}
