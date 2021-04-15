# usuario_ms

este microservicio cumple la función de:
autenticación 
CRUD de datos pesronales y de autenticación del usuario
CRUD de los seguidores de cada usuario

para desplegarlo utilizar los siguientes comandos en docker
docker run -p 8080:8080 springio/usuario_ms
docker build -t springio/usuario_ms .
no olviar el punto al final

algunas rutas http son:
localhost:8080/oauth/token
body:
username admin
password admin
grant-type password


localhost:8080/usuario/usuario
Authorization 
bearer token "tokenGenerado"

localhost:8080/usuario/dato
Authorization 
bearer token "tokenGenerado"