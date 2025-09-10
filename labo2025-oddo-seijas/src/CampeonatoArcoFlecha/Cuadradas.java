package CampeonatoArcoFlecha;

import enums.Dificultad;

import java.util.HashMap;

public class Cuadradas extends Diana {
    private int lado;

    public Cuadradas(String nombre, Dificultad nivel, HashMap<Integer, ColoresDiana> puntajes, int lado) {
        super(nombre, nivel, puntajes);
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcArea() {
        return lado*lado;
    }
}
