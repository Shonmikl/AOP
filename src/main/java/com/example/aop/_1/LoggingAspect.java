package com.example.aop._1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(* add*(..))")
    public void allAddMethods() {
    }

    @Before("allAddMethods()")
    public void beforeAddLoggingAspect(JoinPoint joinPoint) {
        System.out.println("LoggingAspect: beforeAddLoggingAspect()---POINTCUT");
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("Method signature: " + methodSignature);
        System.out.println("Get method: " + methodSignature.getMethod());
        System.out.println("Get name: " + methodSignature.getMethod().getName());
        System.out.println("Return Type: " + methodSignature.getReturnType());
    }
}
