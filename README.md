## Instalación y configuración proyectos:
# Proyecto de react:
1. Descargar el proyecto.
 ```
 2. npm install 
 ```
3. # Configurar firebase:
     1. Entrar en https://firebase.google.com/?hl=es-419.
     2. Darle al botón de comenzar y agregar un nuevo proyecto.
     3. Una vez en el proyecto ir a la ruedita de ajustes y bajar hasta encontrar el SDK.
      ```
     4. npm install firebase
      ```
     5. Copiar y pegar el SDK en ZapatosReact\src\firebase\config.js.
4. # Configuración Spring:
1. Descargar el proyecto.
 ```
2. CREATE DATABASE nombre_de_tu_base_de_datos;
 ```
3. Ir al properties en la siguiente ruta \Zapatos\src\main\resources\application.properties.
4. En esta línea spring.datasource.url=jdbc:mysql://localhost:3306/zapatos?useSSL=false&serverTimezone=Europe/Madrid&allowPublicKeyRetrieval=true cambiar "zapatos" por el nombre de tu base de datos.
5. Y poner tu contraseña del usuario root.
