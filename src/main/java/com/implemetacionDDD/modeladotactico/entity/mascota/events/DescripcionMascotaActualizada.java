package com.implemetacionDDD.modeladotactico.entity.mascota.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.ConsultaMedicaId;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.Decripcion;

public class DescripcionMascotaActualizada extends DomainEvent {


    private final Decripcion descripcion;
    private final ConsultaMedicaId consultaMedicaId;

    public DescripcionMascotaActualizada(ConsultaMedicaId consultaMedicaId, Decripcion descripcion) {
        super("sofka.mascota.DescripcionMascotaActualizada");
        this.consultaMedicaId= consultaMedicaId;
        this.descripcion= descripcion;

    }

    public Decripcion getDescripcion() {
        return descripcion;
    }
    public ConsultaMedicaId getConsultaMedicaId() {
        return consultaMedicaId;
    }

}
