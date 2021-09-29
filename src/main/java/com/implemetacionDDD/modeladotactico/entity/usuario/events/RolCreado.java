package com.implemetacionDDD.modeladotactico.entity.usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.implemetacionDDD.modeladotactico.entity.usuario.value.Descripcion;
import com.implemetacionDDD.modeladotactico.entity.usuario.value.TipoCuenta;

public class RolCreado extends DomainEvent {

    private final Descripcion descripcion;
    private final TipoCuenta tipoCuenta;

    public RolCreado (Descripcion descripcion,TipoCuenta tipoCuenta) {
        super("adopciones.rol.rolcreado");
        this.descripcion =descripcion;
        this.tipoCuenta= tipoCuenta;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }
}
