package Poblacion_sistema;

import java.util.HashMap;
import java.util.HashSet;

public abstract class Lugar {
    private String nombre;
    private int codigo;
    private HashSet<Coordenada>Cordenadas;

    public Lugar(String nombre, int codigo, HashSet<Coordenada> cordenadas) {
        this.nombre = nombre;
        this.codigo = codigo;
        Cordenadas = cordenadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public HashSet<Coordenada> getCordenadas() {
        return Cordenadas;
    }

    public void setCordenadas(HashSet<Coordenada> cordenadas) {
        Cordenadas = cordenadas;
    }

    public abstract void agregar(Lugar lnew);
    public abstract void borrar(Lugar lnew);
    public abstract void modificar(Lugar lnew,Lugar lold);
    public abstract int calcPoblacion();
}
