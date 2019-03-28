package com.cloudapi.api.controller;

import com.cloudapi.api.service.IFinanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author lanjiao.luo
 * @date 2019/3/15 10:26
 **/
@RestController
@RequestMapping("/test")
public class SaySomeController {

    @Autowired
    private IFinanceService iFinanceService;

    @RequestMapping("/gettoken")
    public String getTokenByService(String userid) {
        return iFinanceService.getToken(userid);
    }

    @GetMapping("/tosuccess")
    public String toSuccess(String name) {
        return "redirect:/test/success";
    }

    @RequestMapping("/success")
    public String success() {
        return "you are success";
    }
}
