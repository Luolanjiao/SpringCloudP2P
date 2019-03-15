package com.cloudapi.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lanjiao.luo
 * @date 2019/3/15 10:05
 **/
@RestController
public class TestController {
    @RequestMapping("sayhi")
    public String sayHi(){
        return "你好";
    }

}
