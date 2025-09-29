package PrestamosVirtuales;

import Personas.PersonaUse;

import java.time.LocalDate;

public abstract class Publicacion {
    private String titulo;
    private PersonaUse autor;
    private int año;

    public Publicacion(String titulo, PersonaUse autor, int año) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public PersonaUse getAutor() {
        return autor;
    }

    public void setAutor(PersonaUse autor) {
        this.autor = autor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
}
