# OpenJDK java 11 Image
FROM openjdk:11-jre-hotspot

# Define container work directory
WORKDIR /app

# Copy JAR's to container application
COPY target/*.jar /app/spring-care.jar

# Inicialization application
CMD ["java", "-jar", "spring-care.jar"]