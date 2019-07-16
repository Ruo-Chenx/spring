package com.asp;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 切面类
 * @author Administrator
 *
 */


public class Logger {

	//@Pointcut("execution(* com.xzy.dao.imp.*.*(..))")
	private void admindaoall() {}
	
	//@Before("admindaoall()")
//	@Before("execution(* com.xzy.dao.imp.*.*(..))")
	public static  void befor()
	{
		System.out.println("befor logger....");
	}
	//@After("admindaoall()")
//	@After("execution(* com.xzy.dao.imp.*.*(..))")
	public static  void after()
	{
		System.out.println("after logger....");
	}
}
