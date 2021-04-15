FROM openjdk:11.0.10
EXPOSE 8084
WORKDIR /app
COPY target/usuario_ms-0.1.jar .
ENTRYPOINT [ "java", "-jar", "usuario_ms-0.1.jar" ]