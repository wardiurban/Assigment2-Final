package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.bean.Teacher;

public class TeacherDao {
	public List<Teacher> getAllTeacher() {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Query qry = session.createQuery("select t from Teacher t order by t.tname asc");
		List<Teacher> listOfTeacher = qry.list();
		return listOfTeacher;
	}

}
