package PagoEmpleados;

import java.util.HashMap;

public class CreativosSinLimites {
    private static HashMap<TipoDiseñador, Integer> comision = llenar();

    public static HashMap<TipoDiseñador, Integer> llenar() {
        HashMap<TipoDiseñador, Integer> temp = new HashMap<>();
        temp.put(TipoDiseñador.UX, 8);
        temp.put(TipoDiseñador.UI, 7);
        temp.put(TipoDiseñador.IT, 12);
        return temp;
    }

    public static int getComision(TipoDiseñador tipo) {
        return comision.get(tipo);
    }



}
