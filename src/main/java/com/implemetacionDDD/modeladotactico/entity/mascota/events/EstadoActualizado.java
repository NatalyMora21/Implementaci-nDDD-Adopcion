package com.implemetacionDDD.modeladotactico.entity.mascota.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.value.Estado;

public class EstadoActualizado extends DomainEvent {

    private Estado estado;

    public EstadoActualizado(Enum estado) {
        super("sofka.mascota.EstadoActualizado");

    }
}
