package com.xworkz.sugar.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.sugar.entity.SugarEntity;
import com.xworkz.util.EMFUtil;

public class SugarDAOImpl implements SugarDAO
{

	@Override
	public void putSugar(SugarEntity entity) {
		EntityManagerFactory entityManagerFactory = EMFUtil.getEntityManagerFactory();
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		manager.persist(entity);
		tx.commit();

		
	}

}
