
# Dockerfile to build MongoDB container images

# Based on jdk8


FROM 192.168.1.207/sellercube/java:8-jre

MAINTAINER zengqi

EXPOSE 8080

ADD ./target/user-system-1.0.0.jar /usr/local/

ENTRYPOINT java -jar /usr/local/user-system-1.0.0.jar