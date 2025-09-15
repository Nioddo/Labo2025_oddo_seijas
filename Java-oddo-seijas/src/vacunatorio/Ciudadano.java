package vacunatorio;

import java.util.HashSet;

public class Ciudadano {
    private int dni;
    private String nombre;
    private String apellido;
    private Provincia provincia;
    private HashSet<Vacuna>historialVacunas;

    public Ciudadano(int dni, String nombre, String apellido, Provincia provincia) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.provincia = provincia;
        this.historialVacunas = historialVacunas;
    }


    public HashSet<Vacuna> getHistorialVacunas() {
        return historialVacunas;
    }

    public void setHistorialVacunas(HashSet<Vacuna> historialVacunas) {
        this.historialVacunas = historialVacunas;
    }

    public Ciudadano(int dni) {
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " (DNI: " + dni + ")";
    }
}

