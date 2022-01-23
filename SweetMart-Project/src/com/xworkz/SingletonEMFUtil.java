package com.xworkz;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SingletonEMFUtil {

	private static EntityManagerFactory entityManagerFactory;
	
	public static EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}
	static
	{
		entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
	}
}
