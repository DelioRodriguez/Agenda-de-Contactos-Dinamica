package com.example.agendacontactosdinamica.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contacto {

    private final String nombre;
    private final String telefono;
    private final String email;

    public Contacto(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

}
