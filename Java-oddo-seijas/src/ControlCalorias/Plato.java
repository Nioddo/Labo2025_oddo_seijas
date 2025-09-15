package ControlCalorias;

import java.util.HashSet;
import java.util.Map;

public class Plato {
    private String nombre;
    private HashSet<Ingrediente> ingredientes;

    public Plato(String nombre, HashSet<Ingrediente> ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(HashSet<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double cantCalorias(){
        int s=0;
        for(Ingrediente cal : ingredientes){
            s+=cal.getCalorias();
        }
        return s;
    }
}
