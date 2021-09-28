package com.implemetacionDDD.modeladotactico.entity.mascota.commands;

import com.implemetacionDDD.modeladotactico.entity.mascota.value.Nombre;

public class ActualizarNombreMascota {

    private final Nombre nombre;


    public ActualizarNombreMascota(Nombre nombre) {
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
