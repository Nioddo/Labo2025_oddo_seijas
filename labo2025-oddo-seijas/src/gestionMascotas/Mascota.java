package gestionMascotas;

public abstract class Mascota {
    private String nombre;
    private String tipo;
    private Dueño dueño;

    public Mascota(String nombre, String tipo, Dueño dueño) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.dueño = dueño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }
}
