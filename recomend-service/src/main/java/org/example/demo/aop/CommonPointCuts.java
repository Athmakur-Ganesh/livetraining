package org.example.demo.aop;

import org.aspectj.lang.annotation.Pointcut;


public class CommonPointCuts {


	@Pointcut(value = "execution(* com.example.demo.*.*.*(..))")
	public void logging() {}
	
	@Pointcut(value = "execution(* com.example.demo.services.*.findById(..))")
	public void changeCase() {}
	
}
