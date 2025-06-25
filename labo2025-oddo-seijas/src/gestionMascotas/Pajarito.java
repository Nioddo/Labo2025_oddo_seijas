package gestionMascotas;

public class Pajarito extends Mascota{
    private static String saludo="pio";


    public Pajarito(String nombre, String tipo, Dueño dueño) {
        super(nombre, tipo, dueño);
    }

    public static String getSaludo() {
        return saludo;
    }

    public static void setSaludo(String saludo) {
        Pajarito.saludo = saludo;
    }
}
