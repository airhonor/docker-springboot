FROM java:8-jre
ADD ./target/docker-springboot-0.0.1-SNAPSHOT.jar app.jar
ADD ./target/ext/conf/logback.xml ext/conf/logback.xml
LABEL maintainer="honorzhang@tju.edu.cn"
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
