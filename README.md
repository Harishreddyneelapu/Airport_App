# Airport_App
This repository contains a simple Airport Management System implemented in Java using the Spring Framework and Hibernate for data persistence. The system allows users to perform various operations related to airports, such as adding, updating, and deleting airport information.
# Airport Management System

This repository contains a simple Airport Management System implemented in Java using the Spring Framework and Hibernate for data persistence. The system allows users to perform various operations related to airports, such as adding, updating, and deleting airport information.

## Project Structure

- **src/main/java/com/tap/airport:** Contains the source code for the Airport Management System.
  - **AirportTester.java:** The main class for testing and running the application.
  - **dao:** Contains the data access objects for interacting with the database.
    - **AirportDAO.java:** Interface defining the methods for data access.
    - **AirportDAOImpl.java:** Implementation of the AirportDAO interface using Hibernate.
  - **entity:** Contains the AirportEntity class representing the structure of the Airport table in the database.
  - **service:** Contains the service layer interfaces and implementations.
    - **AirportService.java:** Interface defining methods for validating airport-related data.
    - **AirportServiceImpl.java:** Implementation of the AirportService interface.

- **src/main/resources:** Contains the configuration files.
  - **beanConfig.xml:** Spring configuration file for defining beans.
  
- **README.md:** This file providing information about the project.

## How to Run

1. Clone the repository to your local machine.
2. Open the project in your favorite Java IDE.
3. Ensure you have a MySQL database set up, and update the Hibernate configuration in **beanConfig.xml** with your database credentials.
4. Run the **AirportTester.java** class to test the functionality.

## Features

- Add new airport information.
- Update airport information by name, ID, or location.
- Retrieve airport information by ID.
- Get the count of runways and available planes for a specific airport.
- Delete airport information by ID.
- View all data in the airport table.

## Dependencies

- Java
- Spring Framework
- Hibernate
- MySQL

## Contributions

Contributions are welcome! If you find any issues or have suggestions for improvements, feel free to create an issue or submit a pull request.

