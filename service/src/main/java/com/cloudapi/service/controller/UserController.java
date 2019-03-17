package com.cloudapi.service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * @author Jogen
 * @date 2019/3/17
 */
@RestController
public class UserController {

    @RequestMapping("/getUser")
    public Object getUser(String name){
         int[] array= new int[]{1,2,4,5};
        return array[4];
        //return name;
    }

}
