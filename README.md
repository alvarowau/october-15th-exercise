# Implementación de un Endpoint POST para Crear Cursos

Vas a implementar un endpoint POST en una API REST que permita crear un nuevo curso en una plataforma educativa. El objetivo es que los datos enviados sean validados correctamente utilizando Jakarta Bean Validation, y se manejen los errores de validación devolviendo un código de estado HTTP adecuado. Además, trabajarás con **RequestDTO** y **ResponseDTO** para manejar las entradas y salidas de datos.

## Requerimientos:

### Entidades:
- Debes crear la entidad `Course` que represente un curso en la plataforma.
- Debes crear un `RequestDTO` para recibir los datos de la solicitud con validaciones.
- Debes crear un `ResponseDTO` para devolver la información del recurso creado sin exponer toda la entidad.

### Propiedades de la entidad `Course`:
- **id (Long)**: ID único generado automáticamente.
- **courseName (String)**: Nombre del curso (requerido).
- **instructorName (String)**: Nombre del instructor que imparte el curso (requerido).
- **startDate (LocalDate)**: Fecha de inicio del curso (requerido).
- **durationInWeeks (Integer)**: Duración del curso en semanas (debe ser mayor a 0).

### Validaciones:
- El nombre del curso (**courseName**) no debe estar vacío ni en blanco.
- El nombre del instructor (**instructorName**) no debe estar vacío ni en blanco.
- La fecha de inicio del curso (**startDate**) debe ser proporcionada y no puede ser en el pasado.
- La duración del curso en semanas (**durationInWeeks**) debe ser un valor positivo (mayor que 0).

## Endpoint a implementar:
- **URL del endpoint**: `/api/courses`
- **Método HTTP**: `POST`
- **Descripción**: El endpoint debe recibir los datos de un nuevo curso, validarlos y guardarlos en la base de datos.

### Comportamiento esperado:
- Si los datos no pasan la validación, debes devolver un código **400 Bad Request** como hemos hecho en clase.
- Si el curso se crea exitosamente, debes devolver un código **201 Created** junto con los datos del recurso recién creado en el formato de `ResponseDTO`.
