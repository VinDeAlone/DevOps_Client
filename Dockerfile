

FROM openjdk:17-alpine
WORKDIR /opt
COPY /target/demoServerJarFile.jar /opt/demoServerJarFile.jar
ENV PORT=8122
EXPOSE 8122
ENTRYPOINT [ "java","-jar","/opt/demoServerJarFile.jar" ]