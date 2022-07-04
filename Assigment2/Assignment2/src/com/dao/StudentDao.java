package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.bean.Student;

public class StudentDao {
	
	public List<Object[]> getAllStudent() {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		//Query qry = session.createQuery("select s from Student s order by s.stcid asc");
		//Query qry = session.createQuery("select s.stid, s.stname, c.cname from Student s, Class c where s.stcid = c.cid order by s.stcid asc");
		Query qry = session.createQuery("select s.stid, s.stname, c.cname from Student s, Class c where s.stcid = c.cid");
		List<Object[]> listOfStudent = qry.getResultList();
		return listOfStudent;
	}

}
