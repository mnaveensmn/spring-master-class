package com.smntech.onlinebookstore.config;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.smntech.onlinebookstore.entity.Book;
import com.smntech.onlinebookstore.entity.BookCategory;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {
	
	@Autowired
	private EntityManager entityManager;

	/**
	 * Used for exposing the id's in Entity class
	 */
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Book.class);
		config.exposeIdsFor(BookCategory.class);
		
		/*config.exposeIdsFor(entityManager.getMetamodel().getEntities().stream()
		.map(Type::getJavaType)
		.toArray(Class[]::new));*/
		
		config.getCorsRegistry()
			.addMapping("/**")
			.allowedOrigins("http://localhost:4200"); // No need to specify the CrossOrgin for every repository we create

	}
	
}
