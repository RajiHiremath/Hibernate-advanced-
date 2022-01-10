package com.xworkz.state.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.xworkz.state.entity.StateEntity;

public class StateDAOImpl implements StateDAO{

	@Override
	public void create(StateEntity entity) {
		
		System.out.println("Create :".concat(entity.toString()));
		System.out.println("invoked create method of StateDAO");
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(StateEntity.class);
		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(entity);
		tx.commit();
		session.close();
		sf.close();

	}

	@Override
	public StateEntity getById(int id) 
	{
		StateEntity entity = null;
		System.out.println("invoked getById of StateDAO impl");
		System.out.println("id passed as arg :" + id);
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml").addAnnotatedClass(StateEntity.class);
		SessionFactory sf = configuration.buildSessionFactory();
		if (sf != null) 
		{
			Session session = sf.openSession();
			entity = session.get(StateEntity.class, id);
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
	public void updateNoOfDistById(int newNoOfDist, int id) 
	{
		System.out.println("invoked updateNoOfDistById ofStateDAO impl");
		System.out.println("Args passed :" + newNoOfDist + " " + id);
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(StateEntity.class).buildSessionFactory();
		if (sf != null) 
		{
			Session session = sf.openSession();
			Transaction transaction = session.beginTransaction();
			StateEntity entity = session.get(StateEntity.class, id);
			if (entity != null) 
			{
				entity.setNoOfDist(newNoOfDist);
				session.update(entity);
				transaction.commit();
				System.out.println("entity NoOfDist update");
				session.close();
			} 
			else 
			{
				System.out.println("entity not found to update NoOfDist");
			}
			sf.close();
		}
    }
}

	


