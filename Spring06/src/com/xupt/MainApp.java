package com.xupt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		
		Student s = (Student) context.getBean("student");
		System.out.println("name:" + s.getName());
		System.out.println("age:" + s.getAge());
		
	}

}
