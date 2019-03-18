package com.cloudapi.api.controller;

import com.cloudapi.api.service.IFinanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author lanjiao.luo
 * @date 2019/3/15 10:26
 **/
@RestController
public class SaySomeController {

    @Autowired
    private IFinanceService iFinanceService;

    @RequestMapping("gettoken")
    public String getTokenByService(String userid) {
        return iFinanceService.getToken(userid);
    }
}
