package com.xworkz.trivago.configuration;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.xworkz")
public class TrivagoConfiguration {
	
	public TrivagoConfiguration() {
		System.out.println("this is TrivagoConfiguration constructor");
	}

}
