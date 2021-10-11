package com.implemetacionDDD.modeladotactico.casosUso;


import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.MascotaId;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.Command.ActualizarEstadoSolicitud;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.Command.AgregarMascota;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.events.EstadoSolicitudActualizada;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.events.SolicitudAdopcionCreada;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.value.Estado;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.value.SolicitudAdopcionId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ActualizarEstadoSolicitudUseCaseTest {

    private static final String SOLICITUD_ID = "M-111";
    @Mock
    private DomainEventRepository repository;

    @Test
    void actualizarEstadoSolicitud () {

        //arrange
        var command = new ActualizarEstadoSolicitud(
                SolicitudAdopcionId.of(SOLICITUD_ID),
                new Estado(Estado.EstadoSolicitudAdopcion.APROBADA)
        );

        var useCase = new ActualizarEstadoSolicitudUseCase();
        Mockito.when(repository.getEventsBy(SOLICITUD_ID)).thenReturn(EventStored());
        useCase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance().
                syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow().getDomainEvents();

        //assert
        System.out.println(events.get(1));
        var event = (EstadoSolicitudActualizada)events.get(0);

        Assertions.assertEquals(Estado.EstadoSolicitudAdopcion.APROBADA, event.getEstadoSolicitudAdopcion());
        Mockito.verify(repository).getEventsBy(SOLICITUD_ID);

    }

    private List<DomainEvent> EventStored() {
        return List.of(
                new SolicitudAdopcionCreada()
        );
    }




}
