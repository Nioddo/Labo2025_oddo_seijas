package TiendaProductosElectronicos;

public class EquipoSonido extends Producto {
private boolean bluethoot;
static Seccion seccion=Seccion.MULTIMEDIA;

    public EquipoSonido(String nombre, double precio, int stock, boolean bluethoot) {
        super(nombre, precio, stock);
        this.bluethoot = bluethoot;
    }

    public boolean isBluethoot() {
        return bluethoot;
    }

    public void setBluethoot(boolean bluethoot) {
        this.bluethoot = bluethoot;
    }

    public static Seccion getSeccion() {
        return seccion;
    }

    public static void setSeccion(Seccion seccion) {
        EquipoSonido.seccion = seccion;
    }
}
