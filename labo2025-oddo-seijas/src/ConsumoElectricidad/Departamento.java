package ConsumoElectricidad;

import java.util.HashMap;

public class Departamento extends Vivienda {
    private int ambientes;
    static int calc=100;


    public Departamento(String direccion, int postal, Dueño duenio, HashMap<Integer, HashMap<Meses, Double>> KWhpAño, int ambientes) {
        super(direccion, postal, duenio, KWhpAño);
        this.ambientes = ambientes;
    }

    public int getAmbientes() {
        return ambientes;
    }

    public void setAmbientes(int ambientes) {
        this.ambientes = ambientes;
    }

    public static int getCalc() {
        return calc;
    }

    public static void setCalc(int calc) {
        Departamento.calc = calc;
    }

    @Override
    int dameVlor(){
        return calc;
    }

}

