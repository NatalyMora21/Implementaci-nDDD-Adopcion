package com.implemetacionDDD.modeladotactico.entity.mascota.commands;

import co.com.sofka.domain.generic.Command;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.ConsultaMedicaId;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.Decripcion;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.MascotaId;

public class ActualizarDescripcionMascota extends Command {

    private final MascotaId mascotaId;
    private final Decripcion descripcion;

    public ActualizarDescripcionMascota(MascotaId mascotaId,Decripcion descripcion ){
        this.mascotaId = mascotaId;
        this.descripcion= descripcion;
    }

    public MascotaId getMascotaId() {
        return mascotaId;
    }

    public Decripcion getDescripcion() {
        return descripcion;
    }
}
