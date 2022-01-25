package com.xworkz.mart.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;

import com.xworkz.SingletonEMFUtil;
import com.xworkz.mart.entity.SweetMartEntity;

public class SweetMartDAOImpl implements SweetMartDAO
{

	@Override
	public void save(SweetMartEntity entity) 
	{
		EntityManager manager=null;
		try
		{
			 manager=SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
			manager.getTransaction().begin();
			manager.persist(entity);
			manager.getTransaction().commit();
		}
		catch (PersistenceException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			if(manager!=null)
			{
				manager.close();
			}
		}
		
	}
   
}
