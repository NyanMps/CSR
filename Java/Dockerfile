# 源参考：openjdk:8-jre、openjdk:8-jdk-alpine、openjdk:11.0.3-jdk-stretch
FROM openjdk:8-jdk-alpine

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
RUN echo 'Asia/Shanghai' >/etc/timezone

# tomcat 所必须的目录
VOLUME /tmp

ADD xxx-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

# 设置 java.security.egd 属性可以加快启动速度
# 随机数生成相关
# https://hongjiang.info/jvm-random-and-entropy-source/
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]


# 打包：docker build -t appName:latest .