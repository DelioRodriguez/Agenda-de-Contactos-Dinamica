package com.example.agendacontactosdinamica.service;

import com.example.agendacontactosdinamica.model.Contacto;
import com.example.agendacontactosdinamica.model.Nodo;
import java.util.ArrayList;
import java.util.List;

public class ListaEnlazadaAgenda {

    private Nodo cabeza;

    public void agregar(Contacto contacto) {
        Nodo nuevo = new Nodo(contacto);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public boolean eliminarPorNombre(String nombre) {
        if (cabeza == null) return false;

        if (cabeza.contacto.getNombre().equalsIgnoreCase(nombre)) {
            cabeza = cabeza.siguiente;
            return true;
        }

        Nodo actual = cabeza;
        while (actual.siguiente != null &&
                !actual.siguiente.contacto.getNombre().equalsIgnoreCase(nombre)) {
            actual = actual.siguiente;
        }

        if (actual.siguiente != null) {
            actual.siguiente = actual.siguiente.siguiente;
            return true;
        }
        return false;
    }

    public List<Contacto> listar() {
        List<Contacto> lista = new ArrayList<>();
        Nodo actual = cabeza;
        while (actual != null) {
            lista.add(actual.contacto);
            actual = actual.siguiente;
        }
        return lista;
    }

}
