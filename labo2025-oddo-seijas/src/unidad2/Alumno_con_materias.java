package unidad2;

import unidad1.Cancion;

import java.util.ArrayList;

public class Alumno_con_materias {
    private ArrayList<String> contenidos;
    private ArrayList<Alumno> alumnos;
    String nombre;

    public Alumno_con_materias(){
        ArrayList<Double> notas = new ArrayList<>();
        notas.add(10d);
        contenidos.add(new String("Fracciones"));
        alumnos.add(new Alumno("juan", "seijas","12/12/12",notas));
        this.nombre = "matematica";
    }
    public Alumno_con_materias(ArrayList<String> contenidos, ArrayList<Alumno> alumnos, String nombre){
        this.contenidos = new ArrayList<String>();
        this.alumnos = new ArrayList<Alumno>();
        this.nombre = nombre;
    }

    public ArrayList<String> getContenidos() {
        return contenidos;
    }
    public void setCanciones(ArrayList<String> contenidos) {
        this.contenidos = contenidos;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }
    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public static void agregarMateria(String nombre,  ){


    }

}
