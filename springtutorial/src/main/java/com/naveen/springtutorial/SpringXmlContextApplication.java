package com.naveen.springtutorial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naveen.springtutorial.xml.XmlPersonDAO;

public class SpringXmlContextApplication {

	public static Logger LOGGER = LoggerFactory.getLogger(SpringXmlContextApplication.class);
	
	public static void main(String[] args) {
		
		try(ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml")) {		
			
			XmlPersonDAO personDao = applicationContext.getBean(XmlPersonDAO.class,  (Object[])null);
			LOGGER.info("Beans Loaded => {} ",(Object)applicationContext.getBeanDefinitionNames());
			System.out.println(personDao);
			System.out.println(personDao.getXmlJdbcConnection());
			System.out.println(personDao.getAa());
		}
	}
}
