package com.implemetacionDDD.modeladotactico.entity.mascota.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.Nombre;

public class NombreActualizado extends DomainEvent {

    private final Nombre nombre;

    public NombreActualizado(Nombre nombre) {
        super("sofka.mascota.NombreActualizado");
        this.nombre= nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
