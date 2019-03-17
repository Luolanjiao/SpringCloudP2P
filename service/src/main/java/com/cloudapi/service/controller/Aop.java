package com.cloudapi.service.controller;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Jogen
 * @date 2019/3/17
 */
@Component
@Aspect
public class Aop {

    @Pointcut("execution(* com.cloudapi.service.controller.UserController.*(..))")
    public void pointcut(){}

/*    @Before("pointcut()")
    public void before () {
        System.out.println("before...");
    }

    @After("")
    public void after () {
        System.out.println("after...");
    }*/


}
