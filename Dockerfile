# Use a base image with JDK and Maven installed
FROM maven:3.8.4-openjdk-17-slim AS build

# Set the working directory
WORKDIR /app

# Copy the project files to the container
COPY . .

# Build the project
RUN mvn clean package -DskipTests

# Use a lightweight base image for running the application
FROM openjdk:17-jdk-alpine

# Install PostgreSQL client
RUN apk add --no-cache postgresql-client

# Set the working directory
WORKDIR /app

# Copy the JAR file from the build stage to the container
COPY --from=build /app/target/ecommerceapplication.jar ./

# Expose the port your application runs on
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "ecommerceapplication.jar"]
