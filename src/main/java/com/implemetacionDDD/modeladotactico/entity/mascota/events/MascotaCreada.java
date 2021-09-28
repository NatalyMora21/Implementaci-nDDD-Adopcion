package com.implemetacionDDD.modeladotactico.entity.mascota.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.Decripcion;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.Nombre;

public class MascotaCreada extends DomainEvent {

    enum Estado
    {
        ADOPTADO, DISPONIBLE, ENPROCESO ,NODISPONIBLE;
    }

    private final Nombre nombre;
    private final Decripcion descripcion;
    private final Estado estado;



    public MascotaCreada(Nombre nombre, Decripcion descripcion) {
        super("sofka.mascota.mascotaCreada");
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado= Estado.NODISPONIBLE;
    }

    public Decripcion getDescripcion() {
        return descripcion;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Estado getEstado() {
        return estado;
    }
}
