package unidad2;

import java.util.ArrayList;

public class Operaciones_básicas {
    public static void main(String[] args) {
        int suma = 0;
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        for (Integer numero : numeros) {
            suma += numero;
        }
        System.out.println("la suma total es." + suma);

        ArrayList<String> palabras = new ArrayList<String>();
        char letraFiltro = 'A';

        System.out.println("Palabras que empiezan con '" + letraFiltro + "':");

        for (String palabra : palabras) {
            if (palabra.toUpperCase().startsWith(String.valueOf(letraFiltro))) {
                System.out.println(palabra);
            }
        }
        ArrayList<String> nombres = new ArrayList<String>();
        ArrayList<Integer> edades = new ArrayList<Integer>();


        System.out.println("Personas mayores de 30 años:");

        for (int i = 0; i < nombres.size(); i++) {
            if (edades.get(i) > 30) {
                System.out.println("Nombre: " + nombres.get(i) + ", Edad: " + edades.get(i));
            }
        }
    }
}
