FROM openjdk:17
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} autofix-list-repair.jar
ENTRYPOINT ["java", "-jar", "/autofix-list-repair.jar"]