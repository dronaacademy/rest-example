## Example spring boot REST web service

This is a sample Spring boot REST web service to demonstrate how REST web services are created.
The spring modules used in this project are: Web and Data JPA. The database is MySQL.

### Prerequisites

* mysql
* jdk 8 or later
* maven

### Sample Database

The sample database can be found at location: https://github.com/datacharmer/test_db. Follow the instructions in the README to install the sample database

### Build instructions

```
mvn clean install -DskipTests
```

### Executing the application

```
mvn spring-boot:run
```

### Note

Please change the username/password in `application.properties` to yours.
