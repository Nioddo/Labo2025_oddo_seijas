package PrestamosVirtuales;

import Personas.PersonaUse;

public class Revista extends Publicacion{
private String nombreDistribuidora;

    public Revista(String titulo, PersonaUse autor, int año, String nombreDistribuidora) {
        super(titulo, autor, año);
        this.nombreDistribuidora = nombreDistribuidora;
    }

    public String getNombreDistribuidora() {
        return nombreDistribuidora;
    }

    public void setNombreDistribuidora(String nombreDistribuidora) {
        this.nombreDistribuidora = nombreDistribuidora;
    }
}
