package SistemaDeAlmuerzos;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Sistem s1 = new Sistem();
        Plato p1 = new Plato();


        Alumno alumno = new Alumno("3ero compu", "Matias", "Ritter");
        Profesor profe = new Profesor(30, "Aylen", "Yamal");

        s1.addPedido("2023-05-01",p1, alumno, "08:20:45.60000","PENDIENTE");


        s1.listadoDelDia(LocalDate.now());

        System.out.println();
        s1.top3();
    }
}
