package SitioWeb;

public class Impresora extends Salida{
    private String metodoImpresion;

    public Impresora(String fabricante, String modelo, double precio, int stock, String puerto, String metodoImpresion) {
        super(fabricante, modelo, precio, stock, puerto);
        this.metodoImpresion = metodoImpresion;
    }

    public String getMetodoImpresion() {
        return metodoImpresion;
    }

    public void setMetodoImpresion(String metodoImpresion) {
        this.metodoImpresion = metodoImpresion;
    }
}
