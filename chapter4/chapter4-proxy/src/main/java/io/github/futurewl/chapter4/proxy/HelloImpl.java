package io.github.futurewl.chapter4.proxy;

/**
 * ==========================
 * 功能描述：
 * ==========================
 *
 * @author weilai
 * @version 1.0.0
 */
public class HelloImpl implements Hello {

    @Override
    public void say(String name) {
        System.out.println("Hello! " + name);
    }

}
