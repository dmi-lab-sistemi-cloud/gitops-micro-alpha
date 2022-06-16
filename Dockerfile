# Requires: mvn clean package
FROM openjdk:11 
WORKDIR /app
COPY target/micro-alpha-1.0.0.jar /app
ENV SERVER_PORT 8080
EXPOSE $SERVER_PORT
CMD ["java", "-jar", "micro-alpha-1.0.0.jar" ]