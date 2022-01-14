package com.xworkz.factory;
import com.xworkz.factory.dao.FactoryDAO;
import com.xworkz.factory.dao.FactoryDAOImpl;
import com.xworkz.factory.entity.FactoryEntity;

public class FactoryScammer 
{
  public static void main(String[] args) {
	
	  FactoryEntity entity1=new FactoryEntity(1, "Britannia Industries", "Bangalore", "Food", 4500, 23345d);
		 FactoryEntity entity2=new FactoryEntity(2, "Mysore Sandal Shop", "Near Iskcon temple-Bangalore", "Soap", 2100, 13345d);
		 FactoryEntity entity3=new FactoryEntity(3, "Sugar Factory", "Mundargi", "Food", 2500, 2334d);
		 
		 FactoryDAO dao=new FactoryDAOImpl();
		 dao.putFactory(entity1);
		 dao.putFactory(entity2);
		 dao.putFactory(entity3);
}
}
