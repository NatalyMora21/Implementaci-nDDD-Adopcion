package com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.value;

import co.com.sofka.domain.generic.Identity;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.MascotaId;

public class SolicitudAdopcionId extends Identity {

    private SolicitudAdopcionId(String id){
        super(id);
    }
    public static SolicitudAdopcionId of(String id) {
        return new SolicitudAdopcionId(id);

    }
}
