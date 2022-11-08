# INICIAR SERVICES

Para iniciar os services , utilizar o seguinte comando para inicializar a imagem docker do banco de dados
```shell script
    docker-compose up
```

O comando a seguir inicializa o quarkus 
```shell script
    ./mvnw quarkus:dev
```


version: '3.7'

services:

  mongodb:

    image: mongo:latest

    ports: 

      - 27017:27017

    volumes:

      - mongodb_data_container:/data/db

  quarkus:
    depends_on: mongodb
    Image: quarkus:v1
    Build: 
      Context: src/main/org/acme/
      Dockerfile: src/main/docker/Dockerfile.jvm



volumes:

  mongodb_data_container:







*——————



FROM registry.access.redhat.com/ubi8/openjdk-17:1.11 as build

COPY mvw.cmd /ferramentas
COPY . /package
RUN /ferraments/mvwn.cmd ./package


FROM registry.access.redhat.com/ubi8/openjdk-17:1.11
COPY --from=build /package /quarkus-app





ENV LANGUAGE='en_US:en'







# We make four distinct layers so if there are application changes the library layers can be re-used

COPY --chown=185 target/quarkus-app/lib/ /deployments/lib/

COPY --chown=185 target/quarkus-app/*.jar /deployments/

COPY --chown=185 target/quarkus-app/app/ /deployments/app/

COPY --chown=185 target/quarkus-app/quarkus/ /deployments/quarkus/




EXPOSE 8080

USER 185

ENV JAVA_OPTS="-Dquarkus.http.host=0.0.0.0 -Djava.util.logging.manager=org.jboss.logmanager.LogManager"

ENV JAVA_APP_JAR="/deployments/quarkus-run.jar"

