package com.example.demo.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Aspect
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class CustomAdvices {

  @Around(value = "org.example.demo.aop.CommonPointCuts.logging()")
  public Object around(ProceedingJoinPoint pjp) throws Throwable {
	  
	  
	  Object response = pjp.proceed();
	  
	  return response;
  }
}
