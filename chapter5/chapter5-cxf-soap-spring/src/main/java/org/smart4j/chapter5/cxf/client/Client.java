package org.smart4j.chapter5.cxf.client;

import org.smart4j.chapter5.cxf.HelloService;
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
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-client.xml");
        HelloService helloService = context.getBean("helloService", HelloService.class);
        String result = helloService.say("world");
        System.out.println(result);
    }
}
