package com.part01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans1.xml");
		
		Foo foo = (Foo) context.getBean("foo");
		
		foo.check();
	}

}
