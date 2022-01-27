package com.xworkz.vendor.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;

import com.xwork.SingletonUtil;
import com.xworkz.vendor.entity.VendorEntity;

public class VendorDAOImpl implements VendorDAO
{

	@Override
	public void save(VendorEntity entity) 
	{
		EntityManager manager=null;
		try
		{
			manager=SingletonUtil.getEntityManagerFactory().createEntityManager();
			manager.getTransaction().begin();
			manager.persist(entity);
			manager.getTransaction().commit();
		}
		catch (PersistenceException e) {
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
