package Poblacion_sistema;

import java.util.HashSet;

public class Barrio extends Lugar {
    private int poblacion;

    public Barrio(String nombre, int codigo, HashSet<Coordenada> cordenadas, int poblacion) {
        super(nombre, codigo, cordenadas);
        this.poblacion = poblacion;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public void agregar(Lugar lnew) {

    }

    @Override
    public void borrar(Lugar lnew) {

    }

    @Override
    public void modificar(Lugar lnew,Lugar lold) {

    }

    @Override
    public int calcPoblacion() {
        return poblacion;
    }
}
