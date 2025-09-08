package Poblacion_sistema;

import java.util.HashSet;

public class Provincia extends Lugar {
    private HashSet<Ciudad> ciudades;

    public Provincia(String nombre, int codigo, HashSet<Coordenada> cordenadas, HashSet<Ciudad> ciudades) {
        super(nombre, codigo, cordenadas);
        this.ciudades = ciudades;
    }

    public HashSet<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(HashSet<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    @Override
    public void agregar(Lugar lnew) {
        if (lnew instanceof Ciudad) {
            ciudades.add((Ciudad) lnew);
        } else {
            System.out.println("Error: A una Provincia solo se le pueden agregar Ciudades.");
        }
    }

    @Override
    public void borrar(Lugar lnew) {
        if (lnew instanceof Ciudad) {
            ciudades.remove((Ciudad) lnew);
        } else {
            System.out.println("Error: De una Provincia solo se pueden borrar Ciudades.");
        }
    }

    @Override
    public void modificar(Lugar lnew, Lugar lold) {
        if (lnew instanceof Ciudad && lold instanceof Ciudad) {
            ciudades.remove((Ciudad) lold);
            ciudades.add((Ciudad) lnew);
        } else {
            System.out.println("Error: En una Provincia solo se pueden modificar Ciudades.");
        }
    }

    @Override
    public int calcPoblacion() {
        int total = 0;
        for (Ciudad c : ciudades) {
            total += c.calcPoblacion(); // Suma acumulativa
        }
        return total;
    }
}