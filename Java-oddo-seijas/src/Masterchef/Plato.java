package Masterchef;

import java.util.HashMap;

public class Plato {
    private String nombre;
    private int tiempoPreparacion;
    private HashMap<Ingredientes, Integer> requisitoIngredientes;
    private PlatoTipo tipo;

    public Plato(String nombre, int tiempoPreparacion, HashMap<Ingredientes, Integer> requisitoIngredientes, PlatoTipo tipo) {
        this.nombre = nombre;
        this.tiempoPreparacion = tiempoPreparacion;
        this.requisitoIngredientes = requisitoIngredientes;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setTiempoPreparacion(int tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

    public HashMap<Ingredientes, Integer> getRequisitoIngredientes() {
        return requisitoIngredientes;
    }

    public void setRequisitoIngredientes(HashMap<Ingredientes, Integer> requisitoIngredientes) {
        this.requisitoIngredientes = requisitoIngredientes;
    }

    public PlatoTipo getTipo() {
        return tipo;
    }

    public void setTipo(PlatoTipo tipo) {
        this.tipo = tipo;
    }
}
