package io.github.futurewl.architecture.adventure.smart.framework.annotation;

import java.lang.annotation.*;

/**
 * ==========================
 * 功能描述：切面注解
 * ==========================
 *
 * @author weilai
 * @version 1.0.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Aspect {

    /**
     * 注解
     *
     * @return
     */
    Class<? extends Annotation> value();

}
