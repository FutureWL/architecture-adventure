package io.github.futurewl.architecture.adventure.smart.framework.bean;

import java.lang.reflect.Method;

/**
 * ==========================
 * 功能描述：封装 Action 信息
 * ==========================
 *
 * @author weilai
 * @version 1.0.0
 */
public class Handler {

    private Class<?> controllerClass;

    /**
     * Action 方法
     */
    private Method actionMethod;

    public Handler(Class<?> controllerClass, Method actionMethod) {
        this.controllerClass = controllerClass;
        this.actionMethod = actionMethod;
    }

    public Class<?> getControllerClass() {
        return controllerClass;
    }

    public Method getActionMethod() {
        return actionMethod;
    }
}
