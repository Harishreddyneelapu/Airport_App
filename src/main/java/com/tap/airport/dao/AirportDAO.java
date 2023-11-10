package com.tap.airport.dao;

import java.util.List;

import com.tap.airport.entity.AirportEntity;

public interface AirportDAO {
	void saveAirportEntity(AirportEntity entity);
	AirportEntity getAirportEntity(int id);
	int updateAirportEntityByName(String Name, int runways, int planes, String location);
	int updateAirportEntityById(int id, String name, int planes, int runways, String location);
	int updateAirportEntityByLocation(String location, int id, String name, int planes, int runways);
	int getCountOfRunwaysById(int id);
	int getAvailablePlanesById(int id);
	
	int deleteAirportEntityById(int id);
	List<AirportEntity> getAllAirportEntity();
}
