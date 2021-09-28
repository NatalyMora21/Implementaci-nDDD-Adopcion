package com.implemetacionDDD.modeladotactico.entity.mascota.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Diagonostico implements ValueObject<String> {

    private final String value;

    public Diagonostico(String value) throws IllegalAccessException {
        this.value= Objects.requireNonNull(value);

        if(this.value.isBlank()){

            throw new IllegalAccessException("la descripción no puede ser vacía");

        }
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Diagonostico that = (Diagonostico) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
