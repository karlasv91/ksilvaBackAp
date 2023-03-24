FROM amazoncorretto:11-alpine-jdk
MAINTAINER KarlaSilva
COPY target/ksv-0.0.1-SNAPSHOT.jar ksv-app.jar
ENTRYPOINT ["java", "-jar","/ksv-app.jar"]

