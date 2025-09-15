package SitioWeb;

public class Compra {
    private String nombre;
    private String apellido;
    private double celular;
    private Pago usoTarjeta;

    public Compra(String nombre, String apellido, double celular, Pago usoTarjeta) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.usoTarjeta = usoTarjeta;
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

    public double getCelular() {
        return celular;
    }

    public void setCelular(double celular) {
        this.celular = celular;
    }

    public Pago isUsoTarjeta() {
        return usoTarjeta;
    }

    public void setUsoTarjeta(Pago usoTarjeta) {
        this.usoTarjeta = usoTarjeta;
    }


}
