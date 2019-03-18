package com.cloudapi.service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lanjiao.luo
 * @date 2019/3/18 16:15
 **/
public class TestApplication {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(date));
    }
}
