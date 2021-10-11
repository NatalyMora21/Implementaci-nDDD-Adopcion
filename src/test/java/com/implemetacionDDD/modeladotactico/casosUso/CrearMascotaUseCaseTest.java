package com.implemetacionDDD.modeladotactico.casosUso;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.implemetacionDDD.modeladotactico.entity.mascota.Mascota;
import com.implemetacionDDD.modeladotactico.entity.mascota.commands.CrearMascota;
import com.implemetacionDDD.modeladotactico.entity.mascota.events.MascotaCreada;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.Decripcion;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.MascotaId;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.Nombre;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrearMascotaUseCaseTest {

    @Test
    void crearMascota () throws IllegalAccessException {

        //Arrange
        var command = new CrearMascota(
                MascotaId.of("M-111"),
                new Nombre("Tom"),
                new Decripcion("Pastor Aleman", "11", "Café")
        );

        var useCase = new CrearMascotaUseCase();

        //act
        var eventos = UseCaseHandler.
                getInstance().
                syncExecutor(useCase,new RequestCommand<>(command)).
                orElseThrow().getDomainEvents();

        //Assert
        var eventCreation = (MascotaCreada)eventos.get(0);

        Assertions.assertEquals("Tom",eventCreation.getNombre().value());
        Assertions.assertEquals("Pastor Aleman",eventCreation.getDescripcion().value().raza());
        Assertions.assertEquals("11",eventCreation.getDescripcion().value().edad());
        Assertions.assertEquals("Café",eventCreation.getDescripcion().value().color());
    }



}