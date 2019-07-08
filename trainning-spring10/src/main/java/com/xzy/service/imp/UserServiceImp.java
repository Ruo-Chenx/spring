package com.xzy.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xzy.dao.AdminDao;
import com.xzy.dao.TravelDao;
import com.xzy.pojo.Admin;
import com.xzy.pojo.Travel;
import com.xzy.service.UserService;
@Service
public class UserServiceImp implements UserService {

	@Autowired
	private  AdminDao adminDao;
	@Autowired
	private TravelDao travelDao;
	
	@Override
	public void addAdmin(Admin admin) {
		adminDao.add(admin);

	}

	@Override
	public List<Travel> getAllTravel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Admin> getalladmin() {
		// TODO Auto-generated method stub
		return adminDao.getAll();
	}

}
