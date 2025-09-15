package flotadevehiculos;

public class Camioneta extends Vehiculo {
    private String patente;
    private int capacidadkg;

    public Camioneta(String patente, int capacidadkg) {
        super();
        this.patente = patente;
        this.capacidadkg = capacidadkg;
    }

    public Camioneta(String marca, String modelo, String color, int cantruedas, int aniofabricacion, String patente, int capacidadkg) {
        super(marca, modelo, color, cantruedas, aniofabricacion);
        this.patente = patente;
        this.capacidadkg = capacidadkg;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCapacidadkg() {
        return capacidadkg;
    }

    public void setCapacidadkg(int capacidadkg) {
        this.capacidadkg = capacidadkg;
    }
    public void agregarcarga(int peso){
            if (peso<capacidadkg){
                    capacidadkg=peso;
            }

    }
}
