package com.cloudapi.service.common;


import com.cloudapi.service.dto.AbstractRequestParam;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.annotation.Target;

/**
 * @author Jogen
 * @date 2019/3/16
 */
@Aspect
@Component
public class LogWhere {
    @Pointcut(value = "execution( public * *(..)) && within(com.cloudapi.service.controller.*) ")
    private void allPublicMethod(){}

   /* @AfterThrowing(value = "allPublicMethod()",throwing = "ex")
    private void errorAdvice(JoinPoint joinPoint, Exception ex){
        // logger.log("报错啦");
        System.out.println("======报错啦=======================");
        System.out.println("错误信息："+ex.toString());
    }

    @AfterReturning(value = "allPublicMethod()")
    private void afterReturn(){
        System.out.println("=======返回了========");
    }*/

    @Around(value = "allPublicMethod()")
    private Object  requstAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        AbstractRequestParam requestObj=(AbstractRequestParam) joinPoint.getArgs()[0];
     if(true){
         return "您的请求是非法滴";
     }
        return joinPoint.proceed();
    }

}


