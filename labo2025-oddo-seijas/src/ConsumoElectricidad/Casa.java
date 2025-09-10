package ConsumoElectricidad;

import java.util.HashMap;

public class Casa extends Vivienda{
    private int M2cubiertos;
    private int M2descubiertos;
    private static int calc=50;

    public Casa(String direccion, int postal, Dueño duenio, HashMap<Integer, HashMap<Meses, Double>> KWhpAño, int m2cubiertos, int m2descubiertos) {
        super(direccion, postal, duenio, KWhpAño);
        M2cubiertos = m2cubiertos;
        M2descubiertos = m2descubiertos;
    }

    public int getM2cubiertos() {
        return M2cubiertos;
    }

    public void setM2cubiertos(int m2cubiertos) {
        M2cubiertos = m2cubiertos;
    }

    public int getM2descubiertos() {
        return M2descubiertos;
    }

    public void setM2descubiertos(int m2descubiertos) {
        M2descubiertos = m2descubiertos;
    }

    public static int getCalc() {
        return calc;
    }

    public static void setCalc(int calc) {
        Casa.calc = calc;
    }

    @Override
    int dameVlor(){
        return calc;
    }

}
