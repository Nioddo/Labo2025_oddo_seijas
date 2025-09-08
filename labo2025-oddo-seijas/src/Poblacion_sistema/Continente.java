package Poblacion_sistema;

import java.util.HashSet;

public class Continente extends Lugar{
    HashSet<Pais> paises;

    public Continente(String nombre, int codigo, HashSet<Coordenada> cordenadas, HashSet<Pais> paises) {
        super(nombre, codigo, cordenadas);
        this.paises = paises;
    }

    public HashSet<Pais> getPaises() {
        return paises;
    }

    public void setPaises(HashSet<Pais> paises) {
        this.paises = paises;
    }

    @Override
    public void agregar(Lugar lnew) {
        paises.add((Pais)lnew);
    }

    @Override
    public void borrar(Lugar lnew) {
        paises.remove((Lugar)lnew);
    }

    @Override
    public void modificar(Lugar lnew, Lugar lold) {
        paises.remove((Pais)lold);
        paises.add((Pais) lnew);
    }

    @Override
    public int calcPoblacion() {
        int total=0;
        for(Pais p:paises){
            total=p.calcPoblacion();
        }
        return total;
    }
}
