package com.xworkz.tour.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.tour.entity.BiscuitEntity;
import com.xworkz.tour.entity.FactoryEntity;
import com.xworkz.tour.entity.MedicineEntity;
import com.xworkz.tour.entity.RailwayStationEntity;
import com.xworkz.tour.entity.SilkManufacturerEntity;
import com.xworkz.tour.entity.TouristEntity;
import com.xworkz.tour.util.EMFUtil;

public class TouristDAOImpl implements TouristDAO
{

	@Override
	public void put(TouristEntity entity) 
	{
	  EntityManagerFactory entityManagerFactory=EMFUtil.getEntityManagerFactory();
	  EntityManager manager=entityManagerFactory.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		tx.begin();
		manager.persist(entity);
		tx.commit();
		tx.rollback();
		//manager.close();
	}

	@Override
	public void putBiscuit(BiscuitEntity entity) 
	{
		EntityManagerFactory entityManagerFactory=EMFUtil.getEntityManagerFactory();
		  EntityManager manager=entityManagerFactory.createEntityManager();
			EntityTransaction tx=manager.getTransaction();
			tx.begin();
			manager.persist(entity);
			tx.commit();
			//tx.rollback();

	}

	@Override
	public void putRailway(RailwayStationEntity entity) 
	{
	  EntityManagerFactory entityManagerFactory=EMFUtil.getEntityManagerFactory();
	  EntityManager manager=entityManagerFactory.createEntityManager();
	  EntityTransaction tx=manager.getTransaction();
    	tx.begin();
		manager.persist(entity);
		tx.commit();
		
	}

	@Override
	public void putFactory(FactoryEntity entity) 
	{
	  EntityManagerFactory entityManagerFactory=EMFUtil.getEntityManagerFactory();
	  EntityManager manager=entityManagerFactory.createEntityManager();
	  EntityTransaction tx=manager.getTransaction();
	  tx.begin();
	  manager.persist(entity);
	  tx.commit();
			
	}

	@Override
	public void putMedicine(MedicineEntity entity) 
	{
		EntityManagerFactory entityManagerFactory=EMFUtil.getEntityManagerFactory();
		  EntityManager manager=entityManagerFactory.createEntityManager();
		  EntityTransaction tx=manager.getTransaction();
		  tx.begin();
		  manager.persist(entity);
		  tx.commit();
		
	}

	@Override
	public void putSilkManufacturer(SilkManufacturerEntity entity) 
	{
		EntityManagerFactory entityManagerFactory=EMFUtil.getEntityManagerFactory();
		  EntityManager manager=entityManagerFactory.createEntityManager();
		  EntityTransaction tx=manager.getTransaction();
		  tx.begin();
		  manager.persist(entity);
		  tx.commit();
		
	}
	

}
