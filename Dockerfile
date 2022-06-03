FROM adoptopenjdk/openjdk15:ubi
COPY build/libs/gpsUtilTour-1.0.0.jar gpsUtilTour.jar
EXPOSE 8083
ENTRYPOINT ["java", "-jar", "gpsUtilTour.jar"]