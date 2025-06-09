package TiendaProductosElectronicos;

public class Pantallas extends Producto{
private Resolucion resolucion;
static Seccion seccion=Seccion.VIDEO;

    public Pantallas(String nombre, double precio, int stock, Resolucion resolucion) {
        super(nombre, precio, stock);
        this.resolucion = resolucion;
    }

    public Resolucion getResolucion() {
        return resolucion;
    }

    public void setResolucion(Resolucion resolucion) {
        this.resolucion = resolucion;
    }

    public static Seccion getSeccion() {
        return seccion;
    }

    public static void setSeccion(Seccion seccion) {
        Pantallas.seccion = seccion;
    }
}
