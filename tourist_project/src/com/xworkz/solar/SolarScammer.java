package com.xworkz.solar;

import com.xworkz.solar.dao.SolarDAO;
import com.xworkz.solar.dao.SolarDAOImpl;
import com.xworkz.solar.entity.SolarEntity;

public class SolarScammer 
{
  public static void main(String[] args) {
	
	  SolarEntity entity1=new SolarEntity(1,"SunPower","Small",600,1,190);
	  SolarEntity entity2=new SolarEntity(2,"Canadian Solar","Medium",1000,2,250);
	  SolarEntity entity3=new SolarEntity(3,"Panasonic","Big",4500,2,1000);
		 
	  SolarDAO dao=new SolarDAOImpl();
		 dao.putSolar(entity1);
		 dao.putSolar(entity2);
		 dao.putSolar(entity3);
}
}
