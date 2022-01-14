package com.xworkz.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMFUtil 
{

		private static EntityManagerFactory entityManagerFactory;
		
		public static EntityManagerFactory getEntityManagerFactory() 
		{
			System.out.println("invoked getEntityManagerFactory in EMFUtil ");
			return entityManagerFactory;
		}
		
		static 
		{
			System.out.println("Invoked Create Entity Manager Factory");
			entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz.tour");
		}
	}

