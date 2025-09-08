package eleccionesOktubre;

import java.time.LocalTime;

public class HorarioLaboral {
    private LocalTime entrada;
    private LocalTime salida;

    public HorarioLaboral(LocalTime entrada, LocalTime salida) {
        this.entrada = entrada;
        this.salida = salida;
    }

    public LocalTime getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalTime entrada) {
        this.entrada = entrada;
    }

    public LocalTime getSalida() {
        return salida;
    }

    public void setSalida(LocalTime salida) {
        this.salida = salida;
    }

    public Boolean estaLaburando(LocalTime hora){
    return (!hora.isBefore(entrada) && !hora.isAfter(salida));
}
}
