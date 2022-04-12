FROM openjdk:8
ARG APP=/target/Backend-DuAn-0.0.1-SNAPSHOT.jar
ADD $APP app.jar
CMD java -jar app.jar