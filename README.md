# User Registration API

This project provides a simple RESTful API for user registration and fetching user details using Spring Boot.

## Prerequisites

- Java 8 or higher
- Maven
- Git

## Getting Started

### Clone the Repository

```sh
git clone https://github.com/your-username/user-registration-api.git
cd user-registration-api

# Build the project

mvn clean install

# Run the application

mvn spring-boot:run


## Curl Commands

# For register user

curl -X POST "http://localhost:8080/api/user/register" -H "Content-Type: application/json" -d '{"username": "john_doe", "email": "john@example.com", "password": "password123"}'

# For fetch user details

curl -X GET "http://localhost:8080/api/user/fetch?username=john_doe"
