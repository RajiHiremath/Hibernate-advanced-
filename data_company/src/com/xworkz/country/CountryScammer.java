package com.xworkz.country;

import com.xworkz.country.dao.CountryDAO;
import com.xworkz.country.dao.CountryDAOImpl;
import com.xworkz.country.entity.CountryEntity;

public class CountryScammer {

	public static void main(String[] args) {

     CountryEntity entity1=new CountryEntity(1,"India","Asia",133867678l);
     CountryEntity entity2=new CountryEntity(2,"America","North America",592072212l);
     CountryEntity entity3=new CountryEntity(3,"Australia","Australian-New Guinea",39000000l);
     CountryEntity entity4=new CountryEntity(4,"Africa","Africa",1373486472l);
     CountryEntity entity5=new CountryEntity(5,"America"," South America",434260138l);

     CountryDAO dao=new CountryDAOImpl();
     dao.create(entity1);
     dao.create(entity2);
     dao.create(entity3);
     dao.create(entity4);
     dao.create(entity5);
     
        CountryEntity idEntity=dao.getById(3);
		System.out.println(idEntity);

		dao.updatePopulationById(8907574757l,3);
     
	}

}
