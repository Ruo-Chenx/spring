package com.bean;

import java.util.Properties;

public class Student {
	  private String name;
	   private int age;
	   private Teacher tea;
	   
	   private Properties aa;
	   
	   
	   public Student() {
		   
		   this.name="小明";
		   this.age=23;
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
	public Properties getAa() {
		return aa;
	}
	public void setAa(Properties aa) {
		this.aa = aa;
	}

	   
	   
}
