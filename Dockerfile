FROM maven:3.9-eclipse-temurin-17

EXPOSE 8080

COPY . /pictures

WORKDIR /pictures

RUN mvn clean install

ENTRYPOINT exec java -jar /pictures/target/pictures-app-0.0.1-SNAPSHOT.jar