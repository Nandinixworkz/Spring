package com.xworkz.trivago.configuration;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class TrivagoWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	public TrivagoWebInit() {
		System.out.println("This is TrivagoWebInit Constructor..");
	}
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {TrivagoConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"} ;
	}

}
