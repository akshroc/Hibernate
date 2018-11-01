package org.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private final static SessionFactory sessionFactory;

	static {
		// Configuration configuration = new Configuration();
		// configuration.configure();
		// sessionFactory = configuration.buildSessionFactory();
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}

	public static SessionFactory getSession() {
		return sessionFactory;
	}

}
