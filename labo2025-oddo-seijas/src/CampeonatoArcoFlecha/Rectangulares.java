package CampeonatoArcoFlecha;

import enums.Dificultad;

import java.util.HashMap;

public class Rectangulares extends Diana{
    private int altura;
    private int base;

    public Rectangulares(String nombre, Dificultad nivel, HashMap<Integer, ColoresDiana> puntajes, int altura, int base) {
        super(nombre, nivel, puntajes);
        this.altura = altura;
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public double calcArea() {
        return base*altura;
    }
}
