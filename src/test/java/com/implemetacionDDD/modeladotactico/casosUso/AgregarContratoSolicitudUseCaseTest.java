package com.implemetacionDDD.modeladotactico.casosUso;


import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.Command.AgregarContratro;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.events.ContratoAgregado;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.events.SolicitudAdopcionCreada;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.value.ContratoId;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.value.DocumentoContrato;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.value.SolicitudAdopcionId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class AgregarContratoSolicitudUseCaseTest {

    private static final String CONTRATO_ID = "C-111";
    @Mock
    private DomainEventRepository repository;

    @Test
    void agregarContrato() {

        var command = new AgregarContratro(
                SolicitudAdopcionId.of("A-111"),
                new ContratoId(CONTRATO_ID),
                new DocumentoContrato("Documento No 1")
        );

        var useCase = new AgregarContratoSolicitudUseCase();
        Mockito.when(repository.getEventsBy(CONTRATO_ID)).thenReturn(EventStored());
        useCase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(CONTRATO_ID)
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var eventContratoAgregado = (ContratoAgregado) events.get(0);

        Assertions.assertEquals("Documento No 1", eventContratoAgregado.getDocumentoContrato().value());
        Mockito.verify(repository).getEventsBy(CONTRATO_ID);

    }

    private List<DomainEvent> EventStored() {
        return List.of(
                new SolicitudAdopcionCreada()
        );
    }




}
