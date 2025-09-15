package flotadevehiculos;

public class Auto extends Vehiculo {
    private String patente;
    private boolean descapotable;

    public Auto(String marca, String modelo, String color, int cantruedas, int aniofabricacion, String patente, boolean descapotable) {
        super(marca, modelo, color, cantruedas, aniofabricacion);
        this.patente = patente;
        this.descapotable = descapotable;
    }

    public Auto(String patente, boolean descapotable) {
        super();
        this.patente = patente;
        this.descapotable = descapotable;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public boolean getDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }
}