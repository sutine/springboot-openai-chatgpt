FROM bladex/alpine-java:openjdk8-openj9_cn_slim

MAINTAINER bladejava@qq.com

RUN mkdir -p /blade/user

WORKDIR /blade/user

EXPOSE 9876

ADD ./target/blade-user.jar ./user.jar

CMD java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -jar user.jar --spring.profiles.active=prod
