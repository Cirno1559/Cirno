package com.hxzy.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
static SessionFactory sessionFactory = null;
static Session session = null;
static{
	Configuration cfg = new Configuration().configure();
	ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
	sessionFactory = cfg.buildSessionFactory(sr);
}
public static Session getSession(){
	return sessionFactory.getCurrentSession();
}
}
