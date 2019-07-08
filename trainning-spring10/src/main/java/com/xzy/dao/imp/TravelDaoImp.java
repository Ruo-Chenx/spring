package com.xzy.dao.imp;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xzy.pojo.Travel;
@Repository
public class TravelDaoImp implements com.xzy.dao.TravelDao {

	@Autowired
	   private 	QueryRunner  run;
		
	@Override
	public List<Travel> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
