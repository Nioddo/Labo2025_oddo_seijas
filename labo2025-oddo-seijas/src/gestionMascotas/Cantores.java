package gestionMascotas;

public class Cantores extends  Mascota{
    private String saludo;

    public Cantores(String nombre, String tipo, Dueño dueño, String saludo) {
        super(nombre, tipo, dueño);
        this.saludo = saludo;
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }
}
