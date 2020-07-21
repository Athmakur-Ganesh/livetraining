package com.example.demo.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.example.demo.entity.Recommendation;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
@Slf4j
public class CustomAdvices {

  @Around(value = "org.example.demo.aop.CommonPointCuts.logging()")
  public Object around(ProceedingJoinPoint pjp) throws Throwable {
	  
	  log.info(" ======== Invoking ===== "+ pjp.getSignature());
	  Object response = pjp.proceed();
	  
	  log.info(" ****** Finished ******* "+ pjp.getSignature());

	   
	  return response;
  }
  
  
  @Around(value = "org.example.demo.aop.CommonPointCuts.changeCase()")
  public Object change(ProceedingJoinPoint pjp) throws Throwable {
	  
	  log.info(" ======== Invoking ===== "+ pjp.getSignature());
	  Object response = pjp.proceed();
	  
	  log.info(" ****** Finished ******* "+ pjp.getSignature());

	    if(response instanceof Recommendation) {
	    	
	    	System.out.println("=========== inside change");
	    	 Recommendation rec = (Recommendation)response;
	    	  rec.setDescription(rec.getDescription().toLowerCase());
	    }
	  return response;
  }
}
