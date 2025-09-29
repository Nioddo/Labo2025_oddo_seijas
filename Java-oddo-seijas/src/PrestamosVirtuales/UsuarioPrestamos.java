package PrestamosVirtuales;

import Personas.PersonaUse;
import Personas.PersonaUseAbs;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class UsuarioPrestamos extends PersonaUseAbs {
    private double creditoGanado;
    private String mail;
    private HashMap<Publicacion,Integer> PrestamoVeces;
    private HashSet<Publicacion> publisVistas;

    public UsuarioPrestamos(String nombre, String apellido, LocalDate nacimiento, int edad, double creditoGanado, String mail, HashMap<Publicacion, Integer> prestamoVeces, HashSet<Publicacion> publisVistas) {
        super(nombre, apellido, nacimiento, edad);
        this.creditoGanado = creditoGanado;
        this.mail = mail;
        PrestamoVeces = prestamoVeces;
        this.publisVistas = publisVistas;
    }

    public double getCreditoGanado() {
        return creditoGanado;
    }

    public void setCreditoGanado(double creditoGanado) {
        this.creditoGanado = creditoGanado;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public HashMap<Publicacion, Integer> getPrestamoVeces() {
        return PrestamoVeces;
    }

    public void setPrestamoVeces(HashMap<Publicacion, Integer> prestamoVeces) {
        PrestamoVeces = prestamoVeces;
    }

    public HashSet<Publicacion> getPublisVistas() {
        return publisVistas;
    }

    public void setPublisVistas(HashSet<Publicacion> publisVistas) {
        this.publisVistas = publisVistas;
    }
}
