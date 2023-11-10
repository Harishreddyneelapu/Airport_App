package com.tap.airport.service;

import com.tap.airport.entity.AirportEntity;

public interface AirportService {
	boolean validateAirportEntity(AirportEntity entity);
	boolean validateAirportEntityId(int id);
	boolean validateAirportEntityName(String name);
	boolean validateAirportEntityLocation(String location);
	boolean validateAirportEntityPlanes(int planes);
	boolean validateAirportEntityRunways(int runways);
}
