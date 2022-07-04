package com.service;

import java.util.Iterator;
import java.util.List;

import com.bean.Teacher;
import com.dao.ClassDao;
import com.dao.TeacherDao;

public class TeacherService {
	
	TeacherDao tc = new TeacherDao();
	public List<Teacher> getAllTeacher() {
		List<Teacher> listOfTeacher = tc.getAllTeacher();
		Iterator<Teacher> li = listOfTeacher.iterator();
		while(li.hasNext()) {
			 Teacher c = li.next();	

		}
		return listOfTeacher;
	}

}
