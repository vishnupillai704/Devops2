FROM openjdk:8
ADD target/firstProject-0.0.3-SNAPSHOT.jar firstProject-0.0.3-SNAPSHOT.jar
EXPOSE 8086
ENTRYPOINT ["java","jar","firstProject-0.0.3-SNAPSHOT.jar.jar"]
