package com.journaldev.spring.di.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.journaldev.spring.di.services.MessageService;

@Component
public class MyApplication {

	@Autowired
	private MessageService service;

	@Autowired
	public void setMessageService(MessageService svc) {
		this.service = svc;
	}
	
	public boolean processMessage(String msg, String rec) {
		
		return this.service.sendMessage(msg, rec);
		
	}
	
}
