package com.ty.springEmp.config;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.ty.springEmp" })
public class Config {

	@Bean(name = "em")
	@Scope("prototype")
	public EntityManager entityManagerFactory() {
		return Persistence.createEntityManagerFactory("tharun").createEntityManager();

	}

}
