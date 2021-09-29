package com.implemetacionDDD.modeladotactico.entity.usuario.value;

import co.com.sofka.domain.generic.ValueObject;

public class TipoCuenta implements ValueObject<TipoCuenta.TipoCuentaUsuario> {

    public enum TipoCuentaUsuario
    {
        ADOPTANTE, VETERINARIO, VETERINARIOADMINISTRATIVO;
    }
    private final TipoCuentaUsuario value ;

    public TipoCuenta(TipoCuentaUsuario value) {
        this.value = value;
    }

    public TipoCuentaUsuario value() {
        return value;
    }
}
