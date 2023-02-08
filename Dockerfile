FROM openjdk:11
COPY ./build/libs/WelcomeSpring.jar .
ENTRYPOINT ["java", "-jar", "WelcomeSpring.jar"]