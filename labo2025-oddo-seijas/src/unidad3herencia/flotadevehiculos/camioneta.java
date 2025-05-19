package unidad3herencia.flotadevehiculos;

import unidad1.Coche;

public class camioneta extends vehiculo {
    private String patente;
    private int capacidadkg;

    public camioneta(String patente, int capacidadkg) {
        super();
        this.patente = patente;
        this.capacidadkg = capacidadkg;
    }

    public camioneta(String marca, String modelo, String color, int cantruedas, int aniofabricacion, String patente, int capacidadkg) {
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
