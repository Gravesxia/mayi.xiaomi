package com.mayi.xiaomi.serverzuul.filter;

import com.mayi.xiaomi.serverzuul.common.constants.FilterConstants;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.sun.xml.internal.ws.client.ResponseContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class loginFilter extends ZuulFilter{
    @Override
    public String filterType() {
        return FilterConstants.POST_TYPE;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest req=ctx.getRequest();
        String sessionId = req.getSession().getId();
        String url = req.getRequestURI();
        //redis中查找session，存在，拦截器不启用，不存在，拦截器启用
        return !ctx.containsKey("error.status_code") && url.contains("login") /*&& sessionId*/;
    }

    @Override
    public Object run() {
        RequestContext ctx= RequestContext.getCurrentContext();
        HttpServletRequest req=ctx.getRequest();
        //设置session信息
        req.getSession().setAttribute("userSession","xia");
        return null;
    }
}
