package com.howtodoinjava.demo.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan(basePackages= {"com.howtodoinjava.*"})
public class RestAPIController 
{
    public static void main( String[] args )
    {
       SpringApplication.run(RestAPIController.class, args);
    }
}
