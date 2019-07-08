package com.xzy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xzy.action.UserAction;
import com.xzy.pojo.Admin;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {AllConfig.class})
public class AppTest 
{
	
	@Autowired
	UserAction ua;
	@Test
	public void adduser()
	{
		Admin admin=new Admin();
		admin.setEmail("aaaa@qq.com");
		admin.setUpur("01010101001");
		admin.setUpwd("123");
		
		ua.addAdmin(admin);
		
	
	}
	
}
  