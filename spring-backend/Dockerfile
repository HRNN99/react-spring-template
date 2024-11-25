# Usar una imagen de Maven con Java 17 preinstalado
FROM maven:3.9.4-eclipse-temurin-17 AS build

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar los archivos necesarios para el proyecto
COPY pom.xml .
#COPY src ./src

# Ejecutar la construcción (esto solo se usará para precompilación en producción)
RUN mvn dependency:go-offline -B

# Fase de desarrollo: Usar directamente Maven para correr la app
CMD ["mvn", "spring-boot:run"]
