package io.github.futurewl.chapter4.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ==========================
 * 功能描述：
 * ==========================
 *
 * @author weilai
 * @version 1.0.0
 */
public class Client {
    public static void main(String[] args) {
//        Greeting greetingProxy = new GreetingProxy(new GreetingImpl());
//        greetingProxy.sayHello("Jack");
//        greetingProxy = new JDKDynamicProxy(new GreetingImpl()).getProxy();
//        greetingProxy.sayHello("Jack");
//        greetingProxy = CGLibProxy.getInstance().getProxy(GreetingImpl.class);
//        greetingProxy.sayHello("Jack");
//
//        ProxyFactory proxyFactory = new ProxyFactory();
//        proxyFactory.setTarget(new GreetingImpl());
//        proxyFactory.addAdvice(new GreetingBeforeAdvice());
//        proxyFactory.addAdvice(new GreetingAfterAdvice());
//
//        Greeting greeting = (Greeting) proxyFactory.getProxy();
//
//        greeting.sayHello("Jack");


        ApplicationContext context = new ClassPathXmlApplicationContext("application-aop.xml");
        Greeting greeting = (Greeting) context.getBean("greetingProxy");
        greeting.sayHello("Jack Spring");

        Apology apology = (Apology) greeting;
        apology.saySorry("Jack Apology");


    }
}
