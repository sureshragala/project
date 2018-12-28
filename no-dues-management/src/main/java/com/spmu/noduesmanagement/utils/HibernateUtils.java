package com.spmu.noduesmanagement.utils;


import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtils {
	private static SessionFactory sessionFactory;
	 
	private static SessionFactory buildSessionFactory() {
	      
	    Configuration configuration = new Configuration();
	    //configuration.addAnnotatedClass(com.spmu.noduesmanagement.entities.User.class);
	    configuration.configure("hibernate.cfg.xml");
	    System.out.println("Hibernate Annotation Configuration loaded");
	             
	   /* ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
	      .applySettings(configuration.getProperties()).build();*/
	    //System.out.println("Hibernate Annotation serviceRegistry created");
	             
	    /*SessionFactory sessionFactory 
	      = configuration.buildSessionFactory(serviceRegistry);*/
	    SessionFactory sessionFactory 
	      = configuration.buildSessionFactory();
	             
	    return sessionFactory;
	}   
	 
	public static SessionFactory getSessionFactory() {
	    if(sessionFactory == null) sessionFactory = buildSessionFactory();
	    return sessionFactory;
	}

}
