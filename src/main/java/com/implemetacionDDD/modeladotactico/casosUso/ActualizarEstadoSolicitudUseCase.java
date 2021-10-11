package com.implemetacionDDD.modeladotactico.casosUso;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.Command.ActualizarEstadoSolicitud;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.SolicitudAdopcion;

public class ActualizarEstadoSolicitudUseCase extends UseCase <RequestCommand <ActualizarEstadoSolicitud>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<ActualizarEstadoSolicitud> actualizarEstadoSolicitudRequestCommand) {
        var command = actualizarEstadoSolicitudRequestCommand.getCommand();
        var solicitudAdopcion = SolicitudAdopcion.from(command.getSolicitudAdopcionId(),retrieveEvents(command.getSolicitudAdopcionId().value()));
        solicitudAdopcion.actualizarEstado(command.getEstadoSolicitudAdopcion());
        emit().onResponse(new ResponseEvents(solicitudAdopcion.getUncommittedChanges()));
    }
}
