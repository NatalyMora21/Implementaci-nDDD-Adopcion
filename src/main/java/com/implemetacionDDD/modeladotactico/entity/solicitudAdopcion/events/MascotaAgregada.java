package com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.events;


import co.com.sofka.domain.generic.DomainEvent;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.MascotaId;

public class MascotaAgregada extends DomainEvent {


    private final MascotaId mascotaId;

    public MascotaAgregada( MascotaId mascotaId) {
        super("sofka.solicitudAdopcion.mascotaAgregado");

        this.mascotaId = mascotaId;
    }


    public MascotaId getMascotaId() {
        return mascotaId;
    }
}
