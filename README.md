###
DEMO Azure functions integration in Spring Boot application

## 
Running the project

#

Spring Application

- ./mvnw spring-boot:run
- Post endpoint http://localhost:8080/, send string in body

#

Azure function

- ./mvnw clean package
- ./mvnw azure-functions:run
- Post and Get endpoints http://localhost:7071/api/hello, send string in body
  
