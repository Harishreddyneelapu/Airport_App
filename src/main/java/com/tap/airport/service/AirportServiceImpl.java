package com.tap.airport.service;

import org.springframework.stereotype.Component;

import com.tap.airport.entity.AirportEntity;
@Component
public class AirportServiceImpl implements AirportService{

	
	
	public AirportServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println(this.getClass().getSimpleName()+"created");
	}

	public boolean validateAirportEntity(AirportEntity entity) {
		// TODO Auto-generated method stub
		boolean flag = false;
		if(entity == null) {
			throw new IllegalArgumentException("AirportEntity cannot be null");
		}
		if(entity.getAirportName() != null && !entity.getAirportName().isEmpty()
				&& !entity.getAirportName().isBlank()) {
			flag =true;
			System.out.println("AirportName is valid");
		}else {
			System.out.println("AirportName is not valid");
		}
		
		
		if(entity.getAirportLocation() != null && !entity.getAirportLocation().isEmpty()
				&& !entity.getAirportLocation().isBlank()) {
			flag = true;
			System.out.println("AirportLocation is valid");
		}else {
			System.out.println("AirportLocation is not valid");
		}
		
		
		
		return flag;
	}

	public boolean validateAirportEntityId(int id) {
		// TODO Auto-generated method stub
		return (id>0)? true: false;
	}

	public boolean validateAirportEntityName(String name) {
		// TODO Auto-generated method stub
		boolean flag = (name!= null && !name.isEmpty()
				&& !name.isBlank());
		return flag;
	}

	public boolean validateAirportEntityLocation(String location) {
		// TODO Auto-generated method stub
		boolean flag = (location!= null && !location.isEmpty()
				&& !location.isBlank());
		return flag;
	}

	public boolean validateAirportEntityPlanes(int planes) {
		// TODO Auto-generated method stub
		return (planes>0)? true: false;
	}

	public boolean validateAirportEntityRunways(int runways) {
		// TODO Auto-generated method stub
		return (runways>0)? true: false;
	}

}
