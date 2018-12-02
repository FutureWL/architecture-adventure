package org.smart4j.chapter5.cxf.server;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.smart4j.chapter5.cxf.HelloService;
import org.smart4j.chapter5.cxf.HelloServiceImpl;

/**
 * ==========================
 * 功能描述：
 * ==========================
 *
 * @author weilai
 * @version 1.0.0
 */
public class JaxWsServer {

    public static void main(String[] args) {
        JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
        factoryBean.setAddress("http://localhost:8080/ws/soap/hello");
        factoryBean.setServiceClass(HelloService.class);
        factoryBean.setServiceBean(new HelloServiceImpl());
        factoryBean.create();
        System.out.println("soap ws is published");
    }

}
