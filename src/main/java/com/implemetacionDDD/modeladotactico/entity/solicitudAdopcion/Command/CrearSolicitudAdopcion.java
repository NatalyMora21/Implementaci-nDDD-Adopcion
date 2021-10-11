package com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.Command;

import co.com.sofka.domain.generic.Command;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.MascotaId;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.value.Estado;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.value.SolicitudAdopcionId;
import com.implemetacionDDD.modeladotactico.entity.usuario.value.UsuarioId;

public class CrearSolicitudAdopcion extends Command {

    private final SolicitudAdopcionId solicitudAdopcionId;

    private final Estado estado;

    public CrearSolicitudAdopcion(SolicitudAdopcionId solicitudAdopcionId, Estado estado) {
        this.solicitudAdopcionId= solicitudAdopcionId;
        this.estado = estado;
    }

    public SolicitudAdopcionId getSolicitudAdopcionId() {
        return solicitudAdopcionId;
    }



    public Estado getEstado() {
        return estado;
    }
}
