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
		
		Student stu = (Student)context.getBean("stu1");
		
		System.out.println(stu.getName()+"\t"+stu.getAge()+"\t"+stu.getTea().getName()+"-->"+stu.getTea().getAge());
		
		//assertEquals("小王", stu.getName());

    }
}
