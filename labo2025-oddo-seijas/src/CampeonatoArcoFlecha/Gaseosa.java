package CampeonatoArcoFlecha;

import java.util.HashSet;

public class Gaseosa extends Beneficios implements Acumulables{
    private HashSet<String> gaseosas;

    public Gaseosa(String nombre, String creador, HashSet<String> gaseosas) {
        super(nombre, creador);
        this.gaseosas = gaseosas;
    }

    public HashSet<String> getGaseosas() {
        return gaseosas;
    }

    public void setGaseosas(HashSet<String> gaseosas) {
        this.gaseosas = gaseosas;
    }

    @Override
    public Double aplicarDescuentoExtra() {
        return 1000.0;
    }
}
