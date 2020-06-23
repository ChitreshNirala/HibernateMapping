package com.seleniumexpress.ioc;

public class Airtel implements Sim {

	@Override
	public void calling() {
		System.out.println("calling using airtel monbile");
	}

	@Override
	public void data() {
		System.out.println("browsing internet using airtel monbile");	
	}

}
