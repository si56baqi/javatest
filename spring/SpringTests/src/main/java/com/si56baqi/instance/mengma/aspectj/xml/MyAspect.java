package com.si56baqi.instance.mengma.aspectj.xml;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
    /*
    Spring使用AspectJ开发AOP：基于XML和基于Annotation
    AspectJ 是一个基于 Java 语言的 AOP 框架，它扩展了 Java 语言。Spring 2.0 以后，
    新增了对 AspectJ 方式的支持，新版本的 Spring 框架，建议使用 AspectJ 方式开发 AOP。
    */
    public void myBefore(JoinPoint joinPoint){
        System.out.print("前置通知，目标：");
        System.out.print(joinPoint.getTarget() + "方法名称:");
        System.out.println(joinPoint.getSignature().getName());
    }
    // 后置通知
    public void myAfterReturning(JoinPoint joinPoint) {
        System.out.print("后置通知，方法名称：" + joinPoint.getSignature().getName());
    }
    // 环绕通知
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint)
            throws Throwable {
        System.out.println("环绕开始"); // 开始
        Object obj = proceedingJoinPoint.proceed(); // 执行当前目标方法
        System.out.println("环绕结束"); // 结束
        return obj;
    }
    // 异常通知
    public void myAfterThrowing(JoinPoint joinPoint, Throwable e) {
        System.out.println("异常通知" + "出错了" + e.getMessage());
    }
    // 最终通知
    public void myAfter() {
        System.out.println("最终通知");
    }
}
