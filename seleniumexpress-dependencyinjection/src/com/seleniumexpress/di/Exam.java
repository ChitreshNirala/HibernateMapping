package com.seleniumexpress.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main(String[] args) {
		/*
		 * Student student =new Student(); 
		 * student.setStudentName("chitresh");
		 * student.displayStudentInfo();
		 */
				
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Student stu = context.getBean("student",Student.class);
		stu.displayStudentInfo();
		
	}

}
