package com.spmu.noduesmanagement.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.spmu.noduesmanagement.entities.User;
import com.spmu.noduesmanagement.utils.HibernateUtils;

public class UserService {
	
	public void createUser(User user) {
		
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		//Session session = sessionFactory.getCurrentSession();
		Session session = sessionFactory.openSession();
		System.out.println("Session created");
		Transaction tx = null;

		try {
		   tx = session.beginTransaction();
		   // do some work
		   session.save(user);
		   tx.commit();
		}

		catch (Exception e) {
		   if (tx!=null) tx.rollback();
		   e.printStackTrace(); 
		} finally {
		   session.close();
		}
	}

}
