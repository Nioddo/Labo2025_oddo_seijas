package Masterchef;

import Personas.PersonaUseAbs;

import java.time.LocalDate;

public abstract class Participantes extends PersonaUseAbs {
    private String localidad;
    private Equipos equipo;

    public Participantes(String nombre, String apellido, LocalDate nacimiento, int edad, String localidad, Equipos equipo) {
        super(nombre, apellido, nacimiento, edad);
        this.localidad = localidad;
        this.equipo = equipo;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Equipos getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipos equipo) {
        this.equipo = equipo;
    }

    public abstract void prepararLugarTrabajo();


}