package com.implemetacionDDD.modeladotactico.entity.mascota;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.implemetacionDDD.modeladotactico.entity.mascota.events.*;
import com.implemetacionDDD.modeladotactico.entity.mascota.value.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Mascota extends AggregateEvent<MascotaId> {

    protected Nombre nombre;
    protected Decripcion descripcion;
    protected Set<ConsultaMedica> consultasMedicas;
    protected Enum estado;

    public Mascota (MascotaId mascotaId, Nombre nombre, Decripcion descripcion) {
        super(mascotaId);
        //Lance un evento de dominio
        appendChange(new MascotaCreada(nombre,descripcion)).apply();
    }

    private Mascota(MascotaId mascotaId){
        //Cada vez que se ejecuta un comportamiento se va a generar un evento, y con esto se cambian los estados del gregado
        super(mascotaId);
        subscribe(new MascotaChange(this));
    }

    //Cuando el agregado aún no se agregado, construir el agregado mascota
    public static Mascota from (MascotaId mascotaId, List<DomainEvent> events ){

        var mascota = new Mascota(mascotaId);
        events.forEach(mascota::applyEvent);
        return mascota;

    }
    public void agregarConsultaMedica(ConsultaMedicaId consultaMedicaId, Decripcion descripcionConsulta, Fecha fecha) {
        Objects.requireNonNull(consultaMedicaId);
        Objects.requireNonNull(descripcionConsulta);
        Objects.requireNonNull(fecha);
        appendChange(new ConsultaMedicaAgregada(consultaMedicaId, descripcion, fecha)).apply();
    }

    public void actualizarNombre(Nombre nombre) {
        Objects.requireNonNull(nombre);
        appendChange(new NombreActualizado(nombre));
    }

    public void actualizarEstado(Enum estado) {
        Objects.requireNonNull(estado);
        appendChange(new EstadoActualizado(estado));
    }

    public void actualizarDescripcionMascota(ConsultaMedicaId consultaMedicaId, Decripcion descripcion){
        Objects.requireNonNull(descripcion);
        appendChange(new DescripcionMascotaActualizada(consultaMedicaId, descripcion));
    }

    public void actualizarDescripcionConsultaMedica(ConsultaMedicaId consultaMedicaId, Decripcion descripcionConsulta){
        Objects.requireNonNull(descripcionConsulta);
        appendChange(new DescripcionConsultaActualizada(consultaMedicaId,descripcionConsulta)).apply();
    }

    public void actualizarDiagnosticoConsultaMedica(ConsultaMedicaId consultaMedicaId, Diagonostico diagnostico){
        Objects.requireNonNull(diagnostico);
        appendChange(new DiagnosticoConsultaMedicaActualizado(consultaMedicaId,diagnostico)).apply();
    }

    public void actualizarFechaConsultaMedica(ConsultaMedicaId consultaMedicaId, Fecha fecha ){
        appendChange(new FechaConsultaMedicaActualizada(consultaMedicaId,fecha)).apply();
    }

    public Optional<ConsultaMedica> getConsultaMedica(ConsultaMedicaId consultaMedicaId) {
        return ConsultasMedicas().stream().filter(consulta -> consulta.identity().equals(consultaMedicaId)).findFirst();

    }

    public Set<ConsultaMedica> ConsultasMedicas() {
        return consultasMedicas;
    }


}
