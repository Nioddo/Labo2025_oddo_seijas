package Poblacion_sistema;

import java.util.HashSet;

public class Pais extends Lugar {

    private HashSet<Provincia> provincias;

    public Pais(String nombre, int codigo, HashSet<Coordenada> cordenadas, HashSet<Provincia> provincias) {
        super(nombre, codigo, cordenadas);
        this.provincias = provincias;
    }

    public HashSet<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(HashSet<Provincia> provincias) {
        this.provincias = provincias;
    }

    @Override
    public void agregar(Lugar lnew) {
        if (lnew instanceof Provincia) {
            provincias.add((Provincia) lnew);
        } else {
            System.out.println("Error: A un País solo se le pueden agregar Provincias.");
        }
    }

    @Override
    public void borrar(Lugar lnew) {
        if (lnew instanceof Provincia) {
            provincias.remove((Provincia) lnew);
        } else {
            System.out.println("Error: De un País solo se pueden borrar Provincias.");
        }
    }

    @Override
    public void modificar(Lugar lnew, Lugar lold) {
        if (lnew instanceof Provincia && lold instanceof Provincia) {
            provincias.remove((Provincia) lold);
            provincias.add((Provincia) lnew);
        } else {
            System.out.println("Error: En un País solo se pueden modificar Provincias.");
        }
    }

    @Override
    public int calcPoblacion() {
        int total = 0;
        for (Provincia p : provincias) {
            total += p.getCodigo(); // Suma acumulativa
        }
        return total;
    }
}