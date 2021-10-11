package com.implemetacionDDD.modeladotactico.casosUso;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.Command.AgregarMascota;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.SolicitudAdopcion;

public class AgregarMascotaUseCase extends UseCase <RequestCommand <AgregarMascota>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AgregarMascota> agregarMascotaRequestCommand) {
        var command = agregarMascotaRequestCommand.getCommand();
        var solicitudAdopcion = SolicitudAdopcion.from(command.getSolicitudAdopcionId(),retrieveEvents(command.getMascotaId().value()));
        solicitudAdopcion.agregarMascota(command.getMascotaId());
        emit().onResponse(new ResponseEvents(solicitudAdopcion.getUncommittedChanges()));
    }
}
