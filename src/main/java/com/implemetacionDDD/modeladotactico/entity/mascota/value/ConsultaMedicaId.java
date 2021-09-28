package com.implemetacionDDD.modeladotactico.entity.mascota.value;

import co.com.sofka.domain.generic.Identity;

public class ConsultaMedicaId extends Identity  {

    public ConsultaMedicaId() {

    }

    private ConsultaMedicaId(String id){
        super(id);
    }
    public static ConsultaMedicaId  of(String id) {
        return new ConsultaMedicaId(id);

    }
}
