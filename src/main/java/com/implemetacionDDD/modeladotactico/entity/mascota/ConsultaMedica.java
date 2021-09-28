package com.implemetacionDDD.modeladotactico.entity.mascota;

import co.com.sofka.domain.generic.Entity;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.ConsultaMedicaId;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.Decripcion;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.Diagonostico;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.Fecha;

import java.util.Objects;

public class ConsultaMedica extends Entity <ConsultaMedicaId> {

    protected Decripcion descripcion;
    protected Fecha fecha;
    protected Diagonostico diagnostico;

    public ConsultaMedica(ConsultaMedicaId entityId, Decripcion descripcion, Fecha fecha) {
        super(entityId);
        this.descripcion=descripcion;
        this.fecha= fecha;
    }

    //Comportamientos
    public void actualizarDecripcion(Decripcion descripcion) {
        this.descripcion =Objects.requireNonNull(descripcion);
    }
    public void actualizarDiagnostico(Diagonostico diagnostico) {
        this.diagnostico= Objects.requireNonNull(diagnostico);
    }
    public void actualizarFechaconsulta(Fecha fecha) {
        this.fecha= Objects.requireNonNull(fecha);
    }



    //Las entidades no manejan enventos
    //Propiedades
    public Decripcion descripcion() {
        return descripcion;
    }

    public Fecha fecha() {
        return fecha;
    }
}
