package Poblacion_sistema;

import java.util.HashSet;

public class Ciudad extends Lugar{
    private HashSet<Barrio> barrios;

    public Ciudad(String nombre, int codigo, HashSet<Coordenada> cordenadas, HashSet<Barrio> barrios) {
        super(nombre, codigo, cordenadas);
        this.barrios = barrios;
    }

    public HashSet<Barrio> getBarrios() {
        return barrios;
    }

    public void setBarrios(HashSet<Barrio> barrios) {
        this.barrios = barrios;
    }

    @Override
    public void agregar(Lugar lnew) {
        if(lnew instanceof Barrio) {
            barrios.add((Barrio) lnew);
        }
        else{
            System.out.println("no es un barrio");
        }
    }

    @Override
    public void borrar(Lugar lnew) {
        if(lnew instanceof Barrio) {
            barrios.remove((Barrio) lnew);
        }
        else{
            System.out.println("no es un barrio");
        }
    }

    @Override
    public void modificar(Lugar lnew,Lugar lold) {

        if(lnew instanceof Barrio && lold instanceof Barrio) {
            barrios.add((Barrio) lnew);
            barrios.remove((Barrio) lnew);
        }
        else{
            System.out.println("no es un barrio");
        }

    }

    @Override
    public int calcPoblacion() {
        int total=0;
        for (Barrio b : barrios){
            total+=b.calcPoblacion();
        }
        return total;
    }
}
