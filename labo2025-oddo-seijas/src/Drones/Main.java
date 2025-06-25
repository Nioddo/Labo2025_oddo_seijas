package Drones;

import java.time.LocalDate;

public class Main {
        public static void main(String[] args) {
            Carga dronCarga = new Carga("Carga-01", LocalDate.of(2023, 5, 12), 101, Estado.OPERATIVO, 60, 0, 10);

            Vigilancia dronVigilancia = new Vigilancia("Vig-01", LocalDate.of(2024, 3, 20), 202, Estado.OPERATIVO, 80, 0, 500);

            double latDestino = -34.760000;
            double longDestino = -58.520000;

            boolean puedeCarga = dronCarga.evMision(latDestino, longDestino);
            System.out.println("¿Dron de carga puede realizar la misión? " + (puedeCarga ? "Sí" : "No"));

            boolean puedeVigilancia = dronVigilancia.evMision(latDestino, longDestino);
            System.out.println("¿Dron de vigilancia puede realizar la misión? " + (puedeVigilancia ? "Sí" : "No"));
        }
    }



