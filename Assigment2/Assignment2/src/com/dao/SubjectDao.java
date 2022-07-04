package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.bean.Subject;

public class SubjectDao {
	
	public List<Object[]> getAllSubject() {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		//Query qry = session.createQuery("select s from Subject s order by s.sname asc");
		Query qry = session.createQuery("select s.sid, s.sname, c.cname, t.tname from Subject s, Class c, Teacher t where (s.scid = c.cid) and (s.stid = t.tid)");
		List<Object[]> listOfSubject = qry.getResultList();
		return listOfSubject;
	}

}
