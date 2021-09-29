package com.implemetacionDDD.modeladotactico.entity.usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.implemetacionDDD.modeladotactico.entity.usuario.value.Nombre;

public class NombreUsuarioActualizado extends DomainEvent {

    private Nombre nombre;

    public NombreUsuarioActualizado(Nombre nombre) {
        super("");
        this.nombre=nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
