package control_altura_peso;

import java.time.LocalDate;

public class RegistroMedida {
    private int pesoKg;
    private int alturaCm;

    public RegistroMedida(int pesoKg, int alturaCm) {
        this.pesoKg = pesoKg;
        this.alturaCm = alturaCm;
    }

    public int getPesoKg() {
        return pesoKg;
    }

    public int getAlturaCm() {
        return alturaCm;
    }
}