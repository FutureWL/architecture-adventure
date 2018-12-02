package io.github.futurewl.architecture.adventure.smart.framework.proxy;

/**
 * ==========================
 * 功能描述：代理接口
 * ==========================
 *
 * @author weilai
 * @version 1.0.0
 */
public interface Proxy {

    Object doProxy(ProxyChain proxyChain) throws Throwable;

}
