package com.implemetacionDDD.modeladotactico.entity.mascota;

import co.com.sofka.domain.generic.EventChange;
import com.implemetacionDDD.modeladotactico.entity.mascota.Mascota;
import com.implemetacionDDD.modeladotactico.entity.mascota.events.*;

import java.util.HashSet;
import java.util.function.Function;

//Aplicar los eventos de dominio que tiene el agregado
public class MascotaChange extends EventChange {

    public MascotaChange(Mascota mascota) {

        //Validar que estados se cambian cuando se generen los eventos de dominio
        apply((MascotaCreada event) -> {
            mascota.nombre = event.getNombre();
            mascota.descripcion = event.getDescripcion();
            mascota.estado = event.getEstado();
            mascota.consultasMedicas = new HashSet<>();
        });

        apply((DescripcionMascotaActualizada event) -> {
            var consultaMedica = mascota.getConsultaMedica(event.getConsultaMedicaId()).
                    orElseThrow(() -> new IllegalArgumentException("No se encuentra la Consulta médica de la mascota"));
            consultaMedica.actualizarDecripcion(event.getDescripcion());
        });
        apply((DiagnosticoConsultaMedicaActualizado event) -> {
            var consultaMedica = mascota.getConsultaMedica(event.getConsultaMedicaId()).
                    orElseThrow(() -> new IllegalArgumentException("No se encuentra la Consulta médica de la mascota"));
            consultaMedica.actualizarDiagnostico(event.getDiagnostico());
        });

        apply((ConsultaMedicaAgregada event) -> {

            mascota.consultasMedicas.add(
                    new ConsultaMedica(
                            event.getConsultaMedicaId(),
                            event.getDescripcion(),
                            event.getFecha()
                    ));
        });

    }
}
