FROM amazoncorretto:17 
ADD TravelBookingServiceClientProject-0.0.1-SNAPSHOT.jar app.jar 
EXPOSE 9091 
CMD ["java","-jar","-Dspring.profiles.active=prod", "app.jar"] 