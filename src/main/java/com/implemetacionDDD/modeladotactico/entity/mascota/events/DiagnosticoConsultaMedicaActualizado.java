package com.implemetacionDDD.modeladotactico.entity.mascota.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.ConsultaMedicaId;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.Diagonostico;

public class DiagnosticoConsultaMedicaActualizado extends DomainEvent {


    private final ConsultaMedicaId consultaMedicaId;
    private final Diagonostico diagnostico;

    public DiagnosticoConsultaMedicaActualizado(ConsultaMedicaId consultaMedicaId, Diagonostico diagnostico) {
        super("sofka.mascota.DiagnosticoConsultaMedicaActualizado");
        this.consultaMedicaId= consultaMedicaId;
        this.diagnostico= diagnostico;
    }

    public ConsultaMedicaId getConsultaMedicaId() {
        return consultaMedicaId;
    }

    public Diagonostico getDiagnostico() {
        return diagnostico;
    }




}
