package com.example.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAspect() {
        System.out.println("UniversityLoggingAspect ++++++ beforeGetStudentsLoggingAspect()");
    }

    @AfterReturning("execution(* getStudents())")
    public void afterReturningGetStudentsLoggingAspect() {
        System.out.println("UniversityLoggingAspect ++++++ afterReturningGetStudentsLoggingAspect()");
    }
}