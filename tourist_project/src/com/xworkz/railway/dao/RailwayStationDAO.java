package com.xworkz.railway.dao;

import java.util.List;

import com.xworkz.railway.entity.RailwayStationEntity;

public interface RailwayStationDAO {
 
	 public void putRailway(RailwayStationEntity entity);
	 
	 public void addAll(List<RailwayStationEntity> entities);
}
