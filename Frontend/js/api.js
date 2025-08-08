const API = "http://localhost:8080/api/agenda";

async function listarContactosAPI() {
    const res = await fetch(`${API}/listar`);
    return res.json();
}

async function agregarContactoAPI(contacto) {
    return fetch(`${API}/agregar`, {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(contacto)
    });
}

async function eliminarContactoAPI(nombre) {
    return fetch(`${API}/eliminar/${nombre}`, { method: "DELETE" });
}
