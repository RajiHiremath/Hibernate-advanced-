package com.xworkz.solar.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.solar.entity.SolarEntity;
import com.xworkz.util.EMFUtil;

public class SolarDAOImpl implements SolarDAO
{

	@Override
	public void putSolar(SolarEntity entity) {
		EntityManagerFactory entityManagerFactory = EMFUtil.getEntityManagerFactory();
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		manager.persist(entity);
		tx.commit();

		
	}

}
