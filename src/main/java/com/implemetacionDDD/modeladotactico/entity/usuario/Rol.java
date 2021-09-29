package com.implemetacionDDD.modeladotactico.entity.usuario;

import co.com.sofka.domain.generic.Entity;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.Decripcion;
import com.implemetacionDDD.modeladotactico.entity.usuario.events.UsuarioCreado;
import com.implemetacionDDD.modeladotactico.entity.usuario.value.RolId;

public class Rol extends Entity<RolId> {

    private final Decripcion descripcion;
    private final TipoCuenta tipoCuenta;


    enum TipoCuenta
    {
        ADOPTANTE, VETERINARIO, VETERINARIOADMINISTRATIVO;
    }
    public Rol(RolId entityId, Decripcion descripcion, TipoCuenta tipoCuenta) {
        super(entityId);
        this.descripcion=descripcion;
        this.tipoCuenta= tipoCuenta;

    }

    public Decripcion getDescripcion() {
        return descripcion;
    }

    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }
}
