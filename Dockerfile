FROM openjdk:11
LABEL maintainer="hexalab" author="hexalab"

COPY target/hexa-lab-0.0.1-SNAPSHOT.jar hexa-lab-1.0.0.jar
ENTRYPOINT ["java","-jar","/hexa-lab-1.0.0.jar"]