package com.xworkz.patient.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.patient.entity.PatientEntity;

public class PatientDAOImpl implements PatientDAO 
{
	@Override
	public void create(PatientEntity entity) {
		
		System.out.println("Create :".concat(entity.toString()));
		System.out.println("invoked create method of CityDAO");
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(PatientEntity.class);
		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(entity);
		tx.commit();
		session.close();
		sf.close();

	}

	@Override
	public PatientEntity getById(int id) 
	{
		PatientEntity entity = null;
		System.out.println("invoked getById of PatientDAO impl");
		System.out.println("id passed as arg :" + id);
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml").addAnnotatedClass(PatientEntity.class);
		SessionFactory sf = configuration.buildSessionFactory();
		if (sf != null) 
		{
			Session session = sf.openSession();
			entity = session.get(PatientEntity.class, id);
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
	public void updateCoronaById(String newCorona, int id) 
	{
		System.out.println("invoked update Corona By Id of PatientDAO impl");
		System.out.println("Args passed :" + newCorona + " " + id);
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(PatientEntity.class).buildSessionFactory();
		if (sf != null) 
		{
			Session session = sf.openSession();
			Transaction transaction = session.beginTransaction();
			PatientEntity entity = session.get(PatientEntity.class, id);
			if (entity != null) 
			{
				entity.setCorona(newCorona);
				session.update(entity);
				transaction.commit();
				System.out.println("entity new Corona update");
				session.close();
			} 
			else 
			{
				System.out.println("entity not found to update new Corona");
			}
			sf.close();
		}
    }
	
	@Override
	public void deleteId(int id) 
	{
		System.out.println("invoked the delete row");
		System.out.println(id);
		SessionFactory factory=new Configuration().configure().addAnnotatedClass(PatientEntity.class).buildSessionFactory();
		if(factory!=null) {
			Session session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			PatientEntity entity=session.get(PatientEntity.class, id);
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
