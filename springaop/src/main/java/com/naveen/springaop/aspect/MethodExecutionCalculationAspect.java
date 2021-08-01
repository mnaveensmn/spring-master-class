package com.naveen.springaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.springframework.context.annotation.Configuration;

@Aspect //AOP
@Configuration //Configuration
public class MethodExecutionCalculationAspect {

	private Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());
	
	@Around(value = "com.naveen.springaop.aspect.CommonJointPointConfig.trackTimeAnnotation()")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable{
		
		long startTime = System.currentTimeMillis();
		joinPoint.proceed();
		long timeTaken = System.currentTimeMillis() - startTime;
		logger.info("Time taken by {} is {}",joinPoint, timeTaken);
	
	}
	
}
