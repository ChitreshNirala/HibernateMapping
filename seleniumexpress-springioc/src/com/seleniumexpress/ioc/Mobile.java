package com.seleniumexpress.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	public static void main(String[] args) {
		/*
		 * Airtel airtel=new Airtel(); airtel.calling(); airtel.data();
		 */
		
		/*
		 * Vodafone vodafone= new Vodafone(); vodafone.calling(); vodafone.data();
		 */
	
		/*
		 * Sim sim=new Vodafone(); sim.calling(); sim.data();
		 */
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		System.out.println("config loaded");
		//Airtel air = (Airtel) context.getBean("airtel");
		//Airtel air = context.getBean("airtel",Airtel.class);
		
		//no need to touch source code...make changes only in config file
		// so now u can change class name thats it...if any new class come as let say jio
		//we can use jio also by changing only class name in bean file
		Sim air = context.getBean("airtel", Sim.class);
		air.calling();
		air.data();
		
	}
}
