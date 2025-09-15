package biblioteca_virtual;

import Personas.PersonaUseAbs;

import java.time.LocalDate;
import java.util.HashSet;

public class Autores extends PersonaUseAbs {
    private int dni;
    private HashSet<Libro> libros;

    public Autores(String nombre, String apellido, LocalDate nacimiento, int edad, int dni, HashSet<Libro> libros) {
        super(nombre, apellido, nacimiento, edad);
        this.dni = dni;
        this.libros = libros;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public HashSet<Libro> getLibros() {
        return libros;
    }

    public void setLibros(HashSet<Libro> libros) {
        this.libros = libros;
    }
}
