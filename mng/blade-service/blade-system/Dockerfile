FROM bladex/alpine-java:openjdk8-openj9_cn_slim

MAINTAINER bladejava@qq.com

RUN mkdir -p /blade/system

WORKDIR /blade/system

EXPOSE 9875
#项目的启动端口号

ADD ./target/blade-system.jar ./system.jar

CMD java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -jar system.jar --spring.profiles.active=prod
