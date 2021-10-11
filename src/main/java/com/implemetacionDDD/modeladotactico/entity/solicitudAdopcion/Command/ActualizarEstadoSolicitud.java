package com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.Command;

import co.com.sofka.domain.generic.Command;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.value.Estado;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.value.SolicitudAdopcionId;

public class ActualizarEstadoSolicitud extends Command {

    private final SolicitudAdopcionId solicitudAdopcionId;
    private final Estado.EstadoSolicitudAdopcion estadoSolicitudAdopcion;

    public ActualizarEstadoSolicitud(SolicitudAdopcionId solicitudAdopcionId, Estado.EstadoSolicitudAdopcion estadoSolicitudAdopcion) {
        this.solicitudAdopcionId = solicitudAdopcionId;
        this.estadoSolicitudAdopcion = estadoSolicitudAdopcion;
    }

    public SolicitudAdopcionId getSolicitudAdopcionId() {
        return solicitudAdopcionId;
    }

    public Estado.EstadoSolicitudAdopcion getEstadoSolicitudAdopcion() {
        return estadoSolicitudAdopcion;
    }
}
