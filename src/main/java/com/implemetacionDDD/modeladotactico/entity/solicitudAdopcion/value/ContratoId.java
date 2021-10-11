package com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.value;

import co.com.sofka.domain.generic.Identity;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.ConsultaMedicaId;

public class ContratoId extends Identity {

    public ContratoId() {

    }

    public ContratoId(String id){
        super(id);
    }
    public static ContratoId of(String id) {
        return new ContratoId(id);

    }
}
