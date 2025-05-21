package SistemaDeAlmuerzos;

public class Profesor extends Persona {
    private double descuentoPorcentaje;

    public Profesor() {
        super();
        this.descuentoPorcentaje = 5.0;
    }

    public Profesor(double descuentoPorcentaje, String nombre, String apellido) {
        super(nombre, apellido);
        this.descuentoPorcentaje = descuentoPorcentaje;
    }

    public double getDescuentoPorcentaje() {
        return descuentoPorcentaje;
    }

    public void setDescuentoPorcentaje(double descuentoPorcentaje) {
        this.descuentoPorcentaje = descuentoPorcentaje;
    }
}
