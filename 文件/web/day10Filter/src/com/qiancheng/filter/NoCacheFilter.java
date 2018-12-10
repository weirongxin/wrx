package com.qiancheng.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class NoCacheFilter
 */
@WebFilter(filterName="/NoCacheFilter",urlPatterns="/*")
public class NoCacheFilter implements Filter {

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//将响应对象 装换为子类对象 HttpServletResponse类型
		HttpServletResponse resp = (HttpServletResponse)response; 
		
		//清除响应时的缓存数据
		resp.setDateHeader("Expires",-1);
		resp.setHeader("cache-Control","no-cache");
		resp.setHeader("Pragma","no-cache");
		
		//进入响应的下一个拦截或者servlet
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
