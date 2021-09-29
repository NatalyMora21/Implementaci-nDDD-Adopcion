package com.implemetacionDDD.modeladotactico.entity.usuario;

import co.com.sofka.domain.generic.AggregateEvent;

import com.implemetacionDDD.modeladotactico.entity.usuario.events.DescripcionRolActualizado;
import com.implemetacionDDD.modeladotactico.entity.usuario.events.NombreUsuarioActualizado;
import com.implemetacionDDD.modeladotactico.entity.usuario.events.RolActualizado;
import com.implemetacionDDD.modeladotactico.entity.usuario.events.UsuarioCreado;
import com.implemetacionDDD.modeladotactico.entity.usuario.value.*;

import java.util.Objects;

public class Usuario extends AggregateEvent <UsuarioId> {
    protected Nombre nombre;
    protected Identificacion identificacion;
    protected RolId rolId;

    public Usuario(UsuarioId usuarioId, Nombre nombre,  Identificacion identifiacion,RolId rolId) {
        super(usuarioId);
        //Lanzar el evento de dominio
        appendChange(new UsuarioCreado(nombre,identifiacion,rolId)).apply();
    }


    public void actualizarRol(RolId rolId) {
        Objects.requireNonNull(rolId);
        appendChange(new RolActualizado(rolId));
    }

    public void actualizarNombreUsuario(Nombre nombre) {
        Objects.requireNonNull(nombre);
        appendChange(new NombreUsuarioActualizado(nombre));
    }

    public void actualizarDescripcionRol(RolId rolId, Descripcion descripcion) {
        Objects.requireNonNull(descripcion);
        appendChange(new DescripcionRolActualizado(rolId, descripcion));
    }

    //Encapsular las propiedades
    public Nombre nombre() {
        return nombre;
    }
    public Identificacion identificacion() {
        return identificacion;
    }
    public RolId rolId() {
        return rolId;
    }
}
