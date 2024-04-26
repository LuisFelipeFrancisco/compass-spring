# Web Services Project with Spring Boot and JPA / Hibernate

This project aims to create a web system using Spring Boot and JPA / Hibernate to manage a specific domain model. It covers everything from the initial project setup to the implementation of CRUD (Create, Read, Update, Delete) functionalities and exception handling.

## Objectives

- Create a Spring Boot project in Java.
- Implement the domain model.
- Structure the logical layers: config, entities, repositories, resources, and services.
- Configure a test database (H2).
- Populate the database with initial data.
- Implement CRUD operations for data manipulation.
- Handle exceptions appropriately.

## Technologies Used

- Spring Boot
- Spring Data JPA
- Hibernate
- H2 Database

## Project Structure

The project is organized into several packages to maintain a clean and modular codebase:

1. **config:** Contains configuration classes for Spring Boot, database configuration, and other application settings.
2. **entities:** Holds the domain model entities representing the data structure of the application.
3. **repositories:** Provides interfaces for data access operations, defining methods for CRUD operations and query execution.
4. **resources:** Contains REST controllers responsible for handling HTTP requests and interacting with the service layer.
5. **services:** Implements the business logic of the application, performing operations on the data accessed through repositories.

## Test Database (H2)

The project is configured to use an H2 in-memory database to facilitate development and testing. Database configurations can be found in the `application-test.properties` file.

## CRUD Operations

CRUD (Create, Read, Update, Delete) operations are implemented to allow manipulation of the domain model data.

## Exception Handling

The project has appropriate exception handling to deal with unexpected situations during the application's execution. This ensures a better user experience and facilitates system maintenance.