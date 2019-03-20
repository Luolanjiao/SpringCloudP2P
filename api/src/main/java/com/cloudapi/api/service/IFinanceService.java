package com.cloudapi.api.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author luolanjiao
 * @date 2019/3/18
 */
@FeignClient(value = "service-a")
public interface IFinanceService {

    @RequestMapping("getToken")
    String getToken(@RequestParam(value = "userId") String userId);

}
