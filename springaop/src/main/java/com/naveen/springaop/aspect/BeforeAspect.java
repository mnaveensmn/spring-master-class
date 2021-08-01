package com.naveen.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.springframework.context.annotation.Configuration;

@Aspect //AOP
@Configuration //Configuration
public class BeforeAspect {

	private Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());
	
	@Before("execution(* com.naveen.springaop..*.*(..))")
	public void before(JoinPoint joinPoint) {
		logger.info("Intercepted Method Calls {}",joinPoint);
	}
	
	@Before(value = "com.naveen.springaop.aspect.CommonJointPointConfig.allLayerExcecution()")
	public void allLayer(JoinPoint joinPoint) {
		logger.info("All Layers Pointcut for before {}",joinPoint);
	}
	
	@Before(value = "com.naveen.springaop.aspect.CommonJointPointConfig.beanContainingDao()")
	public void beanContains(JoinPoint joinPoint) {
		logger.info("Bean contains {}",joinPoint);
	}
	
	@Before(value = "com.naveen.springaop.aspect.CommonJointPointConfig.dataLayerExecutionWithWithin()")
	public void withinExp(JoinPoint joinPoint) {
		logger.info("Withing package {}",joinPoint);
	}
	
}
