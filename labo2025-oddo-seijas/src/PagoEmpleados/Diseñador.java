package PagoEmpleados;

import SistemaDeAlmuerzos.Persona;

import java.util.HashMap;

public class Diseñador extends Persona {

    private TipoDiseñador tipo;
    private HashMap<Proyecto, Float> proyectos;


    public Diseñador(String nombre, String apellido, int edad, TipoDiseñador tipo) {
        super(nombre, apellido, edad);
        this.tipo = tipo;
    }

    public TipoDiseñador getTipo() {
        return tipo;
    }

    public void setTipo(TipoDiseñador tipo) {
        this.tipo = tipo;
    }

    public HashMap<Proyecto, Float> getProyectos() {
        return proyectos;
    }

    public void setProyectos(HashMap<Proyecto, Float> proyectos) {
        this.proyectos = proyectos;
    }

    public void agregarProyecto(Proyecto p, float pago) {
        if (!proyectos.containsKey(p)) {
            proyectos.put(p, pago);
        } else {
            System.out.println("⚠ El proyecto ya fue realizado por este diseñador.");
        }
    }

    public double sueldo() {
        float total = 0;
        for (Float s : proyectos.values()) {
            total += s;
        }
        double porcentaje = CreativosSinLimites.getComision(tipo) / 100.0;
        return total + (total * porcentaje);
    }

    public int cantidadProyectos() {
        return proyectos.size();
    }

    public Float gananciaSinComision(String nombreProyecto) {
        for (Proyecto p : proyectos.keySet()) {
            if (p.getNombre().equalsIgnoreCase(nombreProyecto)) {
                return proyectos.get(p);
            }
        }
        return null; // No encontrado
    }

    public void mostrarDetalleSueldo() {
        String nombre = "";
        System.out.println("Detalle del sueldo de " + nombre );
        double porcentaje = CreativosSinLimites.getComision(tipo) / 100.0;
        for (Proyecto p : proyectos.keySet()) {
            float pago = proyectos.get(p);
            double comision = pago * porcentaje;
            System.out.println("Proyecto: " + p.getNombre() +
                    " | Pago: $" + pago +
                    " | Comisión: $" + String.format("%.2f", comision));
        }
        System.out.println("Total con comisión: $" + String.format("%.2f", sueldo()));
    }
}
