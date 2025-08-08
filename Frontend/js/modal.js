const modal = document.getElementById("modalContacto");
const btnAgregar = document.getElementById("btnAgregar");
const btnCancelar = document.getElementById("btnCancelar");
const btnGuardar = document.getElementById("btnGuardar");

function abrirModal() {
    document.getElementById("modalTitulo").textContent = "Nuevo Contacto";
    document.getElementById("nombre").value = "";
    document.getElementById("telefono").value = "";
    document.getElementById("email").value = "";
    modal.classList.remove("hidden");
    modal.classList.add("flex");
}

function cerrarModal() {
    modal.classList.add("hidden");
}

btnAgregar.addEventListener("click", abrirModal);
btnCancelar.addEventListener("click", cerrarModal);
