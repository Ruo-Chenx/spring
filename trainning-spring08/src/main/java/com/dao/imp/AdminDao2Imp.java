package com.dao.imp;

import com.bean.Student;
import com.bean.Teacher;
import com.dao.AdminDao;

public class AdminDao2Imp implements AdminDao {

	private Student stu;
	private Teacher tea;
	@Override
	public void add() {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

	public Student getStu() {
		return stu;
	}

	public void setStu(Student stu) {
		this.stu = stu;
	}

	public Teacher getTea() {
		return tea;
	}

	public void setTea(Teacher tea) {
		this.tea = tea;
	}

	
}
