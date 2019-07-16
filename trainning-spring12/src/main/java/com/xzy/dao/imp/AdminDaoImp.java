package com.xzy.dao.imp;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.xzy.dao.AdminDao;

@Repository
public class AdminDaoImp implements AdminDao {


	@Override
	public void add() {
		String sql="insert into admin(email,upwd,upur) values(?,?,?)";
		System.out.println(sql);

	}

	@Override
	public List<String> getAll() {
		List<String> all=new ArrayList<String>();
		System.out.println("...getall...");
	    all.add("hello");
	    all.add("hi");
		return all;
	}

}
