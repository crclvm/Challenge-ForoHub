# Challenge - Foro Hub

## Descripcion del Proyecto
Foro Hub es una aplicación API de back-end diseñada para gestionar un foro de discusión. 
Permite a los usuarios registrarse, autenticarse y realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre los tópicos del foro, utilizando JWT para la seguridad.

Ofrece las opciones de realizar EndPoints para los tópicos del Foro Hub:

* **Registro de tópicos:** Permite registrar nuevos tópicos en la base de datos.
* **Listar tópicos:** Muestra todos los tópicos registrados la base de datos.
* **Mostrar datos de un tópico:** Permite ver los detalles de un tópico seleccionado.
* **Modificar un tópico:** Permite actualizar la información de un tópico seleccionado.
* **Eliminar un tópico:** Permite eliminar un tópico de la base de datos.

Además, todo esto está protegido por autenticación utilizando JWT (JSON Web Token).

## Funcionalidades
La aplicacion funciona utilizando una API creada desde cero, donde obtenemos informacion de todos los topicos registrados de forma exitosa en la base de datos 
y usuarios que sean autenticados, generando un Token que expira por normas de seguridad de la aplicacion. Realiza las siguientes tareas:

- Permite a los usuarios registrarse con su nombre, email y contraseña.
- Protege las rutas mediante JWT, asegurando que solo los usuarios autenticados puedan acceder a ciertas funcionalidades.
- Los usuarios pueden crear, ver, actualizar y eliminar tópicos en el foro.
- Implementa validaciones en las entradas de datos y maneja errores de forma adecuada.
  
## Instalacion y Ejecucion
Para poder instalar la aplicacion, necesitamos:
* Java 21 instalado y su JDK
* MySQL configurado e instalado

------
## Uso de la Aplicacion
1. **Registro y Autenticación:**
```bash
    Usa un cliente de API como Insomnia o Postman.
    POST http://localhost:8080/login: Autentícate y obtén el token JWT.
    Header: Authorization: Bearer <ingresa tu token jwt>.
```

2. **Operaciones CRUD de Tópicos:**
```bash
    POST   http://localhost:8080/topicos:       Crear o registrar un nuevo tópico.
    GET    http://localhost:8080/topicos:       Listar todos los tópicos.
    GET    http://localhost:8080/topicos/{id}:  Obtener detalles de un tópico específico.
    PUT    http://localhost:8080/topicos/{id}:  Actualizar un tópico.
    DELETE http://localhost:8080/topicos/{id}:  Eliminar un tópico.
```