# SpringWebflux_PostgreSQL_R2DBC
Microservicio reactivo desarrollado en Spring Webflux realizando conexión a una base de datos POSTGRESQL (Lectura/Escritura) utilizando Spring R2DBC.

Validar que se tiene preconfigurado Postgress:
1. Ingresar al contenedor de postgres
2. switchear usuario postgres en linux
3. loguearse en postgres con el usuario y base de datos definido en el docker-compose.
4. consultar listados de base de datos actuales.



Para ejecutar el proyecto via docker se debe hacer lo siguiente:

Limpiar y construir el jar:

- `./gradlew clean build`

Construir imagenes docker

- `docker-compose build`

Iniciar contenedores MySQL y Spring

- `docker-compose up -d`

**Endpoint**
- GET http://localhost:8081/actuator/health
- GET http://localhost:8081/v1/users
- GET http://localhost:8081/v1/users/{id}
- POST http://localhost:8081/v1/users
- PUT http://localhost:8081/v1/users/{id}
- PUT http://localhost:8081/v1/users
- DELETE http://localhost:8081/v1/users/{id}
   