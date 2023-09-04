FROM openjdk:11
# Temp Run location
VOLUME /tmp
# Provide Port Information
EXPOSE 8080
#Jar Location to mapping name
ADD target/simple.jar simple.jar
#Jar Execution command
ENTRYPOINT ["java","-jar","/simple.jar"]