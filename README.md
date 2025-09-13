# TP3 – Programación Orientada a Objetos (POO)

Trabajo Práctico del Módulo 3 de **Programación II – UTN**.  
Contiene **cinco ejercicios** desarrollados en **Java**, cada uno en su propio paquete dentro de NetBeans.

## 📂 Contenido de los Ejercicios

### 1️⃣ Registro de Estudiantes
- **Clase:** `Estudiante`
- **Atributos:** `nombre`, `apellido`, `curso`, `calificacion`
- **Métodos:**  
  - `mostrarInfo()`  
  - `subirCalificacion(puntos)`  
  - `bajarCalificacion(puntos)`  
- **Descripción:** Permite crear un estudiante, mostrar su información y ajustar la calificación.

---

### 2️⃣ Registro de Mascotas
- **Clase:** `Mascota`
- **Atributos:** `nombre`, `especie`, `edad`
- **Métodos:**  
  - `mostrarInfo()`  
  - `cumplirAnios()`  
- **Descripción:** Crea una mascota, muestra su información y simula el paso del tiempo aumentando la edad.

---

### 3️⃣ Encapsulamiento con la Clase Libro
- **Clase:** `Libro`
- **Atributos (privados):** `titulo`, `autor`, `anioPublicacion`
- **Métodos:**  
  - Getters para todos los atributos.  
  - `setAnioPublicacion(anio)` con validación (solo años >1400 y <=2025).  
- **Descripción:** Crea un libro, intenta modificar el año con valores inválidos y válidos, y muestra el resultado final.

---

### 4️⃣ Gestión de Gallinas en Granja Digital
- **Clase:** `Gallina`
- **Atributos:** `idGallina`, `edad`, `huevosPuestos`
- **Métodos:**  
  - `ponerHuevo()`  
  - `envejecer()`  
  - `mostrarEstado()`  
- **Descripción:** Permite simular gallinas que envejecen y ponen huevos, mostrando su estado actual.

---

### 5️⃣ Simulación de Nave Espacial
- **Clase:** `NaveEspacial`
- **Atributos:** `nombre`, `combustible`
- **Métodos:**  
  - `despegar()`  
  - `avanzar(distancia)`  
  - `recargarCombustible(cantidad)`  
  - `mostrarEstado()`  
- **Reglas:**  
  - Validar combustible suficiente antes de avanzar.  
  - Evitar superar el límite de combustible al recargar.
- **Descripción:** Crea una nave con 50 unidades de combustible, intenta avanzar sin recargar, luego recarga y avanza correctamente.
