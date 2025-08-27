package ConsumoElectricidad;

import java.util.HashMap;

public class Departamento extends Vivienda{
    private int ambientes;

    public Departamento(String direccion, int postal, Dueño duenio, HashMap<Integer, HashMap<Meses, Integer>> KWhpAño, int ambientes) {
        super(direccion, postal, duenio, KWhpAño);
        this.ambientes = ambientes;
    }

    public int getAmbientes() {
        return ambientes;
    }

    public void setAmbientes(int ambientes) {
        this.ambientes = ambientes;
    }

    @Override
    void agregarConsumo (){

    }
}
