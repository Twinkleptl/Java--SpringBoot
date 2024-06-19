# User Registration API

This project provides a simple RESTful API for user registration and fetching user details using Spring Boot.

## Prerequisites

- Java 8 or higher
- Maven
- Git

## Getting Started

### Clone the Repository

```sh
git clone https://github.com/Twinkleptl/Java--SpringBoot
cd Java--SpringBoot

# Build the project

mvn clean install

# Run the application

mvn spring-boot:run


## Curl Commands

# For register user

curl -X POST "http://localhost:8080/api/user/register" -H "Content-Type: application/json" -d '{"email": "john@example.com", "username":"abc" "password": "password123"}'

# For fetch user details

curl -X GET "http://localhost:8080/api/user/fetch?username=abc"
