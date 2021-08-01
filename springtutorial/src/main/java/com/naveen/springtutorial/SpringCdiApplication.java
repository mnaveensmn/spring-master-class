package com.naveen.springtutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.naveen.springtutorial.cdi.SomeCdiBusiness;

@SpringBootApplication
public class SpringCdiApplication {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(SpringCdiApplication.class, args);	
		SomeCdiBusiness someCdiBusiness = applicationContext.getBean(SomeCdiBusiness.class, (Object[])null);
		System.out.println(someCdiBusiness.getSomeCdiDao());
		System.out.println(someCdiBusiness.getSomeCdiDao());
		
	}
}
