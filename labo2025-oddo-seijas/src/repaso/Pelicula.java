package repaso;


import SistemaDeAlmuerzos.Persona;

import java.util.ArrayList;

public class Pelicula {
    private String nombre;
    private Genero genero;
    private float duracion;
    private ArrayList<Directors> directors;
    private ArrayList<Actors> actors;

    public Pelicula(){
        this.nombre = "Black mirror";
        this.duracion = 0;
        this.directors = new ArrayList<>();
        this.actors = new ArrayList<>();

        directors.add(new Directors("Charlie"," Brooker",13));
        directors.add(new Directors("Jesse ","Armstrong",11));

        actors.add(new Actors("Jesse ","Plemons",44));
        actors.add(new Actors("Hayley"," Atwell", 44));
    }

public Pelicula(String nombre, String genero, float duracion, ArrayList<Directors> directors, ArrayList<Actors> actors){
this.nombre = nombre;
this.duracion =duracion;
this.directors=directors;
this.actors=actors;
}

public String getNombre(){
    return nombre;
}
public void setNombre(String nombre){
    this.nombre = nombre;

}



    public float getDuracion(){
    return duracion;
    }
    public void setDuracion(float duracion){
        this.duracion = duracion;

    }

    public ArrayList<Directors> getDirectors(){
    return directors;
    }
    public void setDirectors(ArrayList<Directors> directors){
        this.directors = directors;

    }

    public ArrayList<Actors> getActors(){
    return actors;
    }
    public void setActors(ArrayList<Actors> actors){
        this.actors = actors;

    }
    public void actoresMayores(ArrayList<Persona> actors){
        for(Persona persona : actors){
            if (persona.getEdad() >= 18) {
                System.out.println(persona.getNombre());
            }
        }
    }



}
