package com.xworkz.vendor.service;

import com.xworkz.vendor.dao.VendorDAO;
import com.xworkz.vendor.entity.VendorEntity;

public class VendorServiceImpl implements VendorService
{

	private VendorDAO dao;
	
	 public VendorServiceImpl(VendorDAO dao) 
	 {
		this.dao=dao;
	}
	@Override
	public boolean validateAndSave(VendorEntity entity) 
	{
		boolean valid=false;
		if(!(entity.getName().length()<5) && 
				!(entity.getName().length()>30) && 
				entity.getName()!=null && !(entity.getName().isEmpty()))
		{
			valid=true;
		}
		else
		{
			System.out.println("invalid name");
			valid=false;
			return valid;
		}
		if(entity.getEmail().contains("@") && 
				entity.getEmail().endsWith(".com") || 
				entity.getEmail().endsWith(".in") || 
				entity.getEmail().endsWith(".org") && 
				entity.getEmail()!=null && !(entity.getEmail().isEmpty()))
		{
			valid=true;
		}
		else
		{
			System.out.println("invalid email");
			valid=false;
			return valid;
		}
		if(!(entity.getLoginName().length()<7) && 
				!(entity.getLoginName().length()>12) && 
				entity.getLoginName()!=null && !(entity.getLoginName().isEmpty()))
		{
			valid=true;
		}
		else
		{
			System.out.println("invalid login name");
			valid=false;
			return valid;
		}
		if(entity.getPassword()!=null && 
				!(entity.getPassword().isEmpty()) && 
						!(entity.getPassword().length()<7) &&
						!(entity.getPassword().length()>20))
				{
			     valid=true;
				}
		else
		{
			System.out.println("invalid password");
			valid=false;
			return valid;
		}
		
		if(entity.getAddress()!=null && 
				!(entity.getAddress().isEmpty()) && 
				!(entity.getAddress().length()<30) && !(entity.getAddress().length()>100))
		{
			valid=true;
		}
		else
		{
			System.out.println("invalid address");
			valid=false;
			return valid;
		}
		if(entity.getGstNo()!=null && 
				!(entity.getGstNo().isEmpty()) && 
				entity.getGstNo().length()==15)
		{
			valid=true;
		}
		else
		{
			System.out.println("invalid gst number");
			valid=false;
			return valid;
		}
		if(entity.getCreatedBy()!=null && 
				!(entity.getCreatedBy().isEmpty()) && 
				!(entity.getCreatedBy().length()<5) && 
				!(entity.getCreatedBy().length()>30))
		{
			valid=true;
		}
		else
		{
			System.out.println("invalid created by");
			valid=false;
			return valid;
		}
		if(entity.getCreatedAt()!=null)
		{
			valid=true;
		}
		else
		{
			System.out.println("invalid created at");
			valid=false;
			return valid;
		}
		if(valid)
		{
			dao.save(entity);
		}
		return false;
	}

}
