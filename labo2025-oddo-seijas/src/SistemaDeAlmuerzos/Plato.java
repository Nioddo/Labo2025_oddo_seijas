package SistemaDeAlmuerzos;

public class Plato {
    private String nombre;
    private double precio;

    public Plato() {
        this.nombre = "Pastel de papa";
        this.precio = 5000.0;
    }
    public Plato(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
