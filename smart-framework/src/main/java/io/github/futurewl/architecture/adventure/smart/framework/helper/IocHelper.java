package io.github.futurewl.architecture.adventure.smart.framework.helper;

import io.github.futurewl.architecture.adventure.smart.framework.util.ArrayUtil;
import io.github.futurewl.architecture.adventure.smart.framework.util.CollectionUtil;
import io.github.futurewl.architecture.adventure.smart.framework.util.ReflectionUtil;
import io.github.futurewl.architecture.adventure.smart.framework.annotation.Inject;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * ==========================
 * 功能描述：依赖注入助手类
 * ==========================
 *
 * @author weilai
 * @version 1.0.0
 */
public final class IocHelper {

    static {
        // 获取所有的 Bean 类与 Bean 实例之间的映射关系（简称 Bean Map）
        Map<Class<?>, Object> beanMap = BeanHelper.getBeanMap();
        if (CollectionUtil.isNotEmpty(beanMap)) {
            // 遍历 Bean Map
            for (Map.Entry<Class<?>, Object> beanEntry : beanMap.entrySet()) {
                // 从 BeanMap 中获取 Bean 类与 Bean 实例
                Class<?> beanClass = beanEntry.getKey();
                Object beanInstance = beanEntry.getValue();
                // 获取 Bean 类定义的所有成员变量（简称 Bean Field）
                Field[] beanFields = beanClass.getFields();
                if (ArrayUtil.isNotEmpty(beanFields)) {
                    // 遍历 Bean Field
                    for (Field beanField : beanFields) {
                        // 判断当前 Bean Field 是否带有 Inject 注解
                        if (beanField.isAnnotationPresent(Inject.class)) {
                            // 在 Bean Map 中 获取 Bean Field 对应的实例
                            Class<?> beanFieldClass = beanField.getType();
                            Object beanFieldInstance = beanMap.get(beanFieldClass);
                            if (beanFieldInstance != null) {
                                // 通过 反射初始化 Bean Field 的值
                                ReflectionUtil.setField(beanInstance, beanField, beanField);
                            }
                        }
                    }
                }
            }
        }
    }

}
