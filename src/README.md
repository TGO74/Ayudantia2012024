# Sistema de Gestión para Editorial Internacional

## Descripción del Problema

Se desea crear un sistema para una Editorial internacional que gestione la información relacionada con editores, autores y textos publicados. La editorial cuenta con diferentes tipos de autores y cada texto tiene información específica, como país de origen, número de copias impresas y ventas realizadas. Además, se deben considerar las solicitudes de aprobación de libros, las ventas a agencias de librerías y la gestión del stock disponible en las tiendas.

## Requerimientos

1. Categorización de autores en autor de libro, autor de poemas y autor de cómic.
2. Asignación de países, ciudades de origen, número de copias impresas y ventas a cada libro.
3. Acceso a seudónimos por parte de los autores.
4. Registro de información de impresión para libros, poemarios y cómics.
5. Gestión de ediciones y localizaciones de cada texto.
6. Aprobación de textos en espera por parte de los editores.
7. Ventas a agencias de librerías con opción de aceptar o rechazar ofertas.
8. Control de stock disponible en cada tienda.
9. Funcionalidades internas para crear textos, agregar ediciones, buscar autores y solicitar aprobación de textos.
10. Funcionalidades externas para reabastecer tiendas y ver estadísticas de impresiones y ventas.


## Diagrama de Clases


## Funcionalidades

### Internas (Editorial)

- Crear nuevo texto con autor, país, ciudad de origen, impresión, ediciones y editor que lo aprobó.
- Agregar ediciones a un texto.
- Buscar autores e información de las editoriales de las que son integrantes.
- Buscar las diferentes ediciones de un texto.
- Obtener lista de localizaciones de una edición.
- Solicitar aprobación de un texto en lista de espera.
- Acceder a los seudónimos del autor al buscar un autor.

### Externas (Agencia de Librerías)

- Reabastecer a las tiendas.
- Aceptar ofertas de agencias.
- Ver el número de impresiones y ventas realizadas por texto.

## Repositorio Git

El código fuente junto con el diagrama de clases se encuentra disponible en el siguiente repositorio Git: [Sistema de Gestión para Editorial Internacional](https://github.com/tu_usuario/sistema-gestion-editorial)

