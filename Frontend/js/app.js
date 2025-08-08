const tabla = document.getElementById("tablaContactos");

async function cargarContactos() {
    const contactos = await listarContactosAPI();
    tabla.innerHTML = "";
    contactos.forEach(c => {
        const fila = document.createElement("tr");
        fila.innerHTML = `
            <td class="py-2 px-4">${c.nombre}</td>
            <td class="py-2 px-4">${c.telefono}</td>
            <td class="py-2 px-4">${c.email}</td>
            <td class="py-2 px-4 text-center">
                <button onclick="eliminar('${c.nombre}')" class="bg-red-500 hover:bg-red-600 text-white px-2 py-1 rounded">🗑</button>
            </td>
        `;
        tabla.appendChild(fila);
    });
}

async function eliminar(nombre) {
    await eliminarContactoAPI(nombre);
    cargarContactos();
}

btnGuardar.addEventListener("click", async () => {
    const nombre = document.getElementById("nombre").value;
    const telefono = document.getElementById("telefono").value;
    const email = document.getElementById("email").value;

    await agregarContactoAPI({ nombre, telefono, email });
    cerrarModal();
    cargarContactos();
});

cargarContactos();
