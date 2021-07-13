FROM maven:3.8.1-jdk-11 AS build

MAINTAINER miguel.cam.mx@gmail.com

COPY src /home/skeleton-java/src
COPY pom.xml /homes/keleton-java
RUN mvn -f /home/skeleton-java/pom.xml clean package

FROM openjdk:11
COPY --from=build /home/skeleton-java/target/*-SNAPSHOT.jar /usr/src/app/*-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/src/app/docker-app-0.0.1-SNAPSHOT.jar"]