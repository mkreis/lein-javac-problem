FROM openjdk:8-alpine

COPY target/uberjar/testapp.jar /testapp/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/testapp/app.jar"]
