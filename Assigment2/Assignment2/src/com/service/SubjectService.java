package com.service;

import java.util.Iterator;
import java.util.List;

import com.bean.Subject;
import com.dao.SubjectDao;



public class SubjectService {
	
	SubjectDao su = new SubjectDao();
	public List<Object[]> getAllSubject() {
		List<Object[]> listOfSubject = su.getAllSubject();
//		Iterator<Object[]> li = listOfSubject.iterator();
//		while(li.hasNext()) {
//			 Subject c = li.next();	
//
//		}
		return listOfSubject;
	}	
	
	

}
