package com.xzy.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xzy.dao.AdminDao;
import com.xzy.dao.TravelDao;
import com.xzy.service.ProductService;
@Service
public class ProductServiceImp implements ProductService {
	@Autowired
	private  AdminDao adminDao;
	@Autowired
	private TravelDao travelDao;
}
