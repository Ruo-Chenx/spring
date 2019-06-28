package com.xzy.training.training_spring01;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Student;

/**
 * Unit test for simple App.
 */
public class AppTest
{
	@Test
    public void testApp()
    {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"ApplicationContext.xml"});
		
		Student stu = (Student) context.getBean("student");
		
		System.out.println(stu.getName()+"\t"+stu.getAge()+"\t"+stu.getTeacher().getName()+"\t"+stu.getTeacher().getAge());
    }
	


}
