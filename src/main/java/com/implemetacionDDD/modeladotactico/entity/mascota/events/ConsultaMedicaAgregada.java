package com.implemetacionDDD.modeladotactico.entity.mascota.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.ConsultaMedicaId;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.Decripcion;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.Fecha;

public class ConsultaMedicaAgregada extends DomainEvent {


    private final ConsultaMedicaId consultaMedicaId;
    private final Decripcion descripcion;
    private final Fecha fecha;


    public ConsultaMedicaAgregada(ConsultaMedicaId consultaMedicaId, Decripcion descripcion, Fecha fecha) {
        super("sofka.mascota.consultaMedicaAgregada");
        this.consultaMedicaId= consultaMedicaId;
        this.descripcion= descripcion;
        this.fecha= fecha;
    }

    public ConsultaMedicaId getConsultaMedicaId() {
        return consultaMedicaId;
    }

    public Decripcion getDescripcion() {
        return descripcion;
    }

    public Fecha getFecha() {
        return fecha;
    }

}
