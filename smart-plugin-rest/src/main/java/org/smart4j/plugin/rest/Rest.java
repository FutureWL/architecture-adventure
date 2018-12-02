package org.smart4j.plugin.rest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ==========================
 * 功能描述：REST 服务注解
 * ==========================
 *
 * @author weilai
 * @version 1.0.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Rest {


    /**
     * 服务名
     *
     * @return
     */
    String value() default "";

}
