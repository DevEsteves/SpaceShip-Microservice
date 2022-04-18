# SpaceShip-Microservice 

Repository for a Space Ship Microservice built with Java, Spring Boot and Maven. 2nd version built with Micronaut and 3nd version built with Quarkus.

## Running locally - Spring Boot

```
$ git clone https://github.com/DevEsteves/SpaceShip-Microservice.git
$ cd SpaceShip-Microservice
$ cd SpringBoot-Microservice
$ mvn package
$ mvn exec:java -Dexec.mainClass="com.example.springbootmicroservice.SpringBootMicroserviceApplication"
```

## Running locally - Micronaut (Chocolatey required)
```
$ git clone https://github.com/DevEsteves/SpaceShip-Microservice.git
$ cd SpaceShip-Microservice
$ cd Micronaut-Microservice/space
$ mn
```

## Running locally - Quarkus (Chocolatey required)

```
$ git clone https://github.com/DevEsteves/SpaceShip-Microservice.git
$ cd SpaceShip-Microservice
$ Quarkus-microservice/code-with-quarkus
$ quarkus dev
```