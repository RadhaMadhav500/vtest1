FROM registry.access.redhat.com/ubi8/openjdk-11
COPY target/*.jar /opt/clipcoupon-v1.0.jar
CMD java -jar /opt/clipcoupon-v1.0.jar
EXPOSE 8081

