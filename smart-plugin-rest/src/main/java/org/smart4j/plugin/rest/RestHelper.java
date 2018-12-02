package org.smart4j.plugin.rest;

import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.message.Message;

import java.util.ArrayList;
import java.util.List;

/**
 * ==========================
 * 功能描述：REST 助手类
 * ==========================
 *
 * @author weilai
 * @version 1.0.0
 */
public class RestHelper {

    private static final List<Object> providerList = new ArrayList<Object>();
    private static final List<Interceptor<? extends Message>> inInterceptorList = new ArrayList<Interceptor<? extends Message>>();
    private static final List<Interceptor<? extends Message>> outInterceptorList = new ArrayList<Interceptor<? extends Message>>();

    static {
    }

    /**
     * 发布 REST 服务
     *
     * @param wsdl
     * @param resourceClass
     */
    public static void publishService(String wsdl, Class<?> resourceClass) {
    }

    /**
     * 创建 REST 服务
     *
     * @param wsdl
     * @param resourceClass
     * @param <T>
     * @return
     */
    public static <T> T createClient(String wsdl, Class<? extends T> resourceClass) {
        return null;
    }

}
