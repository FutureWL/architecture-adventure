package io.github.futurewl.chapter4.proxy;

/**
 * ==========================
 * 功能描述：静态代理案例
 * ==========================
 *
 * @author weilai
 * @version 1.0.0
 */
public class Main {

    public static void main(String[] args) {

        Hello helloProxy = new HelloProxy();
        helloProxy.say("Jack");

        helloProxy = new DynamicProxy(new HelloImpl()).getProxy();
        helloProxy.say("Jack");

        helloProxy = CGLibProxy.getInstance().getProxy(HelloImpl.class);
        helloProxy.say("Jack");

    }

}
