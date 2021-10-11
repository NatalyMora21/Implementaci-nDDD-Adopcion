package com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.Command;

import co.com.sofka.domain.generic.Command;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.MascotaId;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.value.SolicitudAdopcionId;

public class AgregarMascota extends Command {

    private final SolicitudAdopcionId solicitudAdopcionId;
    private final MascotaId mascotaId;

    public AgregarMascota(SolicitudAdopcionId solicitudAdopcionId, MascotaId mascotaId) {
        this.solicitudAdopcionId = solicitudAdopcionId;
        this.mascotaId = mascotaId;
    }

    public SolicitudAdopcionId getSolicitudAdopcionId() {
        return solicitudAdopcionId;
    }

    public MascotaId getMascotaId() {
        return mascotaId;
    }
}
