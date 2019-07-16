package com.xzy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xzy.dao.AdminDao;




@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes= {AllConfig.class})
@ContextConfiguration(value={"/ApplicationContext.xml"})
public class AppTest 
{
	
	@Autowired
	AdminDao ad;
	@Test
	public void adduser()
	{
	    ad.add();
		
	    
	    ad.getAll();
	
	}
	
}
  