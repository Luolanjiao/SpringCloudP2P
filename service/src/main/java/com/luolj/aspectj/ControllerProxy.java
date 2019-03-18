package com.luolj.aspectj;


import com.cloudapi.utils.ModelValidator;
import com.luolj.dto.AbstractRequestParam;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.validation.Validation;
import java.lang.annotation.Target;

/**
 * @author Jogen
 * @date 2019/3/16
 */
//@Aspect
//@Component
public class ControllerProxy {

    private static Logger logger = LoggerFactory.getLogger(ControllerProxy.class.getName());

   // @Pointcut(value = "execution( public * *(..)) && within(com.cloudapi.service.controller.*)&&args(com.cloudapi.service.dto.AbstractRequestParam) ")
    private void allPublicMethod() {
    }

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
    private Object requstAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        AbstractRequestParam requestObj = (AbstractRequestParam) joinPoint.getArgs()[0];
        String resultMsg = ModelValidator.validate(requestObj);
        Object result = null;
        if (StringUtils.isBlank(resultMsg) == false) {
            return resultMsg;
        }
        try {
            result = joinPoint.proceed();
        } catch (Exception ex) {
            System.out.println("报错啦啦啦啦");
            logger.error(ex.toString());
        }
        return result;
    }

}


