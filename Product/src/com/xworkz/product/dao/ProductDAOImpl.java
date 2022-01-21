package com.xworkz.product.dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import com.xworkz.product.entity.ProductEntity;
import com.xworkz.util.SingletonUtil;

public class ProductDAOImpl implements ProductDAO
{

	@Override
	public void save(ProductEntity entity) 
	{
		EntityManager manager=SingletonUtil.getEntityManagerFactory().createEntityManager();
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		
	}

	@Override
	public void saveAll(List<ProductEntity> entities) 
	{
		
		EntityManager manager =SingletonUtil.getEntityManagerFactory().createEntityManager();
		for (ProductEntity productEntity : entities) 
		{
			manager.persist(productEntity);

			EntityTransaction transaction = manager.getTransaction();

			transaction.begin();
			int flushcount = 0;

			try {
				for (int i = 0; i < 10; i++) {
					if (flushcount ==10) {
						manager.flush();
						flushcount = 0;
						manager.clear();
					}
					manager.flush();
					flushcount++;
					transaction.commit();
				}
			} catch (PersistenceException e) {
				e.printStackTrace();
				transaction.rollback();
			}

		}
	}

	@Override
	public List<ProductEntity> getAll(List<ProductEntity> entities) 
	{
		EntityManager manager=null;
		try
		{
			manager=SingletonUtil.getEntityManagerFactory().createEntityManager();
			Query query=manager.createNamedQuery("getAll");
		    return (List<ProductEntity>)query.getResultList();
		}
		catch (PersistenceException e) {
			e.printStackTrace();
		}
		finally {
			if(manager!=null)
			{
				manager.close();
			}
		}
		return null;
		
	}

	@Override
	public ProductEntity getMaxPrice() 
	{
		EntityManager manager=null;
		try
		{
			manager=SingletonUtil.getEntityManagerFactory().createEntityManager();
			Query query=manager.createNamedQuery("getMaxPrice");
			return (ProductEntity)query.getSingleResult();
			
			
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
		
		return null;
	}

	@Override
	public ProductEntity getTotalPrice() 
	{
		EntityManager manager=null;
		try
		{
			manager=SingletonUtil.getEntityManagerFactory().createEntityManager();
			Query query=manager.createNamedQuery("getMaxPrice");
			return (ProductEntity)query.getSingleResult();
			
			
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
		return null;
	}

	@Override
	public String getBrandByName(String name) 
	{
		EntityManager manager=null;
		try
		{
			manager=SingletonUtil.getEntityManagerFactory().createEntityManager();
			Query query=manager.createNamedQuery("getBrandByName");
			query.setParameter("nm", name);
		    return(String) query.getSingleResult();
		}
		catch (PersistenceException e) {
			e.printStackTrace();
		}
		finally {
			if(manager!=null)
			{
				manager.close();
			}
		}
		return null;
		
	}

	@Override
	public ProductEntity getByBrand(String brand) 
	{
		EntityManager manager=null;
		try
		{
			manager=SingletonUtil.getEntityManagerFactory().createEntityManager();
			Query query=manager.createNamedQuery("getByBrand");
			query.setParameter("bd", brand);
			return (ProductEntity)query.getSingleResult();
			
			
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
		return null;
	}

	@Override
	public ProductEntity getNameAndPrice(String name, double price) 
	{
		EntityManager manager=null;
		try
		{
			manager=SingletonUtil.getEntityManagerFactory().createEntityManager();
			Query query=manager.createNamedQuery("getNameAndPrice");
			query.setParameter("nm", name);
			query.setParameter("pr", price);
		    return(ProductEntity) query.getResultList();
		}
		catch (PersistenceException e) {
			e.printStackTrace();
		}
		finally {
			if(manager!=null)
			{
				manager.close();
			}
		}	
		return null;
	}

	@Override
	public ProductEntity getNameAndPriceByBrand(String brand) 
	{
		EntityManager manager=null;
		try
		{
			manager=SingletonUtil.getEntityManagerFactory().createEntityManager();
			Query query=manager.createNamedQuery("getNameAndPriceByBrand");
			query.setParameter("bd", brand);
			
		    return (ProductEntity) query.getSingleResult();
		}
		catch (PersistenceException e) {
			e.printStackTrace();
		}
		finally {
			if(manager!=null)
			{
				manager.close();
			}
		}	
		return null;
	}

	@Override
	public int getQuantityByName(String name) 
	{
		EntityManager manager=null;
		try
		{
			manager=SingletonUtil.getEntityManagerFactory().createEntityManager();
			Query query=manager.createNamedQuery("getQuantityByName");
			query.setParameter("nm", name);
			return(int) query.getSingleResult();
		}
		catch (PersistenceException e) {
			e.printStackTrace();
		}
		finally {
			if(manager!=null)
			{
				manager.close();
			}
		}
		return (Integer) null;
}

	@Override
	public ProductEntity getQuantityAndPriceByName(String name) 
	{
		EntityManager manager=null;
		try
		{
			manager=SingletonUtil.getEntityManagerFactory().createEntityManager();
			Query query=manager.createNamedQuery("getQuantityAndPriceByName");
			query.setParameter("nm", name);
			return(ProductEntity) query.getSingleResult();
		}
		catch (PersistenceException e) {
			e.printStackTrace();
		}
		finally {
			if(manager!=null)
			{
				manager.close();
			}
		}
		return null;
	}

	@Override
	public ProductEntity getQuantityAndPriceByNameAndId(String name, int id) 
	{
		EntityManager manager=null;
		try
		{
			manager=SingletonUtil.getEntityManagerFactory().createEntityManager();
			Query query=manager.createNamedQuery("getQuantityAndPriceByNameAndId");
			query.setParameter("nm", name);
			query.setParameter("id", id);
			return(ProductEntity) query.getSingleResult();
		}
		catch (PersistenceException e) {
			e.printStackTrace();
		}
		finally {
			if(manager!=null)
			{
				manager.close();
			}
		}
		return null;
	}

	@Override
	public ProductEntity getByNameAndId(String name, int id) 
	{
		EntityManager manager=null;
		try
		{
			manager=SingletonUtil.getEntityManagerFactory().createEntityManager();
			Query query=manager.createNamedQuery("getByNameAndId");
			query.setParameter("nm", name);
			query.setParameter("id", id);
			return(ProductEntity) query.getSingleResult();
		}
		catch (PersistenceException e) {
			e.printStackTrace();
		}
		finally {
			if(manager!=null)
			{
				manager.close();
			}
		}
		return null;
	}

	@Override
	public String getByName(String name)
	{
		EntityManager manager=null;
		try
		{
			manager=SingletonUtil.getEntityManagerFactory().createEntityManager();
			Query query=manager.createNamedQuery("getByName");
			query.setParameter("nm", name);
		    return(String) query.getSingleResult();
		}
		catch (PersistenceException e) {
			e.printStackTrace();
		}
		finally {
			if(manager!=null)
			{
				manager.close();
			}
		}
		return null;
	}

	@Override
	public double getByPriceGreaterThan(double price) 
	{
		EntityManager manager=null;
		try
		{
			manager=SingletonUtil.getEntityManagerFactory().createEntityManager();
			Query query=manager.createNamedQuery("getByPriceGreaterThan");
			query.setParameter("pr", price);
			return(double) query.getSingleResult();
		}
		catch (PersistenceException e) {
			e.printStackTrace();
		}
		finally {
			if(manager!=null)
			{
				manager.close();
			}
		}
		return 0;
	}
}
