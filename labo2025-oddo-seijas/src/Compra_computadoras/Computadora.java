package Compra_computadoras;

import java.util.ArrayList;

public class Computadora {
    private CPU cpu;
    private ArrayList<Periferico> perifericos;

    public Computadora(CPU cpu, ArrayList<Periferico> perifericos) {
        // Validación de CPU
        if (cpu == null) throw new IllegalArgumentException("Debe incluir una CPU");
        if (cpu.getStock() <= 0) throw new IllegalStateException("No hay stock de la CPU seleccionada");

        boolean tieneEntrada = false;
        boolean tieneSalida = false;

        for (Periferico p : perifericos) {
            if (p.getStock() <= 0) {
                throw new IllegalStateException("No hay stock del componente: " + p.getModelo());
            }
            if (p instanceof Entrada) {
                tieneEntrada = true;
            } else if (p instanceof Salida) {
                tieneSalida = true;
            }
        }

        if (!tieneEntrada){
            throw new IllegalArgumentException("Debe incluir al menos un dispositivo de entrada");
        }
        if (!tieneSalida) {
            throw new IllegalArgumentException("Debe incluir al menos un dispositivo de salida");
        }

        this.cpu = cpu;
        this.perifericos = perifericos;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public ArrayList<Periferico> getPerifericos() {
        return perifericos;
    }

    public void setPerifericos(ArrayList<Periferico> perifericos) {
        this.perifericos = perifericos;
    }

    public double calcularPrecioNeto() {
        double suma = cpu.getPrecio();
        for (Periferico p : perifericos) {
            suma += p.getPrecio();
        }
        return suma;
    }

    public void actualizarStock() {
        cpu.reducirStock(1);
        for (Periferico p : perifericos) p.reducirStock(1);
    }

    public int cantidadDispositivosEntrada() {
        int contador = 0;
        for (Periferico p : perifericos) {
            if (p instanceof Entrada) contador++;
        }
        return contador;
    }

    public int cantidadDispositivosSalida() {
        int contador = 0;
        for (Periferico p : perifericos) {
            if (p instanceof Salida) contador++;
        }
        return contador;
    }
}
