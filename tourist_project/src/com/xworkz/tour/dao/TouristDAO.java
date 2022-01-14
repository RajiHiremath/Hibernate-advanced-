package com.xworkz.tour.dao;

import java.util.List;

import com.xworkz.tour.entity.TouristEntity;

public interface TouristDAO 
{
 public void put(TouristEntity entity);
 
 public void addAll(List<TouristEntity> entities);
}
