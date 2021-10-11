package com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.Command;

import co.com.sofka.domain.generic.Command;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.value.SolicitudAdopcionId;
import com.implemetacionDDD.modeladotactico.entity.usuario.value.UsuarioId;

public class ActualizarResponsable extends Command {

    private final SolicitudAdopcionId solicitudAdopcionId;
    private final UsuarioId usuarioId;

    public ActualizarResponsable(SolicitudAdopcionId solicitudAdopcionId, UsuarioId usuarioId) {
        this.solicitudAdopcionId = solicitudAdopcionId;
        this.usuarioId = usuarioId;
    }

    public SolicitudAdopcionId getSolicitudAdopcionId() {
        return solicitudAdopcionId;
    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }
}
