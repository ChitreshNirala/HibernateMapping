package net.javaguides.hibernate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.hibernate.util.CompanyService;

@SpringBootApplication
public class TestHibernateWithSB implements CommandLineRunner 
{
	private CompanyService service;
   public static void main(String[] args)
   {
	   SpringApplication.run(TestHibernateWithSB.class, args);
   }

   
public TestHibernateWithSB(CompanyService service) {
	
	this.service = service;
}


@Override
public void run(String... args) throws Exception {
	service.create();
	service.read();
	service.delete();
	
}
}