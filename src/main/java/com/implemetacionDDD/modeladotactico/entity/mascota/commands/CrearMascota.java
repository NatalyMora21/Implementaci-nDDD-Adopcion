package com.implemetacionDDD.modeladotactico.entity.mascota.commands;

import co.com.sofka.domain.generic.Command;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.Decripcion;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.MascotaId;

public class CrearMascota extends Command {

    private final MascotaId mascotaId;
    private final Decripcion descripcion;

    public CrearMascota(MascotaId mascotaId, Decripcion descripcion) {
        this.mascotaId = mascotaId;
        this.descripcion =descripcion;
    }

    public MascotaId getMascotaId() {
        return mascotaId;
    }
}
