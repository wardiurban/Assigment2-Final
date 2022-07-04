package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import com.bean.Class;

public class ClassDao {
	public List<Class> getAllClass() {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Query qry = session.createQuery("select c from Class c order by c.cname asc");
		List<Class> listOfClass = qry.getResultList();
		return listOfClass;
	}

}
