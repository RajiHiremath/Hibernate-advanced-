package com.xworkz.city.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.city.entity.CityEntity;

public class CityDAOImpl implements CityDAO 
{
	@Override
	public void create(CityEntity entity) {
		
		System.out.println("Create :".concat(entity.toString()));
		System.out.println("invoked create method of CityDAO");
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(CityEntity.class);
		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(entity);
		tx.commit();
		session.close();
		sf.close();

	}

	@Override
	public CityEntity getById(int id) 
	{
		CityEntity entity = null;
		System.out.println("invoked getById of CityDAO impl");
		System.out.println("id passed as arg :" + id);
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml").addAnnotatedClass(CityEntity.class);
		SessionFactory sf = configuration.buildSessionFactory();
		if (sf != null) 
		{
			Session session = sf.openSession();
			entity = session.get(CityEntity.class, id);
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
	public void updatePopulationById(double newPopulation, int id) 
	{
		System.out.println("invoked updatePopulationById ofCityDAO impl");
		System.out.println("Args passed :" + newPopulation + " " + id);
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(CityEntity.class).buildSessionFactory();
		if (sf != null) 
		{
			Session session = sf.openSession();
			Transaction transaction = session.beginTransaction();
			CityEntity entity = session.get(CityEntity.class, id);
			if (entity != null) 
			{
				entity.setPopulation(newPopulation);
				session.update(entity);
				transaction.commit();
				System.out.println("entity new Population update");
				session.close();
			} 
			else 
			{
				System.out.println("entity not found to update new Population");
			}
		}
			sf.close();
		}
		
		@Override
		public void deleteId(int id) 
		{
			System.out.println("invoked the delete row");
			System.out.println(id);
			SessionFactory factory=new Configuration().configure().addAnnotatedClass(CityEntity.class).buildSessionFactory();
			if(factory!=null) {
				Session session=factory.openSession();
				Transaction transaction=session.beginTransaction();
				CityEntity entity=session.get(CityEntity.class, id);
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

