package com.xue02;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans4.xml");
		
		HelloWorld obja = (HelloWorld) context.getBean("helloworld");
		obja.getMessage();
		
		context.registerShutdownHook();
	}

}
