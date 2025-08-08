package com.example.agendacontactosdinamica.model;

public class Nodo {

    public Contacto contacto;
    public Nodo siguiente;

    public Nodo(Contacto contacto) {
        this.contacto = contacto;
        this.siguiente = null;
    }

}
