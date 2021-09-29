package com.implemetacionDDD.modeladotactico.entity.usuario.value;

import co.com.sofka.domain.generic.ValueObject;

public class Identificacion implements ValueObject<Identificacion.Props> {

    enum TipoDocumento
    {
        CC, CE, PASAPORTE;
    }

    private final String numero;
    private final TipoDocumento tipoDocumento;

    public Identificacion(String numero, TipoDocumento tipoDocumento) {
        this.numero = numero;
        this.tipoDocumento = tipoDocumento;
    }

    public Props value() {
        return new Props() {
            @Override
            public String numero() {
                return numero;
            }
            @Override
            public TipoDocumento tipoDocumento() {
                return tipoDocumento;
            }
        };
    }

    public interface Props{
        String numero();
        TipoDocumento tipoDocumento();
    }
}
