package repaso;


import SistemaDeAlmuerzos.Persona;

import java.util.ArrayList;

public class Pelicula {
    private String nombre;
    private String genero;
    private float duracion;
    private ArrayList<Persona> directors;
    private ArrayList<Persona> actors;

    public Pelicula(){
        this.nombre = "Black mirror";
        this.genero = "sci-futurista";
        this.duracion = 0;
        this.directors = new ArrayList<>();
        this.actors = new ArrayList<>();

        directors.add(new Persona("Charlie"," Brooker",13));
        directors.add(new Persona("Jesse ","Armstrong",11));

        actors.add(new Persona("Jesse ","Plemons",44));
        actors.add(new Persona("Hayley"," Atwell", 44));
    }

public Pelicula(String nombre, String genero, float duracion, ArrayList<Persona> directors, ArrayList<Persona> actors){
this.nombre = nombre;
this.genero= genero;
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

public String getGenero(){
    return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;

    }


    public float getDuracion(){
    return duracion;
    }
    public void setDuracion(float duracion){
        this.duracion = duracion;

    }

    public ArrayList<Persona> getDirectors(){
    return directors;
    }
    public void setDirectors(ArrayList<Persona> directors){
        this.directors = directors;

    }

    public ArrayList<Persona> getActors(){
    return actors;
    }
    public void setActors(ArrayList<Persona> actors){
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
