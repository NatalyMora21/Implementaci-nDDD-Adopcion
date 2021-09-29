package com.implemetacionDDD.modeladotactico.entity.usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.implemetacionDDD.modeladotactico.entity.usuario.value.*;

public class UsuarioCreado extends DomainEvent {
    private final Nombre nombre;
    private final Identificacion identificacion;
    private final RolId rolId;


    public UsuarioCreado(Nombre nombre, Identificacion identificacion,RolId rolId) {
        super("adopciones.usuario.usuariocreado");
        this.nombre= nombre;
        this.identificacion= identificacion;
        this.rolId= rolId;

    }

    public Nombre getNombre() {
        return nombre;
    }

    public Identificacion getIdentificacion() {
        return identificacion;
    }

    public RolId getRolId() {
        return rolId;
    }
}
