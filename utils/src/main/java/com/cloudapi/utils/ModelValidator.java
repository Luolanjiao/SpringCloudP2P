package com.cloudapi.utils;


import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

/**
 * @author lanjiao.luo
 * @date 2019/3/18 12:25
 **/
public class ModelValidator {
    private static Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

    public static <T> String validate(T obj) {
        StringBuilder stringBuilder = new StringBuilder("");
        Set<ConstraintViolation<Object>> validateSet = validator.validate(obj);
        if (validateSet.size() > 0) {
            for (ConstraintViolation<Object> constraintViolation : validateSet) {
                String errorMsg = constraintViolation.getMessage();
                if (StringUtils.isBlank(errorMsg) == false) {
                    stringBuilder.append(constraintViolation.getPropertyPath()).append("属性名 ").append(errorMsg).append(";");
                }
            }
            return String.format("参数验证失败：%s", stringBuilder.toString());
        }
        return "";
    }
}
