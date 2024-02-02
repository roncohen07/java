# Use a lightweight base image with OpenJDK
FROM openjdk:11-jre-slim

# Set the working directory
WORKDIR /app

# Copy the compiled Java class files to the container
COPY MultiplicationTable.class .

# Specify the default command to run your Java application
CMD ["java", "MultiplicationTable"]
