package com.implemetacionDDD.modeladotactico.casosUso;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.generic.Command;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.Command.CrearSolicitudAdopcion;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.SolicitudAdopcion;

public class CrearAdopcionUseCase extends UseCase <RequestCommand<CrearSolicitudAdopcion>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearSolicitudAdopcion> crearSolicitudAdopcionRequestCommand) {

        var command = crearSolicitudAdopcionRequestCommand.getCommand();

        var solicitudAdopcion = new SolicitudAdopcion(
                command.getSolicitudAdopcionId()
                );

        emit().onResponse(new ResponseEvents(solicitudAdopcion.getUncommittedChanges()));

    }
}
