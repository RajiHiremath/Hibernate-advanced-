package com.xworkz.airport.dao;

import java.util.List;

import com.xworkz.airport.entity.AirportEntity;

public interface AirportDAO {

		public void putAirport(AirportEntity entity);

		public void addAll(List<AirportEntity> entities);
	}

