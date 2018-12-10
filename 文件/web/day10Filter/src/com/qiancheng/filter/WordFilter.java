package com.qiancheng.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import com.qiancheng.requestfunc.WordRequest;

/**
 * Servlet Filter implementation class WordFilter
 */
@WebFilter(filterName="/WordFilter",urlPatterns="/WordServlet")
public class WordFilter implements Filter {

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//敏感词汇的过滤
		WordRequest wr = new WordRequest((HttpServletRequest)request); 
		//将实例化的request包装类对象继续向下传递
		chain.doFilter(wr, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
