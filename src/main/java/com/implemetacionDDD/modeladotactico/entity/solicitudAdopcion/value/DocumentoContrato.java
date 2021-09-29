package com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DocumentoContrato implements ValueObject<String> {

    private final String value ;

    public DocumentoContrato(String value) {
        this.value = Objects.requireNonNull(value);
    }


    public String value() {
        return value;
    }
}
