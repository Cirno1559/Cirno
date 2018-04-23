package com.hxzy.test;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.hxzy.entity.Hero;
import com.hxzy.util.HibernateUtil;

public class test {

	
	@Test
	public void testAuto(){
		Session session = null;
		Transaction trans = null;
		try {
			session = HibernateUtil.getSession();
			trans = session.beginTransaction();
			Hero hero = new Hero();
			hero.sethLevel(18);
			hero.sethName("卡莎");
			hero.sethType("ADC");
			session.save(hero);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}
	@Test
	public void testGet(){
		Session session = null;
		Transaction trans = null;
		try {
			session = HibernateUtil.getSession();
			trans = session.beginTransaction();
			Hero h = (Hero) session.get(Hero.class, 2);
			System.out.println("英雄名称:"+h.gethName()+"--"+"等级"+h.gethLevel()+"--"+"位置"+h.gethType());
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}
	@Test
	public void testUpdate(){
		Session session = null;
		Transaction trans = null;
		try {
		session = HibernateUtil.getSession();
		trans = session.beginTransaction();
		Hero h = new Hero();
			h.sethId(4);
			h.sethName("薇恩");
			h.sethLevel(18);
			h.sethType("ADC");
			session.update(h);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}
	@Test
	public void testDelete(){
		Session session = null;
		Transaction trans = null;
		session = HibernateUtil.getSession();
		trans = session.beginTransaction();
		Hero h = (Hero) session.get(Hero.class, 5);
		session.delete(h);
		trans.commit();
				
	}
	@Test
	public void testQuery(){
		Session session = null;
		Transaction trans = null;
		try {
		session = HibernateUtil.getSession();
		trans = session.beginTransaction();
		String hql = "from Hero";
		Query query = session.createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Hero> list = query.list();
		for (Hero h : list) {
			System.out.println("英雄名称:"+h.gethName()+"--"+"等级"+h.gethLevel()+"--"+"位置"+h.gethType());
		}
		trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}
	@Test
	public void testPageQuery(){
		Session session = HibernateUtil.getSession();
		Transaction trans = session.beginTransaction();
		try {
			String hql = "from Hero where hType like ?";
			Query query = session.createQuery(hql);
			query.setParameter(0, "%ADC%");
			query.setFirstResult(1);
			query.setMaxResults(1);
			@SuppressWarnings("unchecked")
			List<Hero> list = query.list();
			
			for (Hero h : list) {
				System.out.println("英雄名称:"+h.gethName()+"--"+"等级"+h.gethLevel()+"--"+"位置"+h.gethType());
			}
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}

}
