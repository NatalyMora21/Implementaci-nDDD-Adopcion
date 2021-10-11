package com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.MascotaId;
import com.implemetacionDDD.modeladotactico.entity.usuario.value.UsuarioId;

public class UsuarioAgregado extends DomainEvent {

    private final UsuarioId usuarioId;

    public UsuarioAgregado(UsuarioId usuarioId) {
        super("sofka.solicitudAdopcion.usuarioAgregado");
        this.usuarioId = usuarioId;
    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }
}
