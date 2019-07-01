package com.xzy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.StuConfig;
import com.bean.Clazz;
import com.bean.Student;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {StuConfig.class})
public class AppTest{
	
	@Autowired
	Student stu;
    @Autowired
	Clazz clazz;
	
	@Test
    public void testApp()
    {
      
		
		System.out.println(stu.getName()+"\t"+stu.getAge()+"\t"+stu.getTea().getName()+"-->"+stu.getTea().getAge());
		
		System.out.println(clazz.getCname());
		assertEquals("小王", stu.getName());

    }
}
