package com.qiancheng.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class EncodeFilter
 */
//urlPatterns 过滤的目标url
@WebFilter(filterName="/EncodeFilter",urlPatterns="/*")
public class EncodeFilter implements Filter {


	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		
	}

	/**
		用来处理 拦截到的请求的方法
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//处理拦截功能
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		 
		//如果存在下一个拦截器，响应
		//没有下一个拦截器则响应到目标servlet中
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
