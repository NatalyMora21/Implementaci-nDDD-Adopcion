package com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.value;

import co.com.sofka.domain.generic.ValueObject;

public class Estado implements ValueObject<Estado.EstadoSolicitudAdopcion> {

    public enum EstadoSolicitudAdopcion {
        APROBADA,
        RECHAZADA,
        ENESPERA,
        CANCELADA
    }

    private final EstadoSolicitudAdopcion value;

    public Estado(EstadoSolicitudAdopcion value) {
        this.value=value;
    }

    public EstadoSolicitudAdopcion value() {
        return value;
    }
}
