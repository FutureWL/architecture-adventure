package io.github.futurewl.chapter4.aop;

import io.github.futurewl.chapter4.aop.aspect.Tag;
import org.springframework.stereotype.Component;

/**
 * ==========================
 * 功能描述：
 * ==========================
 *
 * @author weilai
 * @version 1.0.0
 */
@Component
public class GreetingImpl implements Greeting {

    @Tag
    @Override
    public void sayHello(String name) {
//        before();
        System.out.println("Hello! " + name);
//        after();
//        throw new RuntimeException("Error");
    }

//    private void before() {
//        System.out.println("Before");
//    }

//    private void after() {
//        System.out.println("After");
//    }

//    public void goodMorning(String name) {
//        System.out.println("Good Morning! " + name);
//    }
//
//    public void goodNight(String name) {
//        System.out.println("Good Night! " + name);
//    }

}
