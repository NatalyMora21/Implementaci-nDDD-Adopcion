package com.implemetacionDDD.modeladotactico.casosUso;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.Command.AgregarUsuario;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.SolicitudAdopcion;

public class AgregarUsuarioSolicitudUseCase extends UseCase <RequestCommand <AgregarUsuario>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AgregarUsuario> agregarUsuarioRequestCommand) {

        var command = agregarUsuarioRequestCommand.getCommand();
        var solicitudAdopcion = SolicitudAdopcion.from(command.getSolicitudAdopcionId(),retrieveEvents(command.getUsuarioId().value()));
        solicitudAdopcion.agregarUsuario(command.getUsuarioId());

        emit().onResponse(new ResponseEvents(solicitudAdopcion.getUncommittedChanges()));


    }
}
