package CampeonatoArcoFlecha;

import java.util.HashSet;

public class Sistema {
    private HashSet<Bar> bares;
    HashSet<Diana> dianas;
    private HashSet<Beneficios> beneficios;


    public Diana dianaConMasPuntajes() {
        Diana mayor = null;
        int maxPuntajes = -1;

        for (Diana d : dianas) {
            int cantidad = d.getPuntajes().size();
            if (cantidad > maxPuntajes) {
                maxPuntajes = cantidad;
                mayor = d;
            }
        }

        return mayor;
    }

}
