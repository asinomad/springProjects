FROM openjdk:8-jre-slim

RUN mkdir -p -m 777 /logs

VOLUME ["/logs"]

ENV LOG_DIR /logs

EXPOSE 8080

ENV DOCKERIZE_VERSION v0.3.0
COPY dockerize-linux-amd64-$DOCKERIZE_VERSION.tar.gz .
RUN tar -C /usr/local/bin -xzvf dockerize-linux-amd64-$DOCKERIZE_VERSION.tar.gz \
    && rm dockerize-linux-amd64-$DOCKERIZE_VERSION.tar.gz

COPY main-service-app.jar /app.jar

CMD [ "sh", "-c", "java $JAVA_OPTS -jar /app.jar", "" ]
