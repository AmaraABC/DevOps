FROM openjdk:21.0.6-oracle
VOLUME /tmp
EXPOSE 8080
ADD ./build/libs/devsecops1-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]