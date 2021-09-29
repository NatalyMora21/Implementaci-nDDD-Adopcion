package com.implemetacionDDD.modeladotactico.entity.usuario.value;

import co.com.sofka.domain.generic.ValueObject;
import java.util.Objects;

public class Nombre implements ValueObject <String> {

    private final String value ;

    public Nombre(String value) throws IllegalAccessException {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalAccessException("la descripción no puede ser vacía");
        }
        if(this.value.length() <= 5){
            throw new IllegalAccessException("La descripción debe ser mayor a 5 caracteres");
        }
    }

    public String value(){
        return value;
    }
}
