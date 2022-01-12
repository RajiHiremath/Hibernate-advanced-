package com.xworkz.tour;
import com.xworkz.tour.dao.TouristDAO;
import com.xworkz.tour.dao.TouristDAOImpl;
import com.xworkz.tour.entity.BiscuitEntity;
import com.xworkz.tour.entity.FactoryEntity;
import com.xworkz.tour.entity.MedicineEntity;
import com.xworkz.tour.entity.RailwayStationEntity;
import com.xworkz.tour.entity.SilkManufacturerEntity;
import com.xworkz.tour.entity.TouristEntity;

public class TouristScammer 
{
 public static void main(String[] args) {
	 TouristEntity entity1=new TouristEntity(1,"Shimogga",1200.34f,"Water falls",500,"Rainy Season");
	 TouristEntity entity2=new TouristEntity(2,"Mysore",700.0f,"Palace",500,"Rainy Season");
	 TouristEntity entity3=new TouristEntity(3,"Hampi",998.0f,"Virupaksha temple",00,"All Season");
	
	 
	 TouristDAO dao=new TouristDAOImpl();
     dao.put(entity3);
	 dao.put(entity2);
	 dao.put(entity1);
	 
	 BiscuitEntity entity4=new BiscuitEntity(4,"Cadbury","Bournvita","Orange",140,5,"1905-England");
	 BiscuitEntity entity5=new BiscuitEntity(5,"cadbury ","cadbury Chocobakes","Purple",20,10,"200-Europe");
	 BiscuitEntity entity6=new BiscuitEntity(6,"Parle","Parle-G","Yellow",100,5,"1879-England");
 
	 TouristDAO dao1=new TouristDAOImpl();
	 dao1.putBiscuit(entity6);
	 dao1.putBiscuit(entity5);
	 dao1.putBiscuit(entity4);
	 
	 RailwayStationEntity entity7=new RailwayStationEntity(7, "Almatti", "Almatt", 3, true, 19, "LMT");
	 RailwayStationEntity entity8=new RailwayStationEntity(8, "Bangalore City Junction", "Bangalore", 6, true, 42,"SBC");
	 RailwayStationEntity entity9=new RailwayStationEntity(9, "	Toranagallu Railway Station", "	Toranagallu", 10, true, 61,"TNGL");
	 
	 TouristDAO dao2=new TouristDAOImpl();
	 dao2.putRailway(entity7);
	 dao2.putRailway(entity8);
	 dao2.putRailway(entity9);
	 
	 FactoryEntity entity10=new FactoryEntity(10, "Britannia Industries", "Bangalore", "Food", 4500, 23345d);
	 FactoryEntity entity11=new FactoryEntity(11, "Mysore Sandal Shop", "Near Iskcon temple-Bangalore", "Soap", 2100, 13345d);
	 FactoryEntity entity12=new FactoryEntity(12, "Sugar Factory", "Mundargi", "Food", 2500, 2334d);
	 
	 TouristDAO dao3=new TouristDAOImpl();
	 dao3.putFactory(entity10);
	 dao3.putFactory(entity11);
	 dao3.putFactory(entity12);
	 
	 MedicineEntity entity13=new MedicineEntity(13,"Zincold", "Apollo","capsules", "pink", 100.0f,12);
	 MedicineEntity entity14=new MedicineEntity(14,"Dolo 650", "Med Plus","capsules", "white", 150.0f,10);
	 MedicineEntity entity15=new MedicineEntity(15,"Respira", "Apollo","syrup", "orange", 300.0f,2);
	 
	 TouristDAO dao4=new TouristDAOImpl();
	 dao4.putMedicine(entity13);
	 dao4.putMedicine(entity14);
	 dao4.putMedicine(entity15);
	 
	 SilkManufacturerEntity entity16=new SilkManufacturerEntity(16, "Handwoven Kanchipuram silk", "Yemalur-Bangalore", "woven", "party wear", "thin border", 5);
	 SilkManufacturerEntity entity17=new SilkManufacturerEntity(17, "Banarasi silk", "Guddadahalli-Bangalore", "silk", " Wedding wear", "no border", 3);
	 SilkManufacturerEntity entity18=new SilkManufacturerEntity(18, "Kanjivaram silk", "Mahadevapura-Bangalore", "silky", "Wedding wear", "thick border", 10);
	 
	 TouristDAO dao5=new TouristDAOImpl();
	 dao5.putSilkManufacturer(entity16);
	 dao5.putSilkManufacturer(entity17);
	 dao5.putSilkManufacturer(entity18);
	 
	 
	 
}
}
