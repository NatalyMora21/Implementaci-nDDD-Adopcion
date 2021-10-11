package com.implemetacionDDD.modeladotactico.casosUso;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.implemetacionDDD.modeladotactico.entity.mascota.Mascota;
import com.implemetacionDDD.modeladotactico.entity.mascota.commands.CrearMascota;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.MascotaId;


public class CrearMascotaUseCase extends UseCase <RequestCommand<CrearMascota>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<CrearMascota> crearMascotaRequestCommand) {
        var command = crearMascotaRequestCommand.getCommand();

        var mascota = new Mascota(
                command.getMascotaId(),
                command.getNombre(),
                command.getDescripcion()
                );
        emit().onResponse(new ResponseEvents(mascota.getUncommittedChanges()));

    }
    
}
