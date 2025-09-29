package PrestamosVirtuales;

import Personas.PersonaUse;

public class AudioLibro extends Publicacion{
private int duracion;
private Double pesoArchivo;

    public AudioLibro(String titulo, PersonaUse autor, int año, int duracion, Double pesoArchivo) {
        super(titulo, autor, año);
        this.duracion = duracion;
        this.pesoArchivo = pesoArchivo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Double getPesoArchivo() {
        return pesoArchivo;
    }

    public void setPesoArchivo(Double pesoArchivo) {
        this.pesoArchivo = pesoArchivo;
    }
}
