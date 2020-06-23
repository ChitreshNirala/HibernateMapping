package com.spring_dependency_injection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.journaldev.spring.di.configuration.DIConfiguration;
import com.journaldev.spring.di.consumer.MyApplication;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
        MyApplication app = context.getBean(MyApplication.class);
        app.processMessage("chitresh", "sb@gl.cpm");
        context.close();
    }
}
