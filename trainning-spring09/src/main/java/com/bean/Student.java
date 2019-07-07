package com.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
	  private String name;
	   private int age;
	 
	   
	   
	   @PostConstruct
	   public void init()
	   {
		   System.out.println("init............");
	   }
	   
	   @PreDestroy
	   public void des()
	   {
		   System.out.println("destroy..................");
	   }
	   
	   
	 @Autowired
	 @Qualifier("t1")
	   private Teacher tea;
	   
	   
	   public Student() {
		   this.name="小王";
		   this.age=24;
		   
		   System.out.println("$$$$$$$$$$$$$$$$$$$$$$$");
	   }
	
	   public Student(String name,int age,Teacher tea)
	   {
		   this.name=name;
		   this.age=age;
		   this.tea=tea;
	   }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Teacher getTea() {
		return tea;
	}
	

	public void setTea(Teacher tea) {
		this.tea = tea;
	}
	   
	   
}
