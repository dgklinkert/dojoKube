FROM adoptopenjdk/openjdk11-openj9:jre-11.0.7_10_openj9-0.20.0-alpine

LABEL version="1.0"
LABEL description="sve-apolo.jar"

COPY *.jar app.jar
EXPOSE 8080


ENV JAVA_OPTS="-Dfile.encoding=UTF8  -XX:+UseContainerSupport  -Djava.security.egd=file:/dev/./urandom"
ENTRYPOINT ["sh","-c","java $JAVA_OPTS -jar /app.jar"]

