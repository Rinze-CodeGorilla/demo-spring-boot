# Spring Boot Demo project

The DemoController has methods for
* The home page which shows some HTML: GET http://localhost:8080/
* The list of persons: GET http://localhost:8080/persons
* Retrieving a single person: GET http://localhost:8080/persons/{id} where {id} is the index of the arraylist in which persons are stored
* Adding a person: POST to http://localhost:8080/persons

The build.gradle file has dependencies for
* spring-boot-starter-web which provides controllers and conversion to and from json
* springdoc-openapi-starter-webmvc which provides a UI to see descriptions and a test interface for all the DemoController endpoints at http://localhost:8080/swagger-ui/index.html
* test to allow for automatic testing of spring boot, these are added by the default but we aren't really using them

The Person and Address classes are our domain objects

A record is an immutable class only for storing data, which is shorter to write than a regular class
