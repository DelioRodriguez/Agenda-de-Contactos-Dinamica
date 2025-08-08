package com.example.agendacontactosdinamica.resource;

import com.example.agendacontactosdinamica.model.Contacto;
import com.example.agendacontactosdinamica.service.ListaEnlazadaAgenda;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/agenda")
@CrossOrigin(origins = "*")
public class AgendaResource {

    private final ListaEnlazadaAgenda agenda = new ListaEnlazadaAgenda();

    @PostMapping("/agregar")
    public void agregar(@RequestBody Contacto contacto) {
        agenda.agregar(contacto);
    }

    @DeleteMapping("/eliminar/{nombre}")
    public boolean eliminar(@PathVariable String nombre) {
        return agenda.eliminarPorNombre(nombre);
    }

    @GetMapping("/listar")
    public List<Contacto> listar() {
        return agenda.listar();
    }

}
