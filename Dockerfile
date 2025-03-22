FROM openjdk:21
EXPOSE 5000
ADD target/jenkins-docker-integration.jar jenkins-docker-integration.jar
ENTRYPOINT ["java -jar /jenkins-docker-integration.jar" ]