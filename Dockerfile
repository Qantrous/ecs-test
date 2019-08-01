FROM openjdk:8-jdk-alpine
WORKDIR /app
COPY target/ecs-test.jar /app/app.jar
EXPOSE 8080
#ENTRYPOINT ["java","-jar","/app.jar"]
CMD ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app/app.jar"]