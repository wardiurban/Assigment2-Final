package com.service;

import java.util.Iterator;
import java.util.List;

import com.dao.ClassDao;
import com.bean.Class;

public class ClassService {
	
	ClassDao cl = new ClassDao();
	public List<Class> getAllClass() {
		List<Class> listOfClass = cl.getAllClass();
		Iterator<Class> li = listOfClass.iterator();
		while(li.hasNext()) {
			 Class c = li.next();	

		}
		return listOfClass;
		
//		if (listOfClass != null && !listOfClass.isEmpty()) {
//			System.out.println("listOfClass:"+listOfClass.toString());
//			for (Class c: listOfClass) {
//				System.out.println("c:"+c.toString());
//			}
//		} else {
//			System.out.println("Class list is null");
//		}
//		return listOfClass;
	}

}
