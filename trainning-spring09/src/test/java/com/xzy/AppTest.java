package com.xzy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bean.Student;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value={"/ApplicationContext.xml"})
public class AppTest{
	
	@Autowired
	Student stu;
   
	@Test
    public void testApp()
    {
      
		
		System.out.println(stu.getName()+"\t"+stu.getAge()+"\t"+stu.getTea().getName()+"-->"+stu.getTea().getAge());
		
		assertEquals("小王", stu.getName());

    }
}
