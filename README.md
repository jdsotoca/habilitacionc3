![images](https://user-images.githubusercontent.com/103220491/196838077-b0aaa669-576c-4585-ada6-54bd607880eb.png)

# habilitacionc3

 # Parte 1
 **Objetivo:** Conformar un equipo de trabajo y definir roles.
 ### Actividades
| Tarea                                                                                                           | Definition of Done (DoD)                                                                                       |
|-----------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------|
| Conformación de equipos de trabajo                                                                              | El equipo tiene cinco personas                                                                                 |
| Creación de una organización en GitHub                                                                          | Existe un link para la organización de GitHub del equipo                                                       |
| Creación de un repositorio de ejemplo<br/>dentro de la organización, donde cada<br/>miembro evidencie un commit | Es posible evidenciar al menos un commit<br/> de cada miembro en un repositorio<br/> dentro de la organización |

https://user-images.githubusercontent.com/103220491/197361755-d10ee22f-0cd0-41b3-b2f4-c81ac0320063.mp4

# Parte 2
**Objetivo:** Crear clases para las entidades básicas de la aplicación.
### Actividades
| Tarea                                                    | Definition of Done (DoD)                                                                                                                                                                                                                                                                                                                                                     |
|----------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Modelar una empresa como una clase de Java.              | * Es posible crear una instancia de la clase<br/> "Empresa"<br/>* Es posible leer y modificar la nombre de la<br/> empresa.<br/>* Es posible leer y modificar dirección de la<br/> empresa.<br/>* Es posible leer y modificar el teléfono de la<br/> empresa.<br/>* Es posible leer y modificar el NIT de la<br/> empresa.                                                   |
| Modelar un empleado como una clase de Java.              | * Es posible crear una nueva instancia de la<br/> clase "Empleado"<br/>* Es posible leer y modificar el nombre de un<br/> empleado.<br/>* Es posible leer y modificar el correo de un<br/> empleado.<br/>* Es posible leer y modificar la empresa a la<br/> que el empleado pertenece.<br/>* Es posible leer y modificar el rol del<br/> empleado(administrador, operativo). |
| Modelar el movimiento del dinero como una clase de Java. | * Es posible crear una nueva instancia de la<br/> clase "MovimientoDinero"* Es posible leer y modificar el monto del<br/> movimiento.<br/>* Es posible crear montos positivos y<br/> negativos.<br/>* Es posible leer y modificar el concepto del<br/> movimiento.<br/> * Es posible definir que usuario fue<br/> encargado de registrar el movimiento.                      |

https://user-images.githubusercontent.com/103220491/197371764-50f36c6e-8682-4766-8f90-8d1db8c501ce.mp4

# Parte 3
**Objetivo:** Crear el backend para  la aplicación
### Actividades
| Tarea                                                                               | Definition of Done (DoD)                                                                                                                                                                                                                           |
|-------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Crear controladores REST para la<br/> empresa                                       | * El sistema devuelve responses 200 en la ruta<br/> /enterprises con los siguientes verbos:<br/> GET<br/> POST<br/> * El sistema devuelve responses 200 en la ruta<br/> /responses/[id] con los siguientes verbos:<br/> GET<br/> PATCH<br/> DELETE |
| Crear controladores REST para los<br/> usuarios                                     | * El sistema devuelve responses 200 en la ruta<br/> /user con los siguientes verbos:<br/> GET<br/> POST<br/> * El sistema devuelve responses 200 en la ruta<br/> /user/[id] con los siguientes verbos:<br/> GET<br/> PATCH<br/> DELETE             |
| Crear controladores REST para los<br/> movimientos de una empresa<br/> especificada | * El sistema devuelve responses 200 en la ruta<br/> /enterprises/[id]/movements con los siguientes<br/> verbos:<br/> GET<br/> POST<br/> PATCH<br/> DELETE                                                                                          |
| Crear servicios para la empresa                                                     | * El sistema permite consultar todas las empresas<br/> * El sistema permite consultar una sola empresa<br/> * El sistema permite crear una empresa<br/> * El sistema permite editar una empresa<br/> * El sistema permite eliminar una empresa     |
| Crear servicios para el usuario                                                     | * El sistema permite consultar todos los usuarios<br/> * El sistema permite consultar un solo usuario<br/> * El sistema permite crear un usuario<br/> * El sistema permite editar un usuario<br/> * El sistema permite eliminar un usuario         |

Video => Se crea controladores y devuelve 200 en la ruta /user de la tabla Empresa con los siguientes métodos
[recording-2022-10-30-17-35-15.webm](https://user-images.githubusercontent.com/103220491/198905091-a4a20472-6d12-4a77-a3b1-757e72027c1e.webm)
