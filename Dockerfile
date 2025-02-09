# Stage 1: Build Stage
# Use a valid Maven image with OpenJDK 17
FROM maven:latest AS build

# Set the working directory inside the container
WORKDIR /app

# Copy the pom.xml and the source code into the container
COPY pom.xml /app/
COPY src /app/src/

# Build the project using Maven (this will create the target directory with the JAR)
RUN mvn clean package -DskipTests

# Stage 2: Runtime Stage
# Use OpenJDK 17 for the runtime image
FROM openjdk:17-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the build stage into the runtime container
COPY --from=build /app/target/app.jar /app/app.jar

# Command to run the Spring Boot application
CMD ["java", "-jar", "/app/app.jar"]
