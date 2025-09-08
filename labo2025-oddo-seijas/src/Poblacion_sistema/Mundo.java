package Poblacion_sistema;

import com.sun.nio.sctp.SctpStandardSocketOptions;

import java.util.HashSet;

public class Mundo extends Lugar {
    HashSet<Continente> continentes;

    public Mundo(String nombre, int codigo, HashSet<Coordenada> cordenadas) {
        super(nombre, codigo, cordenadas);
    }

    public HashSet<Continente> getContinentes() {
        return continentes;
    }

    public void setContinentes(HashSet<Continente> continentes) {
        this.continentes = continentes;
    }

    public Pais pmaspoblado() {
        Pais paisMasPoblado = null;
        int poblacionMaxima = -1;
        for (Continente c : continentes) {
            for (Pais p : c.getPaises()) {
                int poblacionActual = p.calcPoblacion();
                if (poblacionActual > poblacionMaxima) {
                    poblacionMaxima = poblacionActual;
                    paisMasPoblado = p;
                }
            }
        }
        return paisMasPoblado;
    }

    public Pais pmenospoblado() {
        Pais paisMasPoblado = null;
        int poblacionMaxima = Integer.MAX_VALUE;
        for (Continente c : continentes) {
            for (Pais p : c.getPaises()) {
                int poblacionActual = p.calcPoblacion();
                if (poblacionActual < poblacionMaxima) {
                    poblacionMaxima = poblacionActual;
                    paisMasPoblado = p;
                }
            }
        }
        return paisMasPoblado;
    }

    public Continente conmaspoblado() {
        Continente cmas = null;
        int pmax = -1;
        for (Continente c : continentes) {
            if (c.calcPoblacion() > pmax) {
                pmax = c.calcPoblacion();
                cmas = c;
            }
        }
        return cmas;
    }

    public Continente conmenospoblado() {
        Continente cmas = null;
        int pmax = Integer.MAX_VALUE;
        for (Continente c : continentes) {
            if (c.calcPoblacion() < pmax) {
                pmax = c.calcPoblacion();
                cmas = c;
            }
        }
        return cmas;
    }


    @Override
    public void agregar(Lugar lnew) {
        if (lnew instanceof Continente) {
            continentes.add((Continente) lnew);
        } else {
            System.out.println("Error: A un País solo se le pueden agregar continentes.");
        }
    }

    @Override
    public void borrar(Lugar lnew) {
        if (lnew instanceof Continente) {
            continentes.remove((Continente) lnew);
        } else {
            System.out.println("Error: De un País solo se pueden borrar continentes.");
        }
    }

    @Override
    public void modificar(Lugar lnew, Lugar lold) {
        if (lnew instanceof Continente && lold instanceof Continente) {
            continentes.remove((Continente) lold);
            continentes.add((Continente) lnew);
        } else {
            System.out.println("Error: En un País solo se pueden modificar continentes.");
        }
    }

    @Override
    public int calcPoblacion() {
        int total = 0;
        for (Continente p : continentes) {
            total += p.calcPoblacion(); // Suma acumulativa
        }
        return total;
    }


    public static void main(String[] args) {
        Coordenada cord1= new Coordenada(12.0,19.0);
        HashSet<Coordenada> cordenadas1 = new HashSet<>();
        cordenadas1.add(cord1);
        Barrio b= new Barrio("3f",1,cordenadas1,1000);
        System.out.println(b.calcPoblacion());
    }
}
