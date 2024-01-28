FROM bladex/alpine-java:openjdk8-openj9_cn_slim

MAINTAINER bladejava@qq.com

RUN mkdir -p /blade/mjkj

WORKDIR /blade/mjkj

EXPOSE 9874
#项目的启动端口号

ADD ./target/mjkj-bladex.jar ./mjkj.jar

CMD java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -jar mjkj.jar --spring.profiles.active=prod
