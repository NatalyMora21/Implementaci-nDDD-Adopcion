package com.implemetacionDDD.modeladotactico.entity.mascota.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Decripcion implements ValueObject <Decripcion.Props> {

    private final String raza ;
    private final String edad;
    private final String color;

    public Decripcion(String raza, String edad, String color) {
        this.raza = Objects.requireNonNull(raza);
        this.edad = Objects.requireNonNull(edad);
        this.color = Objects.requireNonNull(color);
    }

    public Props value() {
        return new Props() {
            @Override
            public String raza() {
                return raza;
            }

            @Override
            public String edad() {
                return edad;
            }

            @Override
            public String color() {
                return color;
            }
        };
    }

    public interface Props{
        String raza();
        String edad();
        String color();
    }
}
