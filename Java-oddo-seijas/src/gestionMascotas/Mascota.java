package gestionMascotas;

public abstract class Mascota {
    private String nombre;
    private String tipo;
    private Dueño dueño;
    private int alegria;

    public Mascota(String nombre, String tipo, Dueño dueño, int alegria) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.dueño = dueño;
        this.alegria = alegria;
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

    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }
    public abstract void saludar(Dueño d, Mascota m);

    public void alimentar(){
        alegria=+1;
    }
}
