package com.implemetacionDDD.modeladotactico.casosUso;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.implemetacionDDD.modeladotactico.entity.mascota.events.MascotaCreada;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.Command.CrearSolicitudAdopcion;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.events.SolicitudAdopcionCreada;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.value.Estado;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.value.SolicitudAdopcionId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CrearSolicitudAdopcionUseCaseTest {

    @Test
    void crearSolicitud () {

        var command = new CrearSolicitudAdopcion(
                SolicitudAdopcionId.of("A-111"),
                new Estado (Estado.EstadoSolicitudAdopcion.ENESPERA)
        );

        var useCase = new CrearAdopcionUseCase();

        //act

        var eventos = UseCaseHandler.
                getInstance().
                syncExecutor(useCase, new RequestCommand<>(command)).orElseThrow().getDomainEvents();

        //Assert
        var eventCreation = (SolicitudAdopcionCreada)eventos.get(0);

        Assertions.assertEquals(Estado.EstadoSolicitudAdopcion.ENESPERA,eventCreation.getEstado().value());


    }

}
