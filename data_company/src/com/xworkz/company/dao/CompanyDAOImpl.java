package com.xworkz.company.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.company.entity.CompanyEntity;

public class CompanyDAOImpl implements CompanyDAO{

	@Override
	public void create(CompanyEntity entity) {
		System.out.println("Create :".concat(entity.toString()));

		System.out.println("invoked create method of CompanyDAO impl");

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(CompanyEntity.class);
		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(entity);
		tx.commit();
		session.close();
		sf.close();

	}

	@Override
	public CompanyEntity getById(int id) 
	{
		CompanyEntity entity = null;
		System.out.println("invoked getById of CompanyDAO impl");
		System.out.println("id passed as arg :" + id);
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml").addAnnotatedClass(CompanyEntity.class);
		SessionFactory sf = configuration.buildSessionFactory();
		if (sf != null) 
		{
			Session session = sf.openSession();
			entity = session.get(CompanyEntity.class, id);
			if (entity != null) 
			{
				System.out.println("entity is found");
			} 
			else 
			{
				System.out.println("entity is not found");
			}
		}
		return entity;

	}

	@Override
	public void updateWebsiteById(String newWebsite, int id) 
	{
		System.out.println("invoked updateWebsiteById of CompanyDAO impl");
		System.out.println("Args passed :" + newWebsite + " " + id);
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(CompanyEntity.class).buildSessionFactory();
		if (sf != null) 
		{
			Session session = sf.openSession();
			Transaction transaction = session.beginTransaction();
			CompanyEntity entity = session.get(CompanyEntity.class, id);
			if (entity != null) 
			{
				entity.setWebsite(newWebsite);
				session.update(entity);
				transaction.commit();
				System.out.println("entity website update");
				session.close();
			} 
			else 
			{
				System.out.println("entity not found to update website");
			}
			sf.close();
		}
    }
	
}
