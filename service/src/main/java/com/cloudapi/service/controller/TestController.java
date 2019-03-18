package com.cloudapi.service.controller;

import com.cloudapi.service.dto.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lanjiao.luo
 * @date 2019/3/15 10:05
 **/
@RestController
public class TestController {
    @RequestMapping("sayhi")
    public String sayHi(User requestParams) {
        int[] array = new int[]{1, 2, 4, 5};
        //  int a=array[5];
        System.out.println("执行sayhi===============");
        return "abcdefg";
    }

}
