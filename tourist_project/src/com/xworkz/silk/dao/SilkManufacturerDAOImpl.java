package com.xworkz.silk.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.silk.entity.SilkManufacturerEntity;
import com.xworkz.util.EMFUtil;

public class SilkManufacturerDAOImpl implements SilkManufacturerDAO
{

	@Override
	public void putSilk(SilkManufacturerEntity entity) {
		
		EntityManagerFactory entityManagerFactory=EMFUtil.getEntityManagerFactory();
		  EntityManager manager=entityManagerFactory.createEntityManager();
		  EntityTransaction tx=manager.getTransaction();
		  tx.begin();
		  manager.persist(entity);
		  tx.commit();
		
	}

}
