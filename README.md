# Programación Orientada a Objetos - TP1
## Documentación sobre el proyecto
Sobre los detalles de la implementación, el programa fue desarrollado en el IDE IntelliJ IDEA, con el SDK 21 Oracle OpenJDK 21.0.11, Language Level SDK default.

<img width="852" height="112" alt="image" src="https://github.com/user-attachments/assets/429ea25c-9fcd-49e8-bf35-ccf28254862f" />

El programa se ejecuta en la clase `App`, en la cual está el código que genera el resultado consignado en el punto 4:
- Se crean 3 estudiantes.
- Se crea 1 evento.
- Se crea 1 sala.
- Se crean 2 actividades para el evento: una Charla y un Taller.
- Se inscriben 2 estudiantes en la Charla.
- Se inscriben 2 estudiante en el Taller.

## Clonar
Para clonar el repositorio en IntelliJ IDEA, desde el menú inicial, ir al botón `Clone Repository`

<img width="1606" height="66" alt="image" src="https://github.com/user-attachments/assets/2220cf09-ab65-49dc-80ae-f5f136c4aeae" />

En `URL`, pegar la dirección del repositorio

<img width="991" height="313" alt="image" src="https://github.com/user-attachments/assets/cd19b588-f370-4889-bd7a-8bcbd3c4b446" />

Finalmente, presionar el botón `Clone` y listo.

## Salida
Al ejecutarlo, se muestra la siguiente salida, que también se puede ver en el archivo `salida.png`

```
============== Mostrando datos de evento ==============
Id del evento: 0
Título: Evento de Sistemas
Costo estimado: 12100.0$
¿Es gratuito?: No
-------------------- Sala asignada --------------------
Id: 0
Nombre: Sala Sistemas
--------------------- Actividades ---------------------
| Actividad: Charla de sistemas
| ID de actividad: 0
| Cupo máximo: 50
| Esta actividad es de tipo: Charla
======= Inscripciones =======
| Hay un total de 2 inscripciones
| -----
| Fecha: 2026-08-27
| Estado: Inscripto
| Datos del estudiante:
| Legajo: 53000
| Nombre: Mateo
| -----
| Fecha: 2026-08-27
| Estado: Inscripto
| Datos del estudiante:
| Legajo: 53001
| Nombre: Juan
| -----
----------------------------------------
| Actividad: Taller de Programación
| ID de actividad: 1
| Cupo máximo: 200
| Esta actividad es de tipo: Taller
======= Inscripciones =======
| Hay un total de 2 inscripciones
| -----
| Fecha: 2026-08-27
| Estado: Inscripto
| Datos del estudiante:
| Legajo: 53001
| Nombre: Juan
| -----
| Fecha: 2026-08-27
| Estado: Inscripto
| Datos del estudiante:
| Legajo: 53002
| Nombre: Pablo
| -----
----------------------------------------
=======================================================

Total de eventos creados: 1
```

## Mapa de memoria
La siguiente imagen muestra el mapa de memoria solicitado, hecho con la herramienta ExcaliDraw, disponible para ser visto también en el archivo `mapa_memoria_TP1.png`

<img width="1560" height="940" alt="mapa_memoria_TP1" src="https://github.com/user-attachments/assets/93d05f5b-884a-492b-9531-de3068863003" />
