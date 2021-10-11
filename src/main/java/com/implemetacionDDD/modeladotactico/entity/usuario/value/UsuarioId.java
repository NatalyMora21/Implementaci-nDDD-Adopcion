package com.implemetacionDDD.modeladotactico.entity.usuario.value;

import co.com.sofka.domain.generic.Identity;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.MascotaId;

public class UsuarioId extends Identity {

    public UsuarioId(String id){
        super(id);
    }
    public static UsuarioId of(String id) {
        return new UsuarioId(id);

    }

}
