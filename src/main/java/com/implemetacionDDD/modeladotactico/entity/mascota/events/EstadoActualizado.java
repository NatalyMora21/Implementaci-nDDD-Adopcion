package com.implemetacionDDD.modeladotactico.entity.mascota.events;

import co.com.sofka.domain.generic.DomainEvent;

public class EstadoActualizado extends DomainEvent {
    public EstadoActualizado(Enum estado) {
        super("sofka.mascota.EstadoActualizado");

    }
}
