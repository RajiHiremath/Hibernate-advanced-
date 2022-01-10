package com.xworkz.country.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.company.entity.CompanyEntity;
import com.xworkz.country.entity.CountryEntity;

public class CountryDAOImpl implements CountryDAO{

	@Override
	public void create(CountryEntity entity) {
		System.out.println("Create :".concat(entity.toString()));

		System.out.println("invoked create method of CountryDAO impl");

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
	public CountryEntity getById(int id) 
	{
		CountryEntity entity = null;
		System.out.println("invoked getById of CountryDAO impl");
		System.out.println("id passed as arg :" + id);
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml").addAnnotatedClass(CountryEntity.class);
		SessionFactory sf = configuration.buildSessionFactory();
		if (sf != null) 
		{
			Session session = sf.openSession();
			entity = session.get(CountryEntity.class, id);
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
	public void updatePopulationById(long newPopulatuion, int id) 
	{
		System.out.println("invoked updatePopulationById ofCountryDAO impl");
		System.out.println("Args passed :" + newPopulatuion + " " + id);
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(CountryEntity.class).buildSessionFactory();
		if (sf != null) 
		{
			Session session = sf.openSession();
			Transaction transaction = session.beginTransaction();
			CountryEntity entity = session.get(CountryEntity.class, id);
			if (entity != null) 
			{
				entity.setPopulation(newPopulatuion);
				session.update(entity);
				transaction.commit();
				System.out.println("entity Population update");
				session.close();
			} 
			else 
			{
				System.out.println("entity not found to update Population");
			}
			sf.close();
		}
    }
	
	@Override
	public void deleteId(int id) 
	{
		System.out.println("invoked the delete row");
		System.out.println(id);
		SessionFactory factory=new Configuration().configure().addAnnotatedClass(CountryEntity.class).buildSessionFactory();
		if(factory!=null) {
			Session session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			CountryEntity entity=session.get(CountryEntity.class, id);
			if(entity!=null) {
				entity.setId(id);
				session.delete(entity);
				transaction.commit();
				System.out.println("delete entity id:"+id);
			}else {
				System.out.println("not delete");
			}
			session.close();
		}
		factory.close();
	}
}
