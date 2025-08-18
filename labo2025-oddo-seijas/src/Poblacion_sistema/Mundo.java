package Poblacion_sistema;

import Poblacion_sistema.Continente;

import java.util.HashMap;
import java.util.HashSet;

class Mundo {
    private HashMap<String, Lugar> lugares = new HashMap<>();
    private HashSet<Continente> continentes = new HashSet<>();


    public void altaLugar(Lugar lugar) {
        lugares.put(lugar.getCodigo(), lugar);
        if (lugar instanceof Continente) {
            continentes.add((Continente) lugar);
        }
    }

    public void bajaLugar(String codigo) {
        Lugar l = lugares.remove(codigo);
        if (l instanceof Continente) {
            continentes.remove(l);
        }
    }

    public Lugar buscarLugar(String codigo) {
        return lugares.get(codigo);
    }

    public Pais paisConMasPoblacion() {
        Pais max = null;
        for (Lugar l : lugares.values()) {
            if (l instanceof Pais) {
                if (max == null || l.getPoblacion() > max.getPoblacion()) {
                    max = (Pais) l;
                }
            }
        }
        return max;
    }

    public Pais paisConMenosPoblacion() {
        Pais min = null;
        for (Lugar l : lugares.values()) {
            if (l instanceof Pais) {
                if (min == null || l.getPoblacion() < min.getPoblacion()) {
                    min = (Pais) l;
                }
            }
        }
        return min;
    }

    public Continente continenteConMasPoblacion() {
        Continente max = null;
        for (Continente c : continentes) {
            if (max == null || c.getPoblacion() > max.getPoblacion()) {
                max = c;
            }
        }
        return max;
    }

    public Continente continenteConMenosPoblacion() {
        Continente min = null;
        for (Continente c : continentes) {
            if (min == null || c.getPoblacion() < min.getPoblacion()) {
                min = c;
            }
        }
        return min;
    }
}
