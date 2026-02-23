FROM eclipse-temurin:17-jdk


WORKDIR /app

COPY sentiment-analyzer-be/target/sentiment-analyzer-be-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar","app.jar"]