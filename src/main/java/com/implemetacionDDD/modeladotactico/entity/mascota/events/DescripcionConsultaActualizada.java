package com.implemetacionDDD.modeladotactico.entity.mascota.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.ConsultaMedicaId;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.Decripcion;

public class DescripcionConsultaActualizada extends DomainEvent {

    private final ConsultaMedicaId entityId;
    private final Decripcion descripcionConsulta;

    public DescripcionConsultaActualizada(ConsultaMedicaId entityId, Decripcion descripcionConsulta) {
        super("sofka.mascota.DescripcionConsultaActualizada");

        this.entityId = entityId;
        this.descripcionConsulta =descripcionConsulta;
    }

    public ConsultaMedicaId getEntityId() {
        return entityId;
    }

    public Decripcion getDescripcionConsulta() {
        return descripcionConsulta;
    }
}
