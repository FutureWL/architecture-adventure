package io.github.futurewl.chapter4.aop.aspect;

import io.github.futurewl.chapter4.aop.Apology;
import io.github.futurewl.chapter4.aop.ApologyImpl;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * ==========================
 * 功能描述：
 * ==========================
 *
 * @author weilai
 * @version 1.0.0
 */
@Aspect
@Component
public class GreetingAspect {

    @DeclareParents(value = "io.github.futurewl.chapter4.aop.GreetingImpl", defaultImpl = ApologyImpl.class)
    private Apology apology;

    @Around("@annotation(io.github.futurewl.chapter4.aop.aspect.Tag)")
//    @Around("execution(* GreetingImpl.*(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        before();
        Object result = proceedingJoinPoint.proceed();
        after();
        return result;
    }

    private void before() {
        System.out.println("Before");
    }

    private void after() {
        System.out.println("After");
    }

}
