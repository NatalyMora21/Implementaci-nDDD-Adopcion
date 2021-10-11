package com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.value.Estado;

public class SolicitudAdopcionCreada extends DomainEvent {


    private final Estado estado;


    public SolicitudAdopcionCreada() {
        super("sofka.solicitudAdopcion.solicitudAdopcionCreada");
        this.estado= new Estado(Estado.EstadoSolicitudAdopcion.ENESPERA);

    }



    public Estado getEstado() {
        return estado;
    }
}
