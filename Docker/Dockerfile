FROM adoptopenjdk/openjdk8-openj9:x86_64-alpine-jdk8u212-b03_openj9-0.14.0-slim
WORKDIR /app

LABEL version="1.0"
LABEL description="sve-apolo.jar"

COPY *.jar app.jar
EXPOSE 8080


ENV JAVA_OPTS="-Dfile.encoding=UTF8  -XX:+UseContainerSupport  -Djava.security.egd=file:/dev/./urandom"
ENTRYPOINT ["sh","-c","java $JAVA_OPTS -jar /app/app.jar"]
#ENTRYPOINT java -jar app.jar -g 'daemon off;'

