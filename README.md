# SpringBoot Lombok & Mapstruct

>Proyecto de ejemplo para configurar Lombok y Mapstruct con Spring Boot

## Configuración

Agregar en el archivo `~/.gradle.properties` lo siguiente:

```properties
# BGeneral - Training Sep 2022
BGRepository = https://repo.maven.apache.org/maven2/
BGRepositoryInsecureProtocol = true
BGRepositoryUsername = 
BGRepositoryPassword = 
```

Nota:
- Ajustar el valor de la propiedad `BGRepository` colocando la URL del repositorio central del banco

## Maven Build

```
$ ./mvnw package
$ java -jar target/spring-boot-lombok-mapstruct-0.0.2-SNAPSHOT.jar

$ ./mvnw spring-boot:run
```

## Gradle Build

```
$ ./gradlew build
$ java -jar build/libs/spring-boot-lombok-mapstruct-0.0.2-SNAPSHOT.jar

$ ./gradlew bootRun
```

## Referencias

- https://fahd-boudali.medium.com/spring-boot-mapstruct-lombok-e219bef471ab
- https://mapstruct.org/
- https://projectlombok.org/
