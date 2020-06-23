package com.seleniumexpress.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	@Autowired
	@Qualifier("humanheart")
	private Heart heart;

	
	
	
	/*
	 * public Human(Heart heart) { this.heart = heart; }
	 */

	/*
	 * public void setHeart(Heart heart) { this.heart = heart; }
	 */
	
	public void startpumping() {
		 if (heart != null) {
			 heart.pump();
		}else {
			System.out.println("Your are dead");
		}
		
		
		
	}
}
