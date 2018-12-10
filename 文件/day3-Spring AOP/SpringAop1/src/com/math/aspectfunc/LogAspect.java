package com.math.aspectfunc;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
//注解标签(支持切面编程)
@Aspect
public class LogAspect {

	//执行指定方法前切入 日志操作功能
	@Before("execution(int com.math.aspectfunc.MathImpl.add(int,int))")
	public void beforeLog(){
		System.out.println("功能前日志打印。。。。。");
	}
	
	@After("execution(int com.math.aspectfunc.MathImpl.add(int,int))")
	public void afterLog(){
		System.out.println("功能后日志打印。。。。。");
	}
	
	@After("execution(* com.math.aspectfunc.MathImpl.*(..))")
	public void afterLog2(){
		System.out.println("功能后日志打印22222。。。。。");
	}
	
	@AfterReturning(value="execution(* com.math.aspectfunc.MathImpl.*(..))"
					,returning="result")
	public void afterReturn(JoinPoint point,Object result){
		System.out.println("方法名："+point.getSignature().getName());
		System.out.println(result+"返回值后。。。");
	}
}
