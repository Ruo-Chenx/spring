package com.xzy.dao.imp;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.xzy.dao.AdminDao;
import com.xzy.pojo.Admin;

@Repository
public class AdminDaoImp implements AdminDao {

	@Autowired
   private 	QueryRunner  run;
	
	@Override
	public void add(Admin admin) {
		String sql="insert into admin(email,upwd,upur) values(?,?,?)";
		try {
			run.update(sql, admin.getEmail(),admin.getUpwd(),admin.getUpur());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public List<Admin> getAll() {
		List<Admin> all=null;
		
	    try {
			all=run.query("select * from admin", new BeanListHandler<Admin>(Admin.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return all;
	}

}
