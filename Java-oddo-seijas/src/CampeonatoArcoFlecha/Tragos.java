package CampeonatoArcoFlecha;

import java.util.HashSet;

public class Tragos extends Beneficios{
    private HashSet<String> tragos;

    public Tragos(String nombre, String creador, HashSet<String> tragos) {
        super(nombre, creador);
        this.tragos = tragos;
    }

    public HashSet<String> getTragos() {
        return tragos;
    }

    public void setTragos(HashSet<String> tragos) {
        this.tragos = tragos;
    }
}
