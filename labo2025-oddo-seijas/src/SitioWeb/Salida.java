package SitioWeb;

public class Salida extends Componente{
    private String puerto;

    public Salida(String fabricante, String modelo, double precio, int stock, String puerto) {
        super(fabricante, modelo, precio, stock);
        this.puerto = puerto;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }
}
