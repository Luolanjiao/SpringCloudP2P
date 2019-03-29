package com.llj.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.DEBUG_FILTER_ORDER;
import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.ROUTE_TYPE;

/**
 * @author lanjiao.luo
 * @date 2019/3/29 17:30
 **/
public class RouteFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return ROUTE_TYPE;
    }

    @Override
    public int filterOrder() {
        return DEBUG_FILTER_ORDER;
    }

    @Override
    public boolean shouldFilter() {
        RequestContext ctx=RequestContext.getCurrentContext();
        Object success = ctx.get("isSuccess");
        return success == null ? true : Boolean.parseBoolean(success.toString());
    }

    @Override
    public Object run() throws ZuulException {
return null;
    }
}
