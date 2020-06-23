package com.seleniumexpress.college;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class collegeConfig {
	
	@Bean
	public Teacher teacherBean() {
		
		return new MathTeacher();
	}
	

	@Bean
	public Principal principalBean() {
		return new Principal();
	}
	
	//used for setter injection
	@Bean
	public College collegeBean() {
		College college =	new College();
		college.setPrincipal(principalBean());
		college.setTeacher(teacherBean());
		return college;
	}
	
	
	
	
	/*
	 //useed for constructor injection
	@Bean
	public College collegeBean() {
		
		return new College(principalBean());
	}
	*/
}
 