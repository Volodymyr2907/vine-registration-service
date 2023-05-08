
# Vine Registration Service

Spring boot application that provides eureka registration server for Vine PET project 

## Service Requirements

- verify that port 8761 not in use or change port in [application.yml](src/main/resources/application.yml)

## How to run

1. ```bash mvn clean install```
2. run [Eureka registry](src/test/java/com/mentorship/vineregistrationservice/VineRegistrationServiceApplicationTests.java);