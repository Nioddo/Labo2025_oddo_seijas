package SistemaDeAlmuerzos;

public class Plato {
    private String nombre;
    private double precio;
    private int cantPedido=0;

    public Plato(int cantPedido) {
        this.cantPedido = cantPedido;
        this.nombre = "Pastel de papa";
        this.precio = 5000.0;
    }
    public Plato(String nombre, double precio, int cantPedido) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantPedido = cantPedido;
    }

    public int getCantPedido() {
        return cantPedido;
    }

    public void setCantPedido(int cantPedido) {
        this.cantPedido = cantPedido;
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
    public void addCant (){
        cantPedido=cantPedido+1;
    }
}
