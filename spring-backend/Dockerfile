# Use OpenJDK 21 as base image
FROM openjdk:21-jdk-slim AS build

WORKDIR /app
COPY . .

# Build the application using Maven
RUN ./mvnw clean install

# Create a minimal runtime image with JDK 21
FROM openjdk:21-jdk-slim
COPY --from=build /app/target/app-0.0.1-SNAPSHOT.jar /backend.jar
ENTRYPOINT ["java", "-jar", "/backend.jar"]
