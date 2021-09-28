package com.implemetacionDDD.modeladotactico.entity.mascota.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.ConsultaMedicaId;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.Decripcion;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.Fecha;

import java.util.Date;

public class FechaConsultaMedicaActualizada extends DomainEvent {

    private final Fecha fecha;
    private final ConsultaMedicaId consultaMedicaId;

    public FechaConsultaMedicaActualizada(ConsultaMedicaId consultaMedicaId, Fecha fecha) {
        super("sofka.mascota.FechaConsultaMedicaActualizada");
        this.consultaMedicaId= consultaMedicaId;
        this.fecha = fecha;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public ConsultaMedicaId getConsultaMedicaId() {
        return consultaMedicaId;
    }
}
