FROM bladex/alpine-java:openjdk8-openj9_cn_slim

MAINTAINER bladejava@qq.com

RUN mkdir -p /blade/gateway

WORKDIR /blade/gateway

EXPOSE 9872

ADD ./target/blade-gateway.jar ./gateway.jar

CMD java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -jar gateway.jar --spring.profiles.active=prod --logging.file.name=logs/gateway.log
