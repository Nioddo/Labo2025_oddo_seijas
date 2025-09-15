package SitioWeb;

public class Entrada extends Componente{
    private String tipoConector;
    private String puertos;

    public Entrada(String fabricante, String modelo, double precio, int stock, String tipoConector, String puertos) {
        super(fabricante, modelo, precio, stock);
        this.tipoConector = tipoConector;
        this.puertos = puertos;
    }

    public String getTipoConector() {
        return tipoConector;
    }

    public void setTipoConector(String tipoConector) {
        this.tipoConector = tipoConector;
    }

    public String getPuertos() {
        return puertos;
    }

    public void setPuertos(String puertos) {
        this.puertos = puertos;
    }
}
