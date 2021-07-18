# 分层技术，SB最低从 2.3 开始支持


# FROM openjdk:8-jdk-alpine   moxm/java:1.8-full
FROM moxm/java:1.8 as builder
# 工作目录，Dockerfile 中的任何 RUN，CMD，ENTRPOINT，COPY 和 ADD 指令的工作目录
WORKDIR /build
# 定义构建参数
ARG JAR_FILE=target/mps-admin.jar
COPY ${JAR_FILE} app.jar
RUN java -Djarmode=layertools -jar app.jar extract && rm app.jar

# 分层
FROM moxm/java:1.8
LABEL maintainer="bfchengnuo@gmail.com"
ENV TZ=Asia/Shanghai
# 加快随机数生成
ENV JAVA_OPTS="-Xms128m -Xmx256m -Djava.security.egd=file:/dev/./urandom"
WORKDIR mps-admin

COPY --from=builder /build/dependencies/ ./
COPY --from=builder /build/snapshot-dependencies/ ./
COPY --from=builder /build/spring-boot-loader/ ./
COPY --from=builder /build/application/ ./

EXPOSE 8000

CMD sleep 60; java $JAVA_OPTS org.springframework.boot.loader.JarLauncher