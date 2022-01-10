package com.xworkz.company.dao;

import com.xworkz.company.entity.CompanyEntity;

public interface CompanyDAO {

	public void create(CompanyEntity entity);
	
	default CompanyEntity getById(int id)
	{
		return null;
	}
	default void updateWebsiteById(String newWebsite,int id)
	{
		
	}
}
