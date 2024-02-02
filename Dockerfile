# Use a lightweight base image with OpenJDK 8
FROM openjdk:8-jre-slim

WORKDIR /app
COPY MultiplicationTable.class .

CMD ["java", "MultiplicationTable"]
