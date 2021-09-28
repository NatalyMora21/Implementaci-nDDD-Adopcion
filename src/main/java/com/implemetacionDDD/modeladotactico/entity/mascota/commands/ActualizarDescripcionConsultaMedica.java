package com.implemetacionDDD.modeladotactico.entity.mascota.commands;

import co.com.sofka.domain.generic.Command;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.ConsultaMedicaId;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.Decripcion;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.MascotaId;

public class ActualizarDescripcionConsultaMedica extends Command {

    private final MascotaId mascotaId;
    private final ConsultaMedicaId consultaMedicaId;
    private final Decripcion descripcion;

    public ActualizarDescripcionConsultaMedica(MascotaId mascotaId, ConsultaMedicaId consultaMedicaId, Decripcion descripcion) {
        this.mascotaId = mascotaId;
        this.consultaMedicaId = consultaMedicaId;
        this.descripcion = descripcion;
    }

    public MascotaId getMascotaId() {
        return mascotaId;
    }

    public ConsultaMedicaId getConsultaMedicaId() {
        return consultaMedicaId;
    }

    public Decripcion getDescripcion() {
        return descripcion;
    }
}
