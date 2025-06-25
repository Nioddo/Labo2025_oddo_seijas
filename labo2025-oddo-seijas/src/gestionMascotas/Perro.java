package gestionMascotas;

public class Perro extends Mascota {
    private static String saludo="guau";

    public Perro(String nombre, String tipo, Dueño dueño) {
        super(nombre, tipo, dueño);
    }

    public static String getSaludo() {
        return saludo;
    }

    public static void setSaludo(String saludo) {
        Perro.saludo = saludo;
    }
}
