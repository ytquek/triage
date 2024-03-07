# Use an official Java runtime that supports Java 11
FROM eclipse-temurin:21-jdk

# Set the working directory in the container
WORKDIR /usr/src/app

# Copy the JAR file from your host to your container
COPY  ./triage.jar /usr/src/app/triage.jar

# Run the JAR file
ENTRYPOINT ["java", "-jar", "triage.jar"]
