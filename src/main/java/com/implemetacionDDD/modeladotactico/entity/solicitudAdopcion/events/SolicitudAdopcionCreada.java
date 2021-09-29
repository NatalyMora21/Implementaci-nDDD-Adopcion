package com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.MascotaId;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.value.Estado;
import com.implemetacionDDD.modeladotactico.entity.usuario.value.UsuarioId;

public class SolicitudAdopcionCreada extends DomainEvent {

    private final MascotaId mascotaId;
    private final UsuarioId usuarioId;
    private final UsuarioId responsableId;
    private final Estado estado;


    public SolicitudAdopcionCreada(MascotaId mascotaId, UsuarioId usuarioId, UsuarioId responsableId, Estado estado) {
        super("sofka.mascota.solicitudAdopcionCreada");
        this.mascotaId=mascotaId;
        this.usuarioId=usuarioId;
        this.responsableId=responsableId;
        this.estado=estado;
    }

    public MascotaId getMascotaId() {
        return mascotaId;
    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }

    public UsuarioId getResponsableId() {
        return responsableId;
    }

    public Estado getEstado() {
        return estado;
    }
}
