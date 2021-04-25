# Spring-Boot-Rest-API
Welcome to the repository, This project was developed in Spring Boot. The project is a simple REST API using Spring Boot to perform CRUD operation on Student database.

- Firstly, If you have not already installed Maven package manager. <br>
```
sudo apt install maven
```

- Then clone the repository <br>
```
git clone https://github.com/akshatsoni64/Spring-Boot-Rest-API.git
```

- Navigate to the Spring-Boot-Rest-API folder <br>
```
cd Spring-Boot-Rest-API
```

- Open Postgres DB and make a blank database called 'student' <br>
```
CREATE DATABASE student;
```

- Inside /src/main/resources update the database credentials in the application.properties file <br>
```
spring.datasource.username= <username_here> 

spring.datasource.password= <password_here>
```

- Install Maven dependencies for the project <br>
```
mvn dependency:resolve
```

- Fire-up the server <br>
```
mvn spring-boot:run
```
