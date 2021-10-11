package com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.Command;

import co.com.sofka.domain.generic.Command;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.Contrato;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.value.SolicitudAdopcionId;

public class AgregarContratro extends Command {
    private final SolicitudAdopcionId solicitudAdopcionId;
    private final Contrato contrato;

    public AgregarContratro(SolicitudAdopcionId solicitudAdopcionId, Contrato contrato) {
        this.solicitudAdopcionId = solicitudAdopcionId;
        this.contrato = contrato;
    }

    public SolicitudAdopcionId getSolicitudAdopcionId() {
        return solicitudAdopcionId;
    }

    public Contrato getContrato() {
        return contrato;
    }
}
