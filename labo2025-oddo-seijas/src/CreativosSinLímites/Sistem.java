package CreativosSinLímites;

import java.util.HashMap;

public class Sistem {
    private static HashMap<Tipo, Double> comisiones = Sistem.comisionesCreacion();

    public static HashMap<Tipo, Double> getComisiones() {
        return comisiones;
    }

    public static void setComisiones(HashMap<Tipo, Double> comisiones) {
        Sistem.comisiones = comisiones;
    }

    public static HashMap<Tipo, Double> comisionesCreacion(){
        HashMap<Tipo,Double> comisiones = new HashMap<Tipo,Double>();
        comisiones.put(Tipo.UI,7.0);
        comisiones.put(Tipo.UX,8.0);
        comisiones.put(Tipo.IT,12.0);
        return comisiones;

    }
    public static double calcComison(Tipo tipe,Proyecto p){
        return p.getPrecio() + (p.getPrecio()*Sistem.comisiones.get(tipe)/100);
    }

}
