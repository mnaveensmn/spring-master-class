package com.naveen.springtutorial;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.naveen.springtutorial.properties.SomeExternalProperties;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringPropertiesApplication {

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringPropertiesApplication.class)) {
			
			SomeExternalProperties properties = applicationContext.getBean(SomeExternalProperties.class,  (Object[])null);
			
			System.out.println(properties.getServiceUrl());
			
		}
		
	}
}
