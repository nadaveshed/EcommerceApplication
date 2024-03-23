# E-commerce Application

This is a sample e-commerce application built using Java with Spring Boot framework. The application provides a RESTful API for managing products and categories, and it uses Docker for containerization.

## Features

- Create a new product
- Create a new category
- Add a product to a category
- Add a subcategory to an existing category
- Update inventory when adding or removing products
- Send notifications to users when the inventory of a specific product is empty

## Technologies Used

- Java
- Spring Boot
- PostgreSQL (for storing categories and products)
- Docker

## Prerequisites

- Java 11 or higher
- Docker

## Getting Started

Clone this repository:

   ```bash
   git clone https://github.com/your-username/e-commerce-application.git
```
1. Navigate to the project directory:
```
cd e-commerce-application
```
2. Build the Docker image:
```
docker build -t e-commerce-application .
```
3. Run the Docker container:
```
docker run -p 8080:8080 e-commerce-application
```
4. Access the API documentation at http://localhost:8080/swagger-ui.html to interact with the RESTful API endpoints.

Usage
Use any HTTP client (e.g., Postman) to make requests to the API endpoints.
Refer to the API documentation for details on the available endpoints and request/response formats.
