package com.xworkz.sugar;

import com.xworkz.sugar.dao.SugarDAO;
import com.xworkz.sugar.dao.SugarDAOImpl;
import com.xworkz.sugar.entity.SugarEntity;

public class SugarScammer 
{
  public static void main(String[] args) {
	
	  SugarEntity entity=new SugarEntity(1,"Grape sugar","Bajaj Hindusthan",49,"Bengalore");
	  SugarEntity entity1=new SugarEntity(2,"Invert sugar","A & D Industries",100,"Chennai");
	  SugarEntity entity2=new SugarEntity(3,"Castor sugar","Bajaj Hindusthan",49,"Kolkata");
	  
		
		SugarDAO dao=new SugarDAOImpl();
		dao.putSugar(entity);
		dao.putSugar(entity1);
		dao.putSugar(entity2);
}
}
