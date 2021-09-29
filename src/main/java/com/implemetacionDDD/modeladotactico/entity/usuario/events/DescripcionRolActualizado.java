package com.implemetacionDDD.modeladotactico.entity.usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.implemetacionDDD.modeladotactico.entity.usuario.value.Descripcion;
import com.implemetacionDDD.modeladotactico.entity.usuario.value.RolId;

import java.util.UUID;

public class DescripcionRolActualizado extends DomainEvent {

    private final RolId rolId;
    private final Descripcion descripcion;


    public DescripcionRolActualizado(RolId rolId, Descripcion descripcion) {
        super("adopciones.usuario.DescripcionRolActualizado");
        this.rolId=rolId;
        this.descripcion= descripcion;
    }

    public RolId getRolId() {
        return rolId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
