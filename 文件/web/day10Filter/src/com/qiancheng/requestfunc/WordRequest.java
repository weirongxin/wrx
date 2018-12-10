package com.qiancheng.requestfunc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

public class WordRequest extends HttpServletRequestWrapper {

	public WordRequest(HttpServletRequest request) {
		super(request);
	}

	@Override
	public String getParameter(String name) {
		System.out.println("参数name"+name);
		//从请求对象中根据name获取value值
		//将value值中的关键词替换
		String valueStr = super.getParameter(name);
		valueStr = valueStr.replaceAll("金三胖", "***"); 
		return valueStr;
		//return super.getParameter(name);
	}

	 
	
}
