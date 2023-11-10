package com.tap.airport.dao;

import java.util.List;
import java.util.Objects;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tap.airport.entity.AirportEntity;
@Component
public class AirportDAOImpl implements AirportDAO{
	@Autowired
	SessionFactory sessionFactory;
	
	
	public AirportDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
		System.out.println("sessionfactory injected ny ioc container");
	}
	

	public void saveAirportEntity(AirportEntity entity) {
		// TODO Auto-generated method stub
		System.out.println("invoked saveAirportEntity");
		Session session = null;
		try {
			
			session = this.sessionFactory.openSession();
			session.beginTransaction();
			session.save(entity);	
			session.getTransaction().commit();
			
		}finally {
			if(session!=null) {
				session.close();
				System.out.println("session is closed");
			}
			
		}
	}

	
	public int updateAirportEntityByName(String name, int planes, int runways, String location) {
	    System.out.println("invoked updateAirportEntityByName");
	    Session session = null;
	    try {
	        session = this.sessionFactory.openSession();
	        session.beginTransaction();

	        Query query = session.createQuery("UPDATE AirportEntity SET NO_OF_PLANES = :newPlanes, NO_OF_RUNWAYS = :newRunways, AIRPORT_LOCATION = :newLocation WHERE AIRPORT_NAME = :airportName");
	        query.setParameter("newPlanes", planes);
	        query.setParameter("newRunways", runways);
	        query.setParameter("newLocation", location);
	        query.setParameter("airportName", name);

	        int rowsUpdated = query.executeUpdate();

	        session.getTransaction().commit();
	        return rowsUpdated;
	    } finally {
	        if (session != null) {
	            session.close();
	            System.out.println("session is closed");
	        }
	    }
	}
	
	
	public int updateAirportEntityById(int id, String name, int planes, int runways, String location) {
		// TODO Auto-generated method stub
		System.out.println("invoked updateAirportEntityById");
		Session session = null;
		try {
			session = this.sessionFactory.openSession();
	        session.beginTransaction();
	        Query query = session.createQuery("UPDATE AirportEntity SET NO_OF_PLANES = :newPlanes, NO_OF_RUNWAYS = :newRunways,"
	        		+ " AIRPORT_LOCATION = :newLocation,AIRPORT_NAME = :airportName WHERE AIRPORT_ID = :airportId");
	        query.setParameter("airportId", id);
	        query.setParameter("newPlanes", planes);
	        query.setParameter("newRunways", runways);
	        query.setParameter("newLocation", location);
	        query.setParameter("airportName", name);
	        
	        int rowsUpdated = query.executeUpdate(); // Execute the update query

	        session.getTransaction().commit();
	        return rowsUpdated;
	        
		}finally {
			if (session != null) {
	            session.close();
	            System.out.println("session is closed");
	        }
		}
		
	}

	

	public int updateAirportEntityByLocation(String location, int id, String name, int planes, int runways) {
	    System.out.println("invoked updateAirportEntityByLocation");
	    Session session = null;
	    try {
	        session = this.sessionFactory.openSession();
	        session.beginTransaction();
	        Query query = session.createQuery("UPDATE AirportEntity SET AIRPORT_ID = :airportId, NO_OF_PLANES = :newPlanes, NO_OF_RUNWAYS = :newRunways, AIRPORT_NAME = :airportName WHERE AIRPORT_LOCATION = :newLocation");
	        query.setParameter("airportId", id);
	        query.setParameter("newPlanes", planes);
	        query.setParameter("newRunways", runways);
	        query.setParameter("newLocation", location);
	        query.setParameter("airportName", name);
	        
	        int rowsUpdated = query.executeUpdate(); // Execute the update query

	        session.getTransaction().commit();
	        return rowsUpdated;
	    } finally {
	        if (session != null) {
	            session.close();
	            System.out.println("session is closed");
	        }
	    }
	}
	
	
	public AirportEntity getAirportEntity(int id) {
		// TODO Auto-generated method stub
		System.out.println("invoked getAirportEntity");
		Session session = null;
		AirportEntity entity = null;
		try {
			session = sessionFactory.openSession();
			entity = session.get(AirportEntity.class, id);
			if(Objects.nonNull(entity)) {
				return entity;
			}else {
				System.out.println("airportEntity not found. please provide valid id");
			}
		}finally {
			if(session!=null) {
				session.close();
				System.out.println("session is closed");
			}
		}
		return entity;
	}
	
	
	public int getCountOfRunwaysById(int id) {
	    System.out.println("invoked getCountOfRunwaysById");
	    Session session = null;
	    int runwayCount = 0;

	    try {
	        session = sessionFactory.openSession();
	        session.beginTransaction();

	        AirportEntity entity = session.get(AirportEntity.class, id);
	        if (entity != null) {
	            runwayCount = entity.getNoOfRunways();
	        } else {
	            System.out.println("Airport with id " + id + " not found.");
	        }

	        session.getTransaction().commit();
	    }finally {
	        if (session != null) {
	            session.close();
	            System.out.println("session is closed");
	        }
	    }

	    return runwayCount;
	}


	public int getAvailablePlanesById(int id) {
		// TODO Auto-generated method stub
		System.out.println("invoked getAvailablePlanesById");
	    Session session = null;
	    int planesCount = 0;
	    try {
	    	session = sessionFactory.openSession();
	        session.beginTransaction();
	    	AirportEntity entity = session.get(AirportEntity.class, id);
	    	if (Objects.nonNull(entity)) {
	    		planesCount = entity.getNoOfPlanes();
	        } else {
	            System.out.println("Airport with id " + id + " not found.");
	        }

	        session.getTransaction().commit();
	    	
	    }finally {
	    	if (session != null) {
	            session.close();
	            System.out.println("session is closed");
	        }
	    }
		return planesCount;
	}
	
	

	public int deleteAirportEntityById(int id) {
		// TODO Auto-generated method stub
		System.out.println("invoked deleteAirportEntityById");
		Session session = null;
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			
			AirportEntity entity = session.get(AirportEntity.class, id);
			
			if(Objects.nonNull(entity)) {
				session.delete(entity);
				session.getTransaction().commit();
				return 1;
			}else {
				System.out.println("Airport with ID " + id + " not found.");
			}
		}finally {
			if (session != null) {
	            session.close();
	            System.out.println("session is closed");
	        }
		}
		return 0;
	}

	
	public List<AirportEntity> getAllAirportEntity() {
	    System.out.println("invoked getAllAirportEntity");
	    Session session = null;
	    List<AirportEntity> airportEntities = null;

	    try {
	        session = sessionFactory.openSession();
	        airportEntities = session.createQuery("FROM AirportEntity", AirportEntity.class).list();
	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        if (session != null) {
	            session.close();
	            System.out.println("Session is closed");
	        }
	    }

	    return airportEntities;
	}
	
	
}