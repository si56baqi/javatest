package com.si56baqi.instance.mengma.factorybean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.JoinPoint;

/*Spring通知类型及使用ProxyFactoryBean创建AOP代理*/
public class MyAspect implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("方法执行之前");
        // 执行目标方法
        Object obj = methodInvocation.proceed();
        System.out.println("方法执行之后");
        return null;
    }


}
