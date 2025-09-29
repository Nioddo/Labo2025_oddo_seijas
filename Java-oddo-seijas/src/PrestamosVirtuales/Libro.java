package PrestamosVirtuales;

import Personas.PersonaUse;

public class Libro extends Publicacion{
    private Boolean saga;

    public Libro(String titulo, PersonaUse autor, int año, Boolean saga) {
        super(titulo, autor, año);
        this.saga = saga;
    }

    public Boolean getSaga() {
        return saga;
    }

    public void setSaga(Boolean saga) {
        this.saga = saga;
    }
}
