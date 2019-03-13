package com.wj.yaodu.center;


import io.micrometer.core.instrument.util.MathUtils;
import org.apache.commons.lang.enums.EnumUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import java.text.DecimalFormat;

/**
 * @author lanjiao.luo
 * @date 2019/3/13 10:42
 **/
public class TestMain {
    public static void main(String[] args) {
        DecimalFormat myformat = new DecimalFormat();
        DecimalFormat dFormat = new DecimalFormat("#.0000");
        System.out.println(dFormat.format(123457.889));

       // System.out.println(EnumUtils.getEnum(TestEnum.class,"abc"));
    }

    private enum TestEnum{
        abc,
        dd,
        d
    }
}
