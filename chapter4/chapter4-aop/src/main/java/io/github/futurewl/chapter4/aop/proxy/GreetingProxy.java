package io.github.futurewl.chapter4.aop.proxy;

import io.github.futurewl.chapter4.aop.Greeting;
import io.github.futurewl.chapter4.aop.GreetingImpl;

/**
 * ==========================
 * 功能描述：
 * ==========================
 *
 * @author weilai
 * @version 1.0.0
 */
public class GreetingProxy implements Greeting {

    private Greeting greeting;

    public GreetingProxy(Greeting greeting) {
        this.greeting = new GreetingImpl();
    }

    @Override
    public void sayHello(String name) {
        before();
        greeting.sayHello(name);
        after();
    }

    private void before() {
        System.out.println("Before");
    }

    private void after() {
        System.out.println("After");
    }

}
