package com.xworkz.medicine.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import com.xworkz.medicine.entity.MedicineEntity;
import com.xworkz.util.EMFUtil;

public class MedicineDAOImpl implements MedicineDAO
{

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
	public void addAll(List<MedicineEntity> entities)
	{
		EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();
		for (MedicineEntity medicineEntity : entities) 
		{
			manager.persist(medicineEntity);

			EntityTransaction transaction = manager.getTransaction();

			transaction.begin();
			int flushcount = 0;

			try {
				for (int i = 0; i < 35; i++) {
					if (flushcount ==10) {
						manager.flush();
						flushcount = 0;
						manager.clear();
					}
					manager.flush();
					flushcount++;
				}
			} catch (PersistenceException e) {
				e.printStackTrace();
				transaction.rollback();
			}

			transaction.commit();

		}
		
	}

}
