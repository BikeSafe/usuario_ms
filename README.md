# Usuario_ms
## Descripcion
este microservicio cumple la función de:
- autenticación 
- CRUD de datos pesronales y de autenticación del usuario
- CRUD de los seguidores de cada usuario

## Build
### spring tools4
para hacer build se puede descargar la herramientas springtools4 seguir estas instrucciones:
- http://cristianruizblog.com/spring-boot-ejecutable-exportar-aplicacion-jar/
- https://spring.io/tools

### Desplegar

Utilizar los siguientes comandos en docker
- docker run -p 8080:8080 springio/usuario_ms
- docker build -t springio/usuario_ms .

## Rutas HTTP
#### localhost:8080/oauth/token
- username admin
- password admin
- grant-type password


### localhost:8080/usuario/usuario
- Authorization 
- bearer token "tokenGenerado"

### localhost:8080/usuario/dato
- Authorization 
- bearer token "tokenGenerado"