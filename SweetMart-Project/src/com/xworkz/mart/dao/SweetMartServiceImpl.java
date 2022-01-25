package com.xworkz.mart.dao;

import com.xworkz.mart.entity.SweetMartEntity;

public class SweetMartServiceImpl implements SweetMartService
{

	private SweetMartDAO dao;
	
	public SweetMartServiceImpl(SweetMartDAO dao) 
	{
		super();
		this.dao = dao;
	}

	@Override
	public void validationAndSave(SweetMartEntity entity) 
	{
		if(entity.getName()!=null || !entity.getName().isEmpty() && entity.getName().length()>3 && entity.getName().length()<25 )
		{
			dao.save(entity);
		}
		if(entity.getOwnerName()!=null || !entity.getOwnerName().isEmpty() && entity.getOwnerName().length()>3 && entity.getOwnerName().length()<25)
		{
			dao.save(entity);
		}
		if(!(entity.getPhoneNo()<3) && !(entity.getPhoneNo()>500000))
		{
			dao.save(entity);
		}
		if(!(entity.getAlternativeNo()<3 && !(entity.getAlternativeNo()>500000)))
		{
			dao.save(entity);
		}
		if(entity.getEmail()!=null || !entity.getEmail().isEmpty() && entity.getEmail().length()>3 && entity.getEmail().length()>25)
		{
			dao.save(entity);
		}
		if(entity.getAddress()!=null || !entity.getAddress().isEmpty() && entity.getAddress().length()>3 && entity.getAddress().length()>25)
		{
			dao.save(entity);
		}
		if(!(entity.getStarted()<3 && !(entity.getStarted()>500000)))
		{
			dao.save(entity);
		}
		if(!(entity.getNoOfWorkers()<3) && !(entity.getNoOfWorkers()>500000))
		{
			dao.save(entity);
		}
		if(entity.getOpenTime()!=null || !entity.getOpenTime().isEmpty() && entity.getOpenTime().length()>3 && entity.getOpenTime().length()<25)
		{
			dao.save(entity);
		}
		if(entity.getCloseTime()!=null || !entity.getCloseTime().isEmpty() && entity.getCloseTime().length()>3 && entity.getCloseTime().length()<25)
		{
			dao.save(entity);
		}
		if(entity.getAreaOfManufacture()!=null || !entity.getAreaOfManufacture().isEmpty() && entity.getAreaOfManufacture().length()>3 && entity.getAreaOfManufacture().length()<25)
		{
			dao.save(entity);
		}
		if(entity.getQuality()!=null || !entity.getQuality().isEmpty() && entity.getQuality().length()>3 && entity.getQuality().length()<25)
		{
			dao.save(entity);
		}
		if(entity.getCreatedBy()!=null ||!entity.getCreatedBy().isEmpty() && entity.getCreatedBy().length()>3 && entity.getCreatedBy().length()<25)
		{
			dao.save(entity);
		}
		if(entity.getCreatedAT()!=null)
		{
			dao.save(entity);
		}
		if(entity.getUpdatedBy()!=null || !entity.getUpdatedBy().isEmpty() && entity.getUpdatedBy().length()>3 && entity.getUpdatedBy().length()<25)
		{
			dao.save(entity);
		}
		if(entity.getUpdatedAt()!=null)
		{
			dao.save(entity);
		}
	}

}
