package com.vast.config.filter;

import com.vast.entity.Visitor;
import com.vast.service.IVisitorService;
import com.vast.util.IpUtil;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * CORS 跨域信息过滤器
 * @since 2019年9月21日20点01分
 * @version 1.0
 * @author 1157168277@qq.com
 */
@Component
public class CorsFilter implements Filter {  

    @Resource
    private IVisitorService visitorService;

    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {  
        HttpServletResponse response = (HttpServletResponse) res;
        HttpServletRequest request= (HttpServletRequest) req;
        response.setHeader("Access-Control-Allow-Origin", "*");  
        response.setHeader("Access-Control-Allow-Methods", "GET, OPTIONS");
        response.setHeader("Access-Control-Max-Age", "3600");  
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with");
        SaveVisitorInfo(request);
        chain.doFilter(req, res);  
    }  
    public void init(FilterConfig filterConfig) {}  
    public void destroy() {}

    /**
     * 保存访客信息
     * @param request
     */
    public void SaveVisitorInfo(HttpServletRequest request){
        Visitor visitor=new Visitor();
        visitor.setVisitorIp(IpUtil.getIpAddress(request));
        visitor.setRequestUrl(request.getRequestURI());
        visitorService.insert(visitor);
    }
}