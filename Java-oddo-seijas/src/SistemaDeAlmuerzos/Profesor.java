package SistemaDeAlmuerzos;

public class Profesor extends Persona {
    private  static double descuentoPorcentaje=5.0;

    public Profesor() {
        super();
    }

    public Profesor(double descuentoPorcentaje, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.descuentoPorcentaje = descuentoPorcentaje;
    }

    public double getDescuentoPorcentaje() {
        return descuentoPorcentaje;
    }

    public void setDescuentoPorcentaje(double descuentoPorcentaje) {
        this.descuentoPorcentaje = descuentoPorcentaje;
    }
}
