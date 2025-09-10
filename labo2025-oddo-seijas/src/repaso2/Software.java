package repaso2;

import java.time.LocalDate;

public class Software {
    private String nombre;
    private boolean parche;
    private LocalDate fecha;

    public Software(String nombre, boolean parche, LocalDate fecha) {
        this.nombre = nombre;
        this.parche = parche;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isParche() {
        return parche;
    }

    public void setParche(boolean parche) {
        this.parche = parche;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
