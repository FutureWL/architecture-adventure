package org.smart4j.plugin.rest;

import io.github.futurewl.architecture.adventure.chapter3.helper.ConfigHelper;
import io.github.futurewl.architecture.adventure.chapter3.util.StringUtil;

import java.util.Arrays;
import java.util.List;

/**
 * ==========================
 * 功能描述：从配置文件中获取相关属性
 * ==========================
 *
 * @author weilai
 * @version 1.0.0
 */
public class RestConfig {

    public static boolean isLog() {
        return ConfigHelper.getBoolean(RestConstant.LOG);
    }

    public static boolean isJsonp() {
        return ConfigHelper.getBoolean(RestConstant.JSONP);
    }

    public static String getJsonpFunction() {
        return ConfigHelper.getString(RestConstant.JSONP_FUNCTION);
    }

    public static boolean isCors() {
        return ConfigHelper.getBoolean(RestConstant.CORS);
    }

    public static List<String> getCorsOriginList() {
        String corsOrigin = ConfigHelper.getString(RestConstant.CORS_ORIGIN);
        return Arrays.asList(StringUtil.splitString(corsOrigin, ","));
    }

}
