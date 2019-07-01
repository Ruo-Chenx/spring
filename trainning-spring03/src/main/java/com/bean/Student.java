package com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	  private String name;
	   private int age;
	   
	   @Autowired
	   private Teacher tea;
	   
	   
	   public Student() {
		   this.name="小王";
		   this.age=24;
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
