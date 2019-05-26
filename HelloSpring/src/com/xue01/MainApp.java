package com.xue01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans3.xml");
		
		HelloWorld obja = (HelloWorld) context.getBean("helloworld");
		obja.setMessage("I'm object A");
		obja.getMessage();
		
		HelloWorld objb = (HelloWorld) context.getBean("helloworld");
		objb.getMessage();
	}

}
