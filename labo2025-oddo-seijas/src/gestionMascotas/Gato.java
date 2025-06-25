package gestionMascotas;

public class Gato extends Mascota {
    private static String saludo="miau";

    public Gato(String nombre, String tipo, Dueño dueño) {
        super(nombre, tipo, dueño);
    }

    public static String getSaludo() {
        return saludo;
    }

    public static void setSaludo(String saludo) {
        Gato.saludo = saludo;
    }
}
