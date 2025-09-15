package CampeonatoArcoFlecha;

import enums.Dificultad;

import java.util.HashMap;

public class Circulares extends Diana{
    private static int radio=13;

    public Circulares(String nombre, Dificultad nivel, HashMap<Integer, ColoresDiana> puntajes) {
        super(nombre, nivel, puntajes);
    }

    @Override
    public double calcArea() {
        return Math.PI*radio*radio;
    }

    public static int getRadio() {
        return radio;
    }

    public static void setRadio(int radio) {
        Circulares.radio = radio;
    }

}
