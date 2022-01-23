package com.xworkz.mart.dao;

import javax.persistence.EntityManager;

import com.xworkz.SingletonEMFUtil;
import com.xworkz.mart.entity.SweetMartEntity;

public class SweetMartDAOImpl implements SweetMartDAO
{

	@Override
	public void save(SweetMartEntity entity) 
	{
		EntityManager manager=SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
	}
   
}
