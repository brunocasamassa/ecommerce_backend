# INICIAR SERVICES

Para empacotar o quarkus e iniciar o seu container junto ao container do banco de dados mongo, utilizar o seguinte comando 
```shell script
    start-all.sh
```




useless commands by now
```
FROM registry.access.redhat.com/ubi8/openjdk-17:1.11 as build

COPY mvw.cmd /ferramentas
COPY . /package
RUN /ferraments/mvwn.cmd ./package


FROM registry.access.redhat.com/ubi8/openjdk-17:1.11
COPY --from=build /package /quarkus-app
```
