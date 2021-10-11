package com.implemetacionDDD.modeladotactico.casosUso;


import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.MascotaId;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.Command.AgregarMascota;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.events.MascotaAgregada;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.events.SolicitudAdopcionCreada;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.value.SolicitudAdopcionId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class AgregarMascotaSolicitudUseCaseTest {

    private static final String MASCOTA_ID = "M-111";
    @Mock
    private DomainEventRepository repository;

    @Test

    void agregarMascotaSolicitudAdopcion() {
        //arrange
        var command = new AgregarMascota(
                SolicitudAdopcionId.of("A-111"),
                new MascotaId(MASCOTA_ID)
        );

        var useCase = new AgregarMascotaUseCase();
        Mockito.when(repository.getEventsBy(MASCOTA_ID)).thenReturn(EventStored());
        useCase.addRepository(repository);

        //act
        var events = UseCaseHandler.
                getInstance().
                setIdentifyExecutor(MASCOTA_ID).
                syncExecutor(useCase,new RequestCommand<>(command)).
                orElseThrow().
                getDomainEvents();

        //asert
        var eventMascotaAgregada = (MascotaAgregada) events.get(1);
        //System.out.println(eventMascotaAgregada);
        Assertions.assertEquals(MASCOTA_ID, eventMascotaAgregada.getMascotaId().value());
        Mockito.verify(repository).getEventsBy(MASCOTA_ID);

    }

    private List<DomainEvent> EventStored() {
        return List.of(
                new SolicitudAdopcionCreada()
        );
    }





}
