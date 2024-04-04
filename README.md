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


### Main Tasks:
#### Design and build an e-commerce system and write the implementation of the following requirements:

1. Product Catalog : The product catalog should be designed using the Composite pattern where ‘Product’ and ‘Category’ are components. ‘Category’ can contain ‘Product’ or ‘Category’ (as sub category) components. Implement:  methods to add/remove products or categories, and to display the product catalog.

2. Inventory Management : Implement an inventory management system where ‘Product’ is the subject and ‘Inventory’ is the observer. Whenever the quantity of a product changes, the inventory should be updated accordingly.

You need to build a RESTful API using a Java + springboot, use dockers as a container platform , I will run the container locally.

#### Endpoints:
1. provide a UML diagram for the system.
2. create  a new product.
3. create a new category.
4. add product to category.
5. add sub category to an existing category.
6. for each add/ remove product update the inventory.
7. send notification to the user when inventory of specific product is empty.

#### Data Model:
Choose data fields for category and product

#### DB
 Use a PostgresDB to store categories and products.

#### Testing:
  Write unit tests for each endpoint.
