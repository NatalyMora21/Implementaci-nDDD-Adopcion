package com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.value.Estado;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.value.SolicitudAdopcionId;

public class EstadoSolicitudActualizada extends DomainEvent {

    private final Estado.EstadoSolicitudAdopcion estadoSolicitudAdopcion;

    public EstadoSolicitudActualizada( Estado.EstadoSolicitudAdopcion estadoSolicitudAdopcion) {
        super( "sofka.solicitudAdopcion.solicitudAdopcionCreada");
        this.estadoSolicitudAdopcion = estadoSolicitudAdopcion;
    }

    public Estado.EstadoSolicitudAdopcion getEstadoSolicitudAdopcion() {
        return estadoSolicitudAdopcion;
    }
}
