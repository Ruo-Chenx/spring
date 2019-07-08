package com.xzy.dao;

import java.util.List;

import com.xzy.pojo.Admin;

public interface AdminDao {

	  public void add(Admin admin);
	  public List<Admin> getAll();
}
