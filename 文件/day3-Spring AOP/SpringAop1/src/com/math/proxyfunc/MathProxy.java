package com.math.proxyfunc;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//自定义代理类
//将math对象传入， 在调用方法前后 调用日志功能
public class MathProxy {
	//声明功能类属性
	private Math math;
	
	//私有化构造方法
	private MathProxy(){}
	public MathProxy(Math math){
		this.math = math;
	}
	//定义获取math方法
	public Math getMath(){
		Math mathobj = null;
		//将功能类通过Proxy代理接口包装，得到代理类对象
		mathobj = (Math)Proxy.newProxyInstance(
				math.getClass().getClassLoader(), 
				math.getClass().getInterfaces(), 
				new InvocationHandler() {
					//通过方法将功能类对象 调用执行
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						
						System.out.println("日志打印  before....");
						
						//根据方法所在对象和参数 获取代理类对象
						Object obj = method.invoke(math, args);
						
						System.out.println("日志打印  after....");
						return obj;
					}
				}); 
			
		return mathobj;
	}
}
