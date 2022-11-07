#!/bin/bash

command ./mvnw package
command docker build -f src/main/docker/Dockerfile.jvm -t quarkus/code-with-quarkus-jvm .


command docker run -i --rm -p 8080:8080 quarkus/code-with-quarkus-jvm



command docker-compose up
