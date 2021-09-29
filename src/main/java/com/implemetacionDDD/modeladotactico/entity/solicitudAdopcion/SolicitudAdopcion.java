package com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion;

import co.com.sofka.domain.generic.AggregateEvent;
import com.implemetacionDDD.modeladotactico.entity.mascota.events.EstadoActualizado;
import com.implemetacionDDD.modeladotactico.entity.mascota.events.MascotaCreada;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.MascotaId;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.events.ContratoAgregado;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.events.ResponsableActualizado;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.events.SolicitudAdopcionCreada;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.value.DocumentoContrato;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.value.Estado;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.value.FechaSolicitud;
import com.implemetacionDDD.modeladotactico.entity.solicitudAdopcion.value.SolicitudAdopcionId;
import com.implemetacionDDD.modeladotactico.entity.usuario.value.UsuarioId;

import java.util.Objects;

public class SolicitudAdopcion extends AggregateEvent <SolicitudAdopcionId> {

    protected MascotaId mascotaId;
    protected UsuarioId usuarioId;
    protected UsuarioId responsableId;
    protected Estado estado;
    protected FechaSolicitud fecha;
    protected Contrato contratoId;

    public SolicitudAdopcion(SolicitudAdopcionId entityId, MascotaId mascotaId, UsuarioId usuarioId, UsuarioId responsableId, Estado estado, FechaSolicitud fecha) {
        super(entityId);

        appendChange(new SolicitudAdopcionCreada(mascotaId,usuarioId,responsableId,estado)).apply();
    }
    public void actualizarEstado(Enum estado) {
        Objects.requireNonNull(estado);
        appendChange(new EstadoActualizado(estado));
    }
    public void agregarContrato(Contrato contratoId, DocumentoContrato documentoContrato) {
        Objects.requireNonNull(documentoContrato);
        Objects.requireNonNull(contratoId);
        appendChange(new ContratoAgregado(contratoId, documentoContrato));
    }
    public void actualizarReponsable(UsuarioId usuarioId) {
        Objects.requireNonNull(usuarioId);
        appendChange(new ResponsableActualizado(usuarioId));
    }

    public void actualizarDocumentoContrato(Contrato contratoId, DocumentoContrato documento) {

    }



}
