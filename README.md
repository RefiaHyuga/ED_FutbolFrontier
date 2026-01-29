# Gestión de Liga de Fútbol en Java

Este proyecto consiste en el desarrollo de una **aplicación en Java** que permite gestionar una **liga de fútbol**, aplicando **programación orientada a objetos** y buenas prácticas de diseño.

La aplicación funciona por **consola**, utilizando un menú interactivo, y mantiene los datos en memoria.

---

## Objetivos del proyecto

- Aplicar conceptos de **POO** (clases, encapsulamiento, constructores, métodos).
- Diseñar una aplicación **modular y extensible**.
- Simular la gestión básica de una liga de fútbol.

---

## Modelado de clases

### Clase `Equipo`

Representa un equipo de fútbol participante en la liga.

**Atributos:**
- `nombre` : String  
- `ciudad` : String  
- `puntos` : int  
- `golesAFavor` : int  
- `golesEnContra` : int  

---

### Clase `Partido`

Representa un partido disputado entre dos equipos.

**Atributos:**
- `equipoLocal` : Equipo  
- `equipoVisitante` : Equipo  
- `golesLocal` : int  
- `golesVisitante` : int  
- `fecha` : LocalDate  

---

### Clase `Liga`

Gestiona el funcionamiento general de la liga.

**Atributos:**
- `listaEquipos` : List<Equipo>  
- `listaPartidos` : List<Partido>  

---

## Funcionalidades obligatorias

La aplicación permite:

### Gestión de equipos
- Registrar equipos en la liga.
- Buscar un equipo por nombre y mostrar su información.

### Gestión de partidos
- Registrar partidos entre equipos existentes.
- Actualizar automáticamente:
  - Puntos del equipo:
    - Victoria: **3 puntos**
    - Empate: **1 punto**
    - Derrota: **0 puntos**
  - Goles a favor y goles en contra.

### Clasificación
- Mostrar la tabla de clasificación ordenada por:
  1. **Puntos**
  2. **Diferencia de goles** (en caso de empate)

### Consultas
- Listar todos los partidos disputados.

---

## Entrada y salida de datos

- La aplicación funciona por **consola**.
- Incluye un **menú interactivo** para seleccionar las operaciones.
- Los datos se mantienen **en memoria** (no se utiliza base de datos ni archivos).

---

## Consideraciones adicionales

- Uso de **encapsulamiento** mediante atributos privados.
- Implementación de **constructores**, **getters** y **setters**.
- Diseño modular y preparado para futuras ampliaciones.
- Manejo de errores, por ejemplo:
  - Intentar registrar un partido con equipos inexistentes.
  - Evitar duplicados de equipos.

---

## Posibles mejoras futuras

- Persistencia de datos en archivos o base de datos.
- Interfaz gráfica (JavaFX o Swing).
- Estadísticas avanzadas (máximo goleador, rachas, etc.).
- Simulación automática de jornadas.

