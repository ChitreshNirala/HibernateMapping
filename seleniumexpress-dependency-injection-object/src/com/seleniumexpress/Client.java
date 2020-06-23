package com.seleniumexpress;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		/*
		 * Student student = new Student(); 
		 * MathCheat cheat=new MathCheat();
		 * student.setCheat(cheat); 
		 * student.cheating();
		 */
		
		ApplicationContext context = new  ClassPathXmlApplicationContext("bean.xml");
		
		Student stu =context.getBean("student", Student.class);
		stu.cheating();
		
		
		  AnotherStudent other =context.getBean("another", AnotherStudent.class);
		  other.cheating();
		 
	}

}
