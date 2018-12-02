package org.smart4j.plugin.soap;

import io.github.futurewl.architecture.adventure.chapter3.helper.ConfigHelper;

/**
 * ==========================
 * 功能描述：从配置文件中获取相关属性
 * ==========================
 *
 * @author weilai
 * @version 1.0.0
 */
public class SoapConfig {
    public static boolean isLog() {
        return ConfigHelper.getBoolean(SoapConstant.LOG);
    }
}
