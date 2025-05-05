package repaso;

import java.util.ArrayList;

public class Estanteria {
    private int numero;
    private ArrayList<Pelicula> peliculas;


    public Estanteria() {
        numero = 1;
        peliculas = new ArrayList<>();
    }

    public Estanteria(int numero, ArrayList<Pelicula> peliculas) {
        this.numero = numero;
        this.peliculas = peliculas;
    }

    public int getNumero() {
        return numero;
    }
    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }
    public void setNumero(int numero){
        this.numero=numero;
    }
    public void setPeliculas(ArrayList<Pelicula> peliculas){
        this.peliculas=peliculas;
    }

    public void actoresMayores(){
        for(){

        }
    }


}