FROM openjdk:8
EXPOSE 8080
ADD target/*.jar devops-assignment.jar

ENTRYPOINT ["java" ,"-jar", "/devops-assignment.jar"]
