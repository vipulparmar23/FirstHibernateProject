package com.parmar.secondAttempt;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class);
			return con.buildSessionFactory();
			//return new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			System.out.println("Initial sessionFactory creation failed." +ex);
			throw new ExceptionInInitializerError();
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public static void shutdown() {
		getSessionFactory().close();
	}

}
