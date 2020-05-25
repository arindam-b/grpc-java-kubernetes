From openjdk:8-alpine

COPY target/application-jar-with-dependencies.jar /app/application.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/application.jar"]