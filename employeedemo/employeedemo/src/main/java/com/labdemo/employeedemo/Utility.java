package com.labdemo.employeedemo;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
 

public class Utility {
	
	private static final SessionFactory sessionFactory =new Configuration()
			.configure()
			.addAnnotatedClass(Employee.class)
			.buildSessionFactory();
	
	public static SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}
	
	public static void shutdown()
	{
		sessionFactory.close();
	}

}
