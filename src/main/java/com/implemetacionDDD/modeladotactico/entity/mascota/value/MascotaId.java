package com.implemetacionDDD.modeladotactico.entity.mascota.value;

import co.com.sofka.domain.generic.Identity;

public class MascotaId extends Identity {

    public MascotaId(String id){
        super(id);
    }
    public static MascotaId  of(String id) {
        return new MascotaId(id);

    }

}
