package com.seleniumexpress.ioc;

public class Vodafone implements Sim {

	@Override
	public void calling() {
		System.out.println("calling from vodafone mobile sim");
	}

	@Override
	public void data() {
		System.out.println("browsing internet using vodafone data");
		
	}

}
