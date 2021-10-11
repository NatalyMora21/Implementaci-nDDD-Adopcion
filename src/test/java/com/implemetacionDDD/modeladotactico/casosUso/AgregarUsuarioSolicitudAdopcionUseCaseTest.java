package com.implemetacionDDD.modeladotactico.casosUso;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.Command.AgregarUsuario;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.events.SolicitudAdopcionCreada;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.events.UsuarioAgregado;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.value.SolicitudAdopcionId;
import com.implemetacionDDD.modeladotactico.entity.usuario.value.UsuarioId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class AgregarUsuarioSolicitudAdopcionUseCaseTest {

    private static final String USUARIO_ID = "U-111";
    @Mock
    private DomainEventRepository repository;

    @Test

    void agregarUsuarioSolicitudAdopcion() {
        //arrange
        var command = new AgregarUsuario(
                SolicitudAdopcionId.of("A-111"),
                new UsuarioId(USUARIO_ID)
        );

        var useCase = new AgregarUsuarioSolicitudUseCase();
        Mockito.when(repository.getEventsBy(USUARIO_ID)).thenReturn(EventStored());
        useCase.addRepository(repository);

        //act
        var events = UseCaseHandler.
                getInstance().
                setIdentifyExecutor(USUARIO_ID).
                syncExecutor(useCase,new RequestCommand<>(command)).
                orElseThrow().
                getDomainEvents();

        //asert
        System.out.println(events.get(1));
        var eventUsuarioAgregado = (UsuarioAgregado) events.get(0);
        //System.out.println(events.get(0));
        Assertions.assertEquals(USUARIO_ID, eventUsuarioAgregado.getUsuarioId().value());
        Mockito.verify(repository).getEventsBy(USUARIO_ID);

    }

    private List<DomainEvent> EventStored() {
        return List.of(
                new SolicitudAdopcionCreada()
        );
    }

}

