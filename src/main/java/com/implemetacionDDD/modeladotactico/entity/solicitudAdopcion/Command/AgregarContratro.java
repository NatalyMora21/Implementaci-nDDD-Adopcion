package com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.Command;

import co.com.sofka.domain.generic.Command;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.Contrato;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.value.ContratoId;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.value.DocumentoContrato;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.value.SolicitudAdopcionId;

public class AgregarContratro extends Command {
    private final SolicitudAdopcionId solicitudAdopcionId;
    private final ContratoId contratoId;
    private final DocumentoContrato contrato;

    public AgregarContratro(SolicitudAdopcionId solicitudAdopcionId, ContratoId contratoId, DocumentoContrato contrato) {
        this.solicitudAdopcionId = solicitudAdopcionId;
        this.contratoId = contratoId;
        this.contrato = contrato;
    }

    public SolicitudAdopcionId getSolicitudAdopcionId() {
        return solicitudAdopcionId;
    }

    public ContratoId getContratoId() {
        return contratoId;
    }

    public DocumentoContrato getContrato() {
        return contrato;
    }
}
