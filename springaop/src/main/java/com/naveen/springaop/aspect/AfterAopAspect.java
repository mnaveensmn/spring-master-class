package com.naveen.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.springframework.context.annotation.Configuration;

@Aspect //AOP
@Configuration //Configuration
public class AfterAopAspect {

	private Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());
	
	@AfterReturning(value = "com.naveen.springaop.aspect.CommonJointPointConfig.businessLayerExecution()",
			returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		logger.info("Jointpoint {} returned ==> {}",joinPoint, result);
	}
	
	@AfterThrowing(value = "com.naveen.springaop.aspect.CommonJointPointConfig.businessLayerExecution()",
			throwing  = "result")
	public void afterThrowing(JoinPoint joinPoint, Object result) {
		logger.info("Jointpoint {} thrown ==> {}",joinPoint, result);
	}
	
	@After(value = "com.naveen.springaop.aspect.CommonJointPointConfig.businessLayerExecution()")
	public void after(JoinPoint joinPoint) {
		logger.info("Jointpoint {}",joinPoint);
	}
}
