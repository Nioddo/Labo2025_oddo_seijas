package curling;

public class Jugador {
    private String nombre;
    private String fechaNacimiento;
    private int numeroCamiseta;
    private boolean esCapitan;

    public Jugador(String nombre, String fechaNacimiento, int numeroCamiseta, boolean esCapitan) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroCamiseta = numeroCamiseta;
        this.esCapitan = esCapitan;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public boolean esCapitan() {
        return esCapitan;
    }
}
