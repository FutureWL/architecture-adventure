package org.smart4j.chapter5.cxf.client;

import org.apache.cxf.frontend.ClientProxyFactoryBean;
import org.smart4j.chapter5.cxf.HelloService;

/**
 * ==========================
 * 功能描述：
 * ==========================
 *
 * @author weilai
 * @version 1.0.0
 */
public class SimpleClient {
    public static void main(String[] args) {
        ClientProxyFactoryBean factoryBean = new ClientProxyFactoryBean();
        factoryBean.setAddress("http://localhost:8080/ws/soap/hello");
        factoryBean.setServiceClass(HelloService.class);
        HelloService helloService = factoryBean.create(HelloService.class);
        String result = helloService.say("world");
        System.out.println(result);
    }
}
