package com.xworkz.tour.dao;

import com.xworkz.tour.entity.BiscuitEntity;
import com.xworkz.tour.entity.FactoryEntity;
import com.xworkz.tour.entity.MedicineEntity;
import com.xworkz.tour.entity.RailwayStationEntity;
import com.xworkz.tour.entity.SilkManufacturerEntity;
import com.xworkz.tour.entity.TouristEntity;

public interface TouristDAO 
{
 public void put(TouristEntity entity);
 
 public void putBiscuit(BiscuitEntity entity);
 
 public void putRailway(RailwayStationEntity entity);
 
 public void putFactory(FactoryEntity entity);
 
 public void putMedicine(MedicineEntity entity);
 
 public void putSilkManufacturer(SilkManufacturerEntity entity);
}
