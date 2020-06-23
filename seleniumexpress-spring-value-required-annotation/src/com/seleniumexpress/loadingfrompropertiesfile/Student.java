package com.seleniumexpress.loadingfrompropertiesfile;

import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value("${student.name}")
	private String name;
	@Value("${student.interestedCourse}")
	private String interestedCourse;
	@Value("${student.hobby}")
	private String hobby;
	
	public void displayStudentInfo() {
		
		System.out.println("Name :"+name+"interested Course :"+ interestedCourse +" hobby :" + hobby);
		
	}
	
	
}
