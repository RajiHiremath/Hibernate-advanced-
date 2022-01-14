package com.xworkz.silk;

import com.xworkz.silk.dao.SilkManufacturerDAO;
import com.xworkz.silk.dao.SilkManufacturerDAOImpl;
import com.xworkz.silk.entity.SilkManufacturerEntity;

public class SilkManufacturerScammer 
{
 public static void main(String[] args) {
	
	 SilkManufacturerEntity entity1=new SilkManufacturerEntity(1, "Handwoven Kanchipuram silk", "Yemalur-Bangalore", "woven", "party wear", "thin border", 5);
	 SilkManufacturerEntity entity2=new SilkManufacturerEntity(2, "Banarasi silk", "Guddadahalli-Bangalore", "silk", " Wedding wear", "no border", 3);
	 SilkManufacturerEntity entity3=new SilkManufacturerEntity(3, "Kanjivaram silk", "Mahadevapura-Bangalore", "silky", "Wedding wear", "thick border", 10);
	 
	 SilkManufacturerDAO dao=new SilkManufacturerDAOImpl();
	 dao.putSilk(entity1);
	 dao.putSilk(entity2);
	 dao.putSilk(entity3);
	 
  }
}
