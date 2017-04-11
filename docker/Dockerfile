FROM openjdk:8-jre-alpine
VOLUME /tmp
ADD gateway_app_test.jar app.jar
EXPOSE 9292
CMD java -jar app.jar