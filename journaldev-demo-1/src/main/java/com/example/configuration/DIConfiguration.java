package com.example.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.services.EmailService;
import com.example.services.MessageService;
import com.example.services.TwitterService;

@Configuration
@ComponentScan("com.example.consumer")
public class DIConfiguration {
	
	@Bean
	public MessageService getMessageService(){
		return new TwitterService();
	}
}
