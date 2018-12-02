package io.github.futurewl.architecture.adventure.smart.framework;

import io.github.futurewl.architecture.adventure.smart.framework.util.ClassUtil;
import io.github.futurewl.architecture.adventure.smart.framework.helper.*;

/**
 * ==========================
 * 功能描述：加载响应的 Helper类
 * ==========================
 *
 * @author weilai
 * @version 1.0.0
 */
public final class HelperLoader {

    public static void init() {
        Class<?>[] classList = {
                ClassHelper.class,
                BeanHelper.class,
                AopHelper.class,
                IocHelper.class,
                ControllerHelper.class
        };
        for (Class<?> cls : classList) {
            ClassUtil.loadClass(cls.getName());
        }
    }

}
