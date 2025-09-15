package TiendaProductosElectronicos;

public class CargadoresPortatiles extends Producto{
    private PotenciaCarga potencia;
    static Seccion seccion = Seccion.COMPUTACION;

    public CargadoresPortatiles(String nombre, double precio, int stock, PotenciaCarga potencia) {
        super(nombre, precio, stock);
        this.potencia = potencia;
    }

    public PotenciaCarga getPotencia() {
        return potencia;
    }

    public void setPotencia(PotenciaCarga potencia) {
        this.potencia = potencia;
    }

    public static Seccion getSeccion() {
        return seccion;
    }

    public static void setSeccion(Seccion seccion) {
        CargadoresPortatiles.seccion = seccion;
    }
}
