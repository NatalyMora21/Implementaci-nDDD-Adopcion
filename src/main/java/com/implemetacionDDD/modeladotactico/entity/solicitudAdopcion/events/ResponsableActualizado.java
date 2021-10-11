package com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.implemetacionDDD.modeladotactico.entity.usuario.value.UsuarioId;

public class ResponsableActualizado extends DomainEvent {
    private final UsuarioId usuarioId;
    public ResponsableActualizado(UsuarioId usuarioId) {
        super("sofka.solicitudAdopcion.DescripcionMascotaActualizada");
        this.usuarioId= usuarioId;

    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }
}
