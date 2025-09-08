package eleccionesOktubre;

public abstract class Dispositivo {
    private int numeroSerie;
    private String modelo;
    private String fabricante;
    private Boolean estado;

    public Dispositivo(int numeroSerie, String modelo, String fabricante, Boolean estado) {
        this.numeroSerie = numeroSerie;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.estado = estado;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
