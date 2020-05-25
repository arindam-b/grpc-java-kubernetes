FROM maven:3.6.1-jdk-8 AS build

ENV APP_HOME=/root/dev/app/

COPY src $APP_HOME/src

COPY pom.xml $APP_HOME/

RUN mvn -f $APP_HOME/pom.xml clean package -DskipTests

From openjdk:8-alpine

COPY --from=build /root/dev/app/target/application-jar-with-dependencies.jar /usr/app/application.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/usr/app/application.jar"]