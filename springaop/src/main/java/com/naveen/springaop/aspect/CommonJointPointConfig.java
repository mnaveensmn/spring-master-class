package com.naveen.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJointPointConfig {

	@Pointcut("execution(* com.naveen.springaop.business.*.*(..))")
	public void businessLayerExecution() {}
	
	@Pointcut("execution(* com.naveen.springaop.data.*.*(..))")
	public void dataLayerExecution() {}
	
	@Pointcut("com.naveen.springaop.aspect.CommonJointPointConfig.businessLayerExecution() && "
			+ "com.naveen.springaop.aspect.CommonJointPointConfig.dataLayerExecution()")
	public void allLayerExcecution() {}
	
	@Pointcut("bean(*dao*)")
	public void beanContainingDao() {}
	
	@Pointcut("within(com.naveen.springaop..*)")
	public void dataLayerExecutionWithWithin() {}
	
	
	@Pointcut("@annotation(com.naveen.springaop.aspect.TrackTime)")
	public void trackTimeAnnotation() {}
	
	
}
