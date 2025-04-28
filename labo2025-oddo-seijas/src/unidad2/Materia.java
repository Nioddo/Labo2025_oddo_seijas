package unidad2;

import java.util.ArrayList;
import java.util.ArrayList;

public class Materia {
    private String nombre;
    private ArrayList<String> listaDeContenidos;
    private ArrayList<Alumno> alumnosInscriptos;


    public Materia(String nombre) {
        this.nombre = nombre;
        this.listaDeContenidos = new ArrayList<>();
        this.alumnosInscriptos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getListaDeContenidos() {
        return listaDeContenidos;
    }

    public void setListaDeContenidos(ArrayList<String> listaDeContenidos) {
        this.listaDeContenidos = listaDeContenidos;
    }

    public ArrayList<Alumno> getAlumnosInscriptos() {
        return alumnosInscriptos;
    }

    public void setAlumnosInscriptos(ArrayList<Alumno> alumnosInscriptos) {
        this.alumnosInscriptos = alumnosInscriptos;
    }

    public void agregarContenido(String contenido) {
        listaDeContenidos.add(contenido);
    }

    public void inscribirAlumno(Alumno alumno) {
        alumnosInscriptos.add(alumno);
    }
}
