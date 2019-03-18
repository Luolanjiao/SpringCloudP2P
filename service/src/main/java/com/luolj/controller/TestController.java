package com.luolj.controller;

import com.luolj.dto.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @RequestMapping("getToken")
    public String getUser(String userId){
        return userId+" token in oauth2";
    }

    @RequestMapping("/getAddress")
    public String getAddress(@RequestParam String username){
        return username+" has address";
    }

}
