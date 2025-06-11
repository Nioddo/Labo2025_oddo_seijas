package unidad1;

import java.util.Scanner;

public class Cafetera {
    private static float cantidadMaxima=1000;
    private static float cantidadActual=0;


    public Cafetera(float cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
        this.cantidadActual = cantidadMaxima;
    }

    public Cafetera(float cantidadMaxima, float cantidadActual) {
        this.cantidadMaxima = cantidadMaxima;
        this.cantidadActual = Math.min(cantidadActual, cantidadMaxima);
    }

    public float getMaxima() {
        return cantidadMaxima;
    }

    public float getActual() {
        return cantidadActual;
    }

    public void setCantidadMaxima(float cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }

    public void setCantidadActual(float cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public void llenarCafetera() {
        this.cantidadActual = cantidadMaxima;
    }

    public void vaciarCafetera() {
        this.cantidadActual = 0;
    }

    public void agregarCafe(float cantidad) {
        if (cantidadActual + cantidad > cantidadMaxima) {
            cantidadActual = cantidadMaxima;
        } else {
            cantidadActual += cantidad;
        }
    }

    public void servirTaza(float taza) {
        if (taza <= cantidadActual) {
            cantidadActual -= taza;
        } else {
            cantidadActual = 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cafetera cafetera = new Cafetera(1000, 0);

        cafetera.llenarCafetera();

        System.out.print("Ingrese la capacidad de la taza: ");
        float taza = scanner.nextFloat();
        cafetera.servirTaza(taza);

        cafetera.vaciarCafetera();

        System.out.print("Ingrese la cantidad de café a agregar: ");
        float cantidad = scanner.nextFloat();
        cafetera.agregarCafe(cantidad);

        System.out.println("Cantidad final de café: " + cafetera.getActual() + " ml");

        scanner.close();
    }
}
