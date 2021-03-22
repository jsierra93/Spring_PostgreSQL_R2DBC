# SpringWebflux_PostgreSQL_R2DBC
Microservicio reactivo desarrollado en Spring Webflux realizando conexión a una base de datos POSTGRESQL (Lectura/Escritura) utilizando Spring R2DBC.

Para ejecutar el proyecto via docker se debe hacer lo siguiente:

Limpiar y construir el jar:

- `./gradlew clean build`

Construir imagenes docker

- `docker-compose build`

Iniciar contenedores PostgreSQL, adminer y Spring

- `docker-compose up -d`

**Endpoint**
- GET http://localhost:8081/actuator/health
- GET http://localhost:8081/v1/users
- GET http://localhost:8081/v1/users/{id}
- POST http://localhost:8081/v1/users
  
    Body:
  
     `{
         "username": "dev1234",
         "password": "dev1234",
         "active": true
     }`
  

- PUT http://localhost:8081/v1/users/{id}

  Body:

  `{
  "username": "dev1234",
  "password": "dev12345",
  "active": true
  }`
  
  
- PUT http://localhost:8081/v1/users

    Body:
  
     `{
         "username": "dev1234",
         "password": "dev12345",
         "active": true
     }`


- DELETE http://localhost:8081/v1/users/{id}


En la carpeta recursos se encuentra la coleccion postman y los pantallazos con los comandos para Postgres via docker o adminer.