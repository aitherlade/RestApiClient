# RestApiClient
This project demonstrates a simple implementation of microservices using Java, PostgreSQL, Spring REST, Spring Data and SpringBoot modules of Spring Framework. The project also utilizes the Apache Maven build tool.

The project idea is to develop a sensor that can automatically measure temperature and detect rainfall,and then send the collected data to a server for future analysis. Furthermore, the project aims to provide a client-side interface to access the data.

The project consists of two parts:

Our server, which processes requests and saves data to a database. It is a REST API developed using Spring REST.

REST API client that sends requests using RestTemplate.

Functionallity:

register a new sensor
get all of the available sensors
send measurements using one of the existing sensor
get measurements and sensor who sent data
calculate the total number of raining days based on all measurements
