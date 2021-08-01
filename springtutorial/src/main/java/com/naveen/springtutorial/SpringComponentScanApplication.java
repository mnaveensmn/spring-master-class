package com.naveen.springtutorial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.naveen.springtutorial.basic.componentscan.ComponentPersonDAO;
import com.naveen.springtutorial.cdi.SomeCdiDao;

@SpringBootApplication
@ComponentScan("com.naveen.springtutorial.basic.componentscan")
@ComponentScan("com.naveen.springtutorial.cdi")
public class SpringComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringComponentScanApplication.class);
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(SpringComponentScanApplication.class, args);
		
		ComponentPersonDAO personDAO = applicationContext.getBean(ComponentPersonDAO.class, (Object[]) null);
		SomeCdiDao someCdiDao = applicationContext.getBean(SomeCdiDao.class, (Object[]) null);
		
		LOGGER.info("{}",personDAO);
		LOGGER.info("{}",someCdiDao);
	}
}
