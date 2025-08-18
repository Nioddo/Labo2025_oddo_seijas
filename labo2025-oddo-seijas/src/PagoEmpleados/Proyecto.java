package PagoEmpleados;

public class Proyecto {
    private String nombre;
    private float sueldo;

    public Proyecto(String nombre, float sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public int hashCode() {
        return nombre.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Proyecto) {
            Proyecto otro = (Proyecto) obj;
            return this.nombre.equalsIgnoreCase(otro.nombre);
        }
        return false;
    }
}
