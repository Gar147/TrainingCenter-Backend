# Training Center Management API

## Project Description:

This project is a RESTful API for managing training centers. It allows users to create new training centers and retrieve a list of all saved training centers from a database. The project is built using Spring Boot, H2 in-memory database, and JPA for persistence.

The API provides:
- Creating a new training center.
- Retrieving all stored training centers.
- Optional filtering on `centerName` and `centerCode`.
## Features/Functionalities
- Create a new Training Center via POST API.
- Retrieve all saved Training Centers via GET API.
- Basic validations on the input fields.
- Exception handling for validation and bad requests.
## Prerequisites
- Java 11 or higher.
- Maven 3.6+.
- IDE like IntelliJ IDEA, Eclipse, or VSCode (optional).
- Postman or cURL for testing the API.

##   How to Run the Application
### Step 1: Clone the Repository
git clone https://github.com/Gar147/TrainingCenter-Backend

cd training-center-api

### Step 2: Build the Project
mvn clean install

### Step 3: Run the Application
To run the project, use the Maven Spring Boot command:

Alternatively, you can run the TrainingCenterApplication class from your IDE (IntelliJ, Eclipse).

The application will start on localhost:8080.

### Step 4: Access the Application

Once the application starts successfully, you can:

Open your browser and go to http://localhost:8080/h2-console to access the H2 database console.
Use tools like Postman or cURL to interact with the API.

#### Postman:

* For GET request:
GET http://localhost:8080/api/training-centers
* For POST request:
POST http://localhost:8080/api/training-centers
Body (JSON):

{

"centerCode": "TC1001",

"centerName": "Traini8 Center",

"createdOn": "2023-10-08T12:00:00Z"

}

##   API Endpoints Description
### Endpoint 1: Create a Training Center
URL: POST /api/training-centers

Description: This endpoint is used to create a new training center.
* Request Body Example:

  {

  "centerCode": "TC1001",

  "centerName": "Traini8 Center",

  "createdOn": "2024-10-01T10:15:30Z"

  }
* Response (201 Created):

  {

  "centerCode": "TC1001",

  "centerName": "Traini8 Center",

  "createdOn": "2024-10-01T10:15:30Z"

  }
### Endpoint 2: Get All Training Centers
URL: GET /api/training-centers

Description: This endpoint retrieves a list of all training centers saved in the database.
* Response Example (200 OK):

json

{

"centerCode": "TC1001",

"centerName": "Traini8 Center",

"createdOn": "2024-10-01T10:15:30Z"

},

{

"centerCode": "TC1002",

"centerName": "Traini8 Learning Hub",

"createdOn": "2024-10-02T10:15:30Z"

}
## Technologies Used:
- Java 11
- Spring Boot 2.x
- Spring Data JPA
- H2 In-Memory Database
- Maven
- Postman (for API testing)
## Setup Instructions:
### Database Setup:
#### Describes how to interact with the H2 console:
1. After starting the application, go to http://localhost:8080/h2-console.
3. JDBC URL: jdbc:h2:mem:testdb
5. Username: sa
7. Password: (leave blank).
