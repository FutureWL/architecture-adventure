package io.github.futurewl.architecture.adventure.smart.framework.helper;

import io.github.futurewl.architecture.adventure.smart.framework.annotation.Service;
import io.github.futurewl.architecture.adventure.smart.framework.util.ClassUtil;
import io.github.futurewl.architecture.adventure.smart.framework.annotation.Controller;

import java.lang.annotation.Annotation;
import java.util.HashSet;
import java.util.Set;

/**
 * ==========================
 * 功能描述：类操作助手类
 * ==========================
 *
 * @author weilai
 * @version 1.0.0
 */
public final class ClassHelper {

    /**
     * 定义类集合（用于存放所加载的类）
     */
    private static final Set<Class<?>> CLASS_SET;

    static {
        String basePackage = ConfigHelper.getAppBasePackage();
        CLASS_SET = ClassUtil.getClassSet(basePackage);
    }

    /**
     * 获取应用包名下的所有类
     *
     * @return
     */
    public static Set<Class<?>> getClassSet() {
        return CLASS_SET;
    }

    /**
     * 获取应用包名下某父类（或接口）的所有子类（或实现类）
     *
     * @param superClass
     * @return
     */
    public static Set<Class<?>> getClassSetBySuper(Class<?> superClass) {
        Set<Class<?>> classSet = new HashSet<Class<?>>();
        for (Class<?> cls :
                CLASS_SET) {
            if (superClass.isAssignableFrom(cls) && !superClass.equals(cls)) {
                classSet.add(cls);
            }
        }
        return classSet;
    }

    public static Set<Class<?>> getClassSetByAnnotation(Class<? extends Annotation> annotationClass) {
        Set<Class<?>> classSet = new HashSet<Class<?>>();
        for (Class<?> cls :
                CLASS_SET) {
            if (cls.isAnnotationPresent(annotationClass)) {
                classSet.add(cls);
            }
        }
        return classSet;
    }

    /**
     * 获取应用包名下所有 Service 类
     *
     * @return
     */
    public static Set<Class<?>> getServiceClassSet() {
        return getClassSetByAnnotation(Service.class);
    }

    /**
     * 获取应用包名下所有 Controller 类
     *
     * @return
     */
    public static Set<Class<?>> getControllerClassSet() {
        return getClassSetByAnnotation(Controller.class);
    }

    /**
     * 获取应用包名下所有 Bean 类 （包括：Service、Controller 等）
     *
     * @return
     */
    public static Set<Class<?>> getBeanClassSet() {
        Set<Class<?>> beanClassSet = new HashSet<Class<?>>();
        beanClassSet.addAll(getServiceClassSet());
        beanClassSet.addAll(getControllerClassSet());
        return beanClassSet;
    }

}
