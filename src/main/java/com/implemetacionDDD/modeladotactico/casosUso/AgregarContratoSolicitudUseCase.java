package com.implemetacionDDD.modeladotactico.casosUso;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.Command.AgregarContratro;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.SolicitudAdopcion;

public class AgregarContratoSolicitudUseCase extends UseCase <RequestCommand <AgregarContratro>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AgregarContratro> agregarContratroRequestCommand) {

        var command = agregarContratroRequestCommand.getCommand();
        var solicitudAdopcion = SolicitudAdopcion.from(command.getSolicitudAdopcionId(),retrieveEvents(command.getContratoId().value()));
        solicitudAdopcion.agregarContrato(command.getContratoId(),command.getContrato());
        emit().onResponse(new ResponseEvents(solicitudAdopcion.getUncommittedChanges()));
        
    }
}
