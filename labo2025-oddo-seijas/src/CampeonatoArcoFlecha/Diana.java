package CampeonatoArcoFlecha;

import enums.Color;
import enums.Dificultad;

import java.util.HashMap;

public abstract class Diana {
    private String nombre;
    private Dificultad nivel;
    private HashMap<Integer,ColoresDiana> puntajes;

    public Diana(String nombre, Dificultad nivel, HashMap<Integer, ColoresDiana> puntajes) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntajes = puntajes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Dificultad getNivel() {
        return nivel;
    }

    public void setNivel(Dificultad nivel) {
        this.nivel = nivel;
    }

    public HashMap<Integer, ColoresDiana> getPuntajes() {
        return puntajes;
    }

    public void setPuntajes(HashMap<Integer, ColoresDiana> puntajes) {
        this.puntajes = puntajes;
    }

    public abstract double calcArea();
}
