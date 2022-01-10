package com.xworkz.city;

import com.xworkz.city.dao.CityDAO;
import com.xworkz.city.dao.CityDAOImpl;
import com.xworkz.city.entity.CityEntity;

public class CityScammer {

	public static void main(String[] args) {
		
		CityEntity entity1=new CityEntity(1,"Bangalore", 456789d,"Malls","Red zone");
		CityEntity entity2=new CityEntity(2,"Mysore", 56789d,"Palace","Red zone");
		CityEntity entity3=new CityEntity(3,"Gangavti", 10789d,"Rice paddy","Yellow zone");
		CityEntity entity4=new CityEntity(4,"Koppal", 11789d,"Gavi math","Yellow zone");
		CityEntity entity5=new CityEntity(5,"Dharwad", 56738d,"Education","Red zone");
		
		CityDAO dao=new CityDAOImpl();
		dao.create(entity5);
		dao.create(entity4);
		dao.create(entity3);
		dao.create(entity2);
		dao.create(entity1);
		
		CityEntity idEntity=dao.getById(3);
		System.out.println(idEntity);
		
		dao.updatePopulationById(45677d, 4);
		
	}

}
