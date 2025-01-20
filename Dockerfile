FROM maven:3.8.7-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY --from=build /app/target/SpringDockerExample-1.0.jar /app/demo.jar
EXPOSE 8080
CMD [ "java", "-jar", "/app/demo.jar"]

