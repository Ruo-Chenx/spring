package com.xzy.service;

import java.util.List;

import com.xzy.pojo.Admin;
import com.xzy.pojo.Travel;

public interface UserService {

	
	   public void addAdmin(Admin admin);
	   
	   
	   public List<Travel> getAllTravel();
	   
	   public List<Admin> getalladmin();
}
