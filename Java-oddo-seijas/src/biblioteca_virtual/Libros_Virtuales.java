package biblioteca_virtual;

public class Libros_Virtuales extends Libro{
    private static int cantidad_descargas=145;

    public Libros_Virtuales(String nombre, String autor, Genero genero) {
        super(nombre, autor, genero);
    }

    public static int getCantidad_descargas() {
        return cantidad_descargas;
    }

    public static void setCantidad_descargas(int cantidad_descargas) {
        Libros_Virtuales.cantidad_descargas = cantidad_descargas;
    }
}
