# Lista Enlazada para Agenda de Contactos

Este proyecto implementa una **lista simplemente enlazada** para gestionar una agenda de contactos.  
Cada contacto incluye **nombre**, **número de teléfono** y **correo electrónico**.  

## Características

La lista enlazada permite:

1. **Agregar un nuevo contacto al final** de la lista.
2. **Eliminar un contacto por nombre**.
3. **Mostrar todos los contactos** en orden de inserción.

## Estructura del Código

El proyecto se organiza en tres clases principales:

### 1. `Contacto`
Representa un contacto de la agenda.

**Atributos:**
- `nombre`: Nombre completo del contacto.
- `telefono`: Número de teléfono.
- `correo`: Dirección de correo electrónico.

**Métodos:**
- `constructor(nombre, telefono, correo)`: Inicializa un nuevo contacto.
- `toString()`: Devuelve una cadena con los datos del contacto.

---

### 2. `Nodo`
Representa un nodo de la lista enlazada que contiene un contacto.

**Atributos:**
- `contacto`: Objeto de tipo `Contacto`.
- `siguiente`: Referencia al siguiente nodo (o `null` si es el último).

**Métodos:**
- `constructor(contacto)`: Inicializa un nodo con el contacto dado.

---

### 3. `ListaEnlazadaAgenda`
Gestiona la lista enlazada de contactos.

**Atributos:**
- `cabeza`: Primer nodo de la lista (o `null` si está vacía).

**Métodos:**
- `agregarContacto(contacto)`: Agrega un nuevo contacto al final de la lista.
- `eliminarContacto(nombre)`: Elimina el contacto cuyo nombre coincida.
- `mostrarContactos()`: Muestra en consola todos los contactos.

---

**<img width="1177" height="891" alt="image" src="https://github.com/user-attachments/assets/498e0981-2bb0-48eb-bb75-b94c469d887b" />
<img width="1198" height="891" alt="image" src="https://github.com/user-attachments/assets/5d726a00-6206-4d91-9f63-bf1c5884afb2" />**

## Ejemplo de Uso

```javascript
// Crear instancia de la agenda
const agenda = new ListaEnlazadaAgenda();

// Agregar contactos
agenda.agregarContacto(new Contacto("Juan Pérez", "809-555-1234", "juan@example.com"));
agenda.agregarContacto(new Contacto("María López", "809-555-5678", "maria@example.com"));
agenda.agregarContacto(new Contacto("Carlos Gómez", "809-555-9012", "carlos@example.com"));

// Mostrar contactos
agenda.mostrarContactos();

// Eliminar un contacto
agenda.eliminarContacto("María López");

// Mostrar contactos después de eliminar
agenda.mostrarContactos();
