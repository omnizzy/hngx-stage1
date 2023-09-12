FROM openjdk:17-oracle
LABEL authors="nathan"
COPY target/hngx1-0.0.1-SNAPSHOT.jar hngxinfo-image.jar
EXPOSE 8080
EXPOSE 5432
ENTRYPOINT ["java", "-jar", "hngxinfo-image.jar"]