package CampeonatoArcoFlecha;

import java.util.HashSet;

public class Comida extends Beneficios implements Acumulables{
    private HashSet<String> comidas;

    public Comida(String nombre, String creador, HashSet<String> comidas) {
        super(nombre, creador);
        this.comidas = comidas;
    }

    public HashSet<String> getComidas() {
        return comidas;
    }

    public void setComidas(HashSet<String> comidas) {
        this.comidas = comidas;
    }

    @Override
    public Double aplicarDescuentoExtra() {
        return 4500.0;

    }
}
