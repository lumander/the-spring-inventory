FROM docker.io/library/maven:latest AS builder
WORKDIR /app
COPY . .
RUN mvn clean install package -DskipTests

FROM docker.io/library/openjdk:11.0.12-jdk-slim
ARG JAR_FILE=app/target/*.jar
WORKDIR /app
COPY --from=builder ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
