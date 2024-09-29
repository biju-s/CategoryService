FROM ubuntu:19.10

RUN apt-get update

RUN apt install openjdk-8-jdk -y

ENV JAVA_HOME /usr/lib/jvm/java-8-openjdk-amd64

ENV INSTALL_PATH /usr/src/app/
RUN mkdir -p $INSTALL_PATH
WORKDIR $INSTALL_PATH

RUN pwd

COPY target/CalegoryService-0.0.1-SNAPSHOT.jar $INSTALL_PATH

CMD ["java", "-jar", "CalegoryService-0.0.1-SNAPSHOT.jar"]
