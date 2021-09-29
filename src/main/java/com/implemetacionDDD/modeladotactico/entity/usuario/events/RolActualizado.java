package com.implemetacionDDD.modeladotactico.entity.usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.implemetacionDDD.modeladotactico.entity.usuario.value.RolId;

public class RolActualizado extends DomainEvent {

    private final RolId rolId;

    public RolActualizado(RolId rolId) {
        super("adopciones.usuario.DescripcionRolActualizado");
        this.rolId= rolId;
    }
    public RolId getRolId() {
        return rolId;
    }
}
