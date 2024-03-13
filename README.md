## Instalación y configuración proyectos:
# Proyecto de react:
1. Descargar el proyecto.
 ```
 2. npm install 
 ```
 # Configuración Spring:
1. Descargar el proyecto.
 ```
2. CREATE DATABASE nombre_de_tu_base_de_datos;
 ```
3. Ir al properties en la siguiente ruta \Zapatos\src\main\resources\application.properties.
4. En esta línea spring.datasource.url=jdbc:mysql://localhost:3306/zapatos?useSSL=false&serverTimezone=Europe/Madrid&allowPublicKeyRetrieval=true cambiar "zapatos" por el nombre de tu base de datos.
5. Y poner tu contraseña del usuario root.
