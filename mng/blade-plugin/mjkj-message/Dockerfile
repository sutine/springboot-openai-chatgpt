FROM bladex/alpine-java:openjdk8-openj9_cn_slim

MAINTAINER bladejava@qq.com

RUN mkdir -p /blade/message

WORKDIR /blade/message

EXPOSE 9873
#项目的启动端口号

ADD ./target/mjkj-message.jar ./message.jar

CMD java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -jar message.jar --spring.profiles.active=prod
