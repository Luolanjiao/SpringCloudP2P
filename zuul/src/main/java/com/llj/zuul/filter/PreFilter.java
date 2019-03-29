package com.llj.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.bouncycastle.asn1.ocsp.ResponseData;
import org.springframework.cglib.core.Converter;
import org.springframework.stereotype.Component;
import sun.net.util.IPAddressUtil;

import javax.servlet.http.HttpServletRequest;

import java.io.IOException;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.*;

/**
 * @author lanjiao.luo
 * @date 2019/3/29 9:49
 **/
@Component
public class PreFilter extends ZuulFilter {
    @Override
    public int filterOrder() {
        return PRE_DECORATION_FILTER_ORDER;
    }

    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    @Override
    public boolean shouldFilter() {
        RequestContext ctx = RequestContext.getCurrentContext();
        Object success = ctx.get("isSuccess");
        return success == null ? true : Boolean.parseBoolean(success.toString());
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        boolean hasToken = ctx.getRequest().getQueryString().contains("token");
        if (!hasToken) {
          //  ctx.getResponse().setCharacterEncoding("UTF-8");
            System.out.println(ctx.getResponse().getCharacterEncoding());
            ctx.getResponse().setHeader("Content-type", "text/html;charset=UTF-8");
            ctx.setResponseBody("非法请求，请传入token");
            ctx.setSendZuulResponse(false);
            return null;
        }
        ctx.set("isSuccess", true);
        return null;
    }
}
