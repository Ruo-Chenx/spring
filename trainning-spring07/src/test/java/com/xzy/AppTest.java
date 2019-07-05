package com.xzy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Student;

/**
 * Unit test for simple App.
 */
public class AppTest{
   
	@Test
    public void testApp()
    {
       ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"ApplicationContext.xml"});
		
       System.out.println(context);
       
       System.out.println("-----------------------------------------------------");
       
		Student stu=(Student)context.getBean("stu");
		
		System.out.println(stu+"--"+stu.getName()+"\t"+stu.getAge()+"\t"+stu.getTea().getName()+"-->"+stu.getTea().getAge());
		
		
		Student stu1=(Student)context.getBean("stu");
		
		System.out.println(stu1+"--"+stu1.getName()+"\t"+stu1.getAge()+"\t"+stu1.getTea().getName()+"-->"+stu1.getTea().getAge());
		assertEquals("小王", stu.getName());

    }
}
