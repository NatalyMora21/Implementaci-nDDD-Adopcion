package com.implemetacionDDD.modeladotactico.entity.usuario.value;
import co.com.sofka.domain.generic.ValueObject;


public class Usuario implements ValueObject<Usuario.Props> {
    private final String correo;
    private final String contrasena;

    public Usuario(String correo, String contrasena) {
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public Props value() {
        return new Props() {
            @Override
            public String correo() {
                return correo;
            }
            @Override
            public String contrasena() {
                return contrasena;
            }
        };
    }
    public interface Props{
        String correo();
        String contrasena();
    }
}
