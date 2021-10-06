package com.implemetacionDDD.modeladotactico.entity.mascota.commands;

import co.com.sofka.domain.generic.Command;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.Decripcion;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.MascotaId;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.Nombre;

public class CrearMascota extends Command {

    private final MascotaId mascotaId;
    private final Nombre nombre;
    private final Decripcion descripcion;

    public CrearMascota(MascotaId mascotaId, Nombre nombre, Decripcion descripcion) {
        this.mascotaId = mascotaId;
        this.nombre = nombre;
        this.descripcion =descripcion;
    }

    public MascotaId getMascotaId() {
        return mascotaId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Decripcion getDescripcion() {
        return descripcion;
    }
}
