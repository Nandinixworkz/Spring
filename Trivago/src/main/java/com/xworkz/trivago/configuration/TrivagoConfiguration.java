package com.xworkz.trivago.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ComponentScan("com.xworkz")
public class TrivagoConfiguration {
	
	public TrivagoConfiguration() {
		System.out.println("this is TrivagoConfiguration constructor");
	}
	
	@Bean
	public ViewResolver viewResolver() {
		System.out.println("View resolver bean is created");
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	@Bean
	
	public LocalContainerEntityManagerFactoryBean bean() {
		System.out.println("LocalContainerEntityManagerFactoryBean started");
		LocalContainerEntityManagerFactoryBean lcemf = new LocalContainerEntityManagerFactoryBean();
		System.out.println(lcemf);
		System.out.println("LocalContainerEntityManagerFactoryBean created....");
		return lcemf;
	}

}
