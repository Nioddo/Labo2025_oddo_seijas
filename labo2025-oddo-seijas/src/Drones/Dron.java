package Drones;

import java.time.LocalDate;

public abstract class Dron {
    private String nombre;
    private LocalDate fechaAdquisicion;
    private int id;
    private Estado estado;
    private int bateria;
    private int contador;
    private static double latitudOrigen=-34.573195;
    private static double longitudOrigen=-58.504111;

    public Dron(String nombre, LocalDate fechaAdquisicion, int id, Estado estado, int bateria, int contador) {
        this.nombre = nombre;
        this.fechaAdquisicion = fechaAdquisicion;
        this.id = id;
        this.estado = estado;
        this.bateria = bateria;
        this.contador = contador;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(LocalDate fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public static double getLatitudOrigen() {
        return latitudOrigen;
    }

    public static void setLatitudOrigen(double latitudOrigen) {
        Dron.latitudOrigen = latitudOrigen;
    }

    public static double getLongitudOrigen() {
        return longitudOrigen;
    }

    public static void setLongitudOrigen(double longitudOrigen) {
        Dron.longitudOrigen = longitudOrigen;
    }

    private void carga(){
        if(bateria<=20){
            bateria=100;
        }
        else {
            bateria+=10;
        }
    }


    abstract boolean evMision(double Latitud, double Longitud);
}
