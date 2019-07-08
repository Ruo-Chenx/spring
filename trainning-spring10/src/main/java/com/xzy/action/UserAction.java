package com.xzy.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.xzy.pojo.Admin;
import com.xzy.service.ProductService;
import com.xzy.service.UserService;

@Controller
public class UserAction 
{
	@Autowired
	ProductService  ps;
	@Autowired
	UserService  us;
	
	
	public void addAdmin(Admin admin)
	{
		us.addAdmin(admin);
	}

	
	public List<Admin> getallAdmin()
	{
		return us.getalladmin();
	}
    
}
