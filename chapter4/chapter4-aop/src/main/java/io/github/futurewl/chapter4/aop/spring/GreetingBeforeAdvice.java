package io.github.futurewl.chapter4.aop.spring;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * ==========================
 * 功能描述：前置增强类
 * ==========================
 *
 * @author weilai
 * @version 1.0.0
 */
public class GreetingBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("Before Spring AOP");
    }
}
