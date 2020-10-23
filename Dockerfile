FROM java:8-jdk-alpine
ADD ./target/docker-springboot-0.0.1-SNAPSHOT.jar app.jar
ADD ./target/ext/conf/logback.xml ext/conf/logback.xml
LABEL maintainer="honorzhang"
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
