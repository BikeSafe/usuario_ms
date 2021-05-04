FROM openjdk:11.0.10
EXPOSE 4005
WORKDIR /app
COPY target/usuario_ms-0.1.jar .
ENTRYPOINT [ "java", "-jar", "usuario_ms-0.1.jar"]