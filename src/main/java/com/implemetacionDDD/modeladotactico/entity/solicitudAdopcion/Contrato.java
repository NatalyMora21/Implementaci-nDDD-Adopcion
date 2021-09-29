package com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generic.Identity;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.Diagonostico;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.value.ContratoId;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.value.DocumentoContrato;

import java.util.Objects;

public class Contrato extends Entity<ContratoId> {

    protected  DocumentoContrato documentoContrato;

    public Contrato(ContratoId entityId, DocumentoContrato documentoContrato) {
        super(entityId);
        this.documentoContrato= documentoContrato;

    }

    public void actualizarContrato(DocumentoContrato contrato) {
        this.documentoContrato= Objects.requireNonNull(contrato);
    }

    public DocumentoContrato getDocumentoContrato() {
        return documentoContrato;
    }

}
