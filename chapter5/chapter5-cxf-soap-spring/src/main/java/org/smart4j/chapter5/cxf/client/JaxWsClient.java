package org.smart4j.chapter5.cxf.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.smart4j.chapter5.cxf.HelloService;

/**
 * ==========================
 * 功能描述：
 * ==========================
 *
 * @author weilai
 * @version 1.0.0
 */
public class JaxWsClient {
    public static void main(String[] args) {
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setAddress("http://localhost:8080/ws/soap/hello");
        factoryBean.setServiceClass(HelloService.class);

        HelloService helloService = factoryBean.create(HelloService.class);
        String result = helloService.say("world");
        System.out.println(result);
    }
}
