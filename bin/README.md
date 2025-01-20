# Dockerizing a Simple RESTful Project with Docker-Compose

This README explains how to containerize a simple RESTful API project developed with Spring Boot using Docker and Docker-Compose. The project implements basic CRUD operations and contains a single class `Post`.

## Prerequisites

Before proceeding, ensure you have the following installed on your system:

- [Docker](https://docs.docker.com/get-docker/)
- [Docker-Compose](https://docs.docker.com/compose/install/)
- jdk 17

## Project Structure

![pic 1](https://github.com/user-attachments/assets/c1140e89-c4e4-46ae-a314-763f2bb473cf)


![pic2](https://github.com/user-attachments/assets/6e104c14-5dbb-4a19-a658-fe98823a0e10)

## Step 1: Generate a .jar file of the project 

before generating the .jar file launch a postgres container in your terminal using this command:

 $ docker run -d --name postgres-sql -e POSTGRES_PASSWORD=password --network spring-network -p 5432:5432 postgres

after making sure that the container is active, execute this command in your terminal (WSL integrated in IDE)

$ mvn clean package

## Step 2: Generate project image

We will use the Dockerfile.
The `Dockerfile` defines how to build the image for the Spring Boot application

For that execute this command in your terminal 

$ docker build -t dockerdemo:1.0 .

## Step 3: Define Services in `docker-compose.yml`

The `docker-compose.yml` file configures the application and its dependencies.

Build the application image:

before that, delete the already created container, the docker compose will take care of creating a new one:
$ docker rm -f id_container

then, execute this command in your terminal 

$ docker-compose up

## Step 4: Testing the API

 Access the API at `http://localhost:8080/all`

 You can test the CRUD operations using tools like [Postman](https://www.postman.com/) or `curl`.

 ## Step 5: Stop the Application

 To stop the running application, use:

 $ docker compose down

 ## Happy coding!



