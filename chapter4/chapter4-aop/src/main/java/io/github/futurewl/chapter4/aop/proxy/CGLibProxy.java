package io.github.futurewl.chapter4.aop.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * ==========================
 * 功能描述：CGLib 动态代理器
 * ==========================
 *
 * @author weilai
 * @version 1.0.0
 */
public class CGLibProxy implements MethodInterceptor {

    private static CGLibProxy instance = new CGLibProxy();

    private CGLibProxy() {
    }

    public static CGLibProxy getInstance() {
        return instance;
    }


    @SuppressWarnings("unchecked")
    public <T> T getProxy(Class<T> cls) {
        return (T) Enhancer.create(cls, this);
    }

    @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        before();
        Object result = proxy.invokeSuper(object, args);
        after();
        return result;
    }


    private void before() {
        System.out.println("Before CGLibProxy");
    }

    private void after() {
        System.out.println("After CGLibProxy");
    }

}
