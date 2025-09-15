package EditorialesValidas;

import SistemaDeAlmuerzos.Persona;

import java.time.LocalDate;

public class Libro {
    private String titulo;
    private SistemaDeAlmuerzos.Persona autor;
    private int isbn;
    private Editorial editorial;
    private LocalDate fechapublicacion;


    public Libro(String titulo, Persona autor, int isbn, Editorial editorial, LocalDate fechapublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.editorial = editorial;
        this.fechapublicacion = fechapublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public LocalDate getFechapublicacion() {
        return fechapublicacion;
    }

    public void setFechapublicacion(LocalDate fechapublicacion) {
        this.fechapublicacion = fechapublicacion;
    }
}
