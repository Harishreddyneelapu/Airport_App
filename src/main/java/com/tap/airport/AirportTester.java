package com.tap.airport;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tap.airport.dao.AirportDAO;
//import com.tap.airport.entity.AirportEntity;
//import com.tap.airport.service.AirportService;

public class AirportTester{
	public static void main(String[] args) {
		String configuration = "beanConfig.xml";
		Scanner scan = new Scanner(System.in);
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configuration);
		System.out.println(applicationContext);
		
		AirportDAO airportDAO = applicationContext.getBean(AirportDAO.class);
//		AirportService service = applicationContext.getBean(AirportService.class);
		
//		AirportEntity entity = new AirportEntity("aari", "jdbhsbf", 22, 5);
//		
//		AirportService service = applicationContext.getBean(AirportService.class);
//		
//		boolean isValid = service.validateAirportEntity(entity);
//		if(isValid) {
//			
//			airportDAO.saveAirportEntity(entity);
//		}else {
//			System.out.println("try again .... data is invalid, save operation cannot be done");
//		}
//		System.out.println("Enter id for get data");
//		int id = scan.nextInt();
//		if(service.validateAirportEntityId(id)) {
//			System.out.println(airportDAO.getAirportEntity(id));
//		}else {
//			System.out.println("id not be a negetive or zero number");
//		}
//		System.out.print("Enter the airport name: ");
//        String airportName = scan.next();
//
//        if (service.validateAirportEntityName(airportName)) {
//            System.out.print("Enter the new terminal count: ");
//            int newTerminalCount = scan.nextInt();
//
//            System.out.print("Enter the new runway count: ");
//            int newRunwayCount = scan.nextInt();
//            
//            System.out.println("enter the new aiport location");
//            String airportLocation = scan.next();
//            
//
//            int rowsUpdated = airportDAO.updateAirportEntityByName(airportName, newTerminalCount, newRunwayCount, airportLocation);
//
//            if (rowsUpdated > 0) {
//                System.out.println(rowsUpdated + " rows updated successfully.");
//            } else {
//                System.out.println("No rows updated. Please check the airport name.");
//            }
//        } else {
//            System.out.println("Invalid airport name. Please try again.");
//        }
//		System.out.println("Enter the airport id to update");
//		int id = scan.nextInt();
//		if(service.validateAirportEntityId(id)) {
//			
//			System.out.println("enter name of the airport");
//			String name = scan.next();
//			
//			System.out.println("enter the no.of planes");
//			int planes = scan.nextInt();
//			
//			System.out.println("enter the no.of run ways");
//			int runways = scan.nextInt();
//			
//			System.out.println("enter the location of the airport");
//			String location = scan.next();
//			
//			int rowsUpdated = airportDAO.updateAirportEntityById(id, name, planes, runways, location);
//	
//            if (rowsUpdated > 0) {
//                System.out.println(rowsUpdated + " rows updated successfully.");
//            } else {
//                System.out.println("No rows updated. Please check the airport name.");
//            }
//		}else {
//			System.out.println("Invalid airport id. Please try again.");
//		}
//		System.out.println("enter the airport location to update");
//		String location = scan.next();
//		if(service.validateAirportEntityLocation(location)) {
//			
//			System.out.println("enter airport id");
//			int id = scan.nextInt();
//			
//			System.out.println("enter airport name ");
//			String name = scan.next();
//			
//			System.out.println("enter no.of planes");
//			int planes = scan.nextInt();
//			
//			System.out.println("enter no.of runways ");
//			int runways = scan.nextInt();
//			
//			
//			int rowsUpdated = airportDAO.updateAirportEntityByLocation(location, id, name, planes, runways);
//			if (rowsUpdated > 0) {
//				System.out.println(rowsUpdated + " rows updated successfully.");
//	        } else {
//	            System.out.println("No rows updated. Please check the airport name.");
//	        }
//			
//		}else {
//			System.out.println("Invalid airport location. Please try again.");
//		}
//		System.out.println("enter the id to get no of runways");
//		int id = scan.nextInt();
//		if(service.validateAirportEntityId(id)) {
//			int result = airportDAO.getCountOfRunwaysById(id);
//			System.out.println(result + " runways are in airport");
//		}else {
//			System.out.println("invalid airport id, please try again");
//		}
		
//		System.out.println("enter the id to get the no.of planes");
//		int id = scan.nextInt();
//		if(service.validateAirportEntityId(id)) {
//			int result = airportDAO.getAvailablePlanesById(id);
//			System.out.println(result +" planes are in airport");
//		}
//		else {
//			System.out.println("invalid airport id, please try again");
//		}
//		System.out.println("enter airport id to delete");
//		int id = scan.nextInt();
//		if(service.validateAirportEntityId(id)) {
//			int res = airportDAO.deleteAirportEntityById(id);
//			if(res==1) {
//				System.out.println("successfully deleted");
//			}else {
//				System.out.println("data didn't existed");
//			}
//		}else {
//			System.out.println("invalid airport id, please try again");
//		}
//		
		System.out.println("all Data of the table");
		System.out.println(airportDAO.getAllAirportEntity());
		ClassPathXmlApplicationContext ioc =(ClassPathXmlApplicationContext)applicationContext;
		ioc.close();
		scan.close();
		
		System.out.println("end of the spring application.........");
	
	
	
	}
}


