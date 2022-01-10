package com.xworkz.country.dao;
import com.xworkz.country.entity.CountryEntity;

public interface CountryDAO 
{
 public void create(CountryEntity entity);
 
 default CountryEntity getById(int id)
	{
		return null;
	}
	default void updatePopulationById(long population,int id)
	{
		
	}
	
    default void deleteId(int id) 
    {
		
	}
}
