package biblioteca_virtual;

import Personas.PersonaUseAbs;

import java.time.LocalDate;

public class Usuario extends PersonaUseAbs {
    private String mail;
    private Membrecias membrecia;

    public Usuario(String nombre, String apellido, LocalDate nacimiento, int edad, String mail, Membrecias membrecia) {
        super(nombre, apellido, nacimiento, edad);
        this.mail = mail;
        this.membrecia = membrecia;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Membrecias getMembrecia() {
        return membrecia;
    }

    public void setMembrecia(Membrecias membrecia) {
        this.membrecia = membrecia;
    }
}
