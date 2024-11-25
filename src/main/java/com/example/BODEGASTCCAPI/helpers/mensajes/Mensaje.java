package com.example.BODEGASTCCAPI.helpers.mensajes;

public enum Mensaje {

    PESO_NEGATIVO("El peso no puede ser negativo"),

    VOLUMEN_NEGATIVO("El volumen no puede ser negativo"),

    FECHA_INVALIDA("Revisa la fecha ingresada"),

    DEPARTAMENTO_INVALIDO("Eso no es un departamento mi fai"),

    METODO_PAGO_INVALIDO("Solo nequi o bancolombia mi so"),

    NOMBRE_INVALIDO("no lo bautizaron o que mi so?")








    ;

    private String mensaje;

    Mensaje() {
    }

    Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

}
