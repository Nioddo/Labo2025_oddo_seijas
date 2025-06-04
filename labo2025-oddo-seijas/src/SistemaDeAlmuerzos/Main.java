package SistemaDeAlmuerzos;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Sistem s1 = new Sistem();
        Plato p1 = new Plato("Milanesa con puré", 1.0,1);

        Alumno alumno = new Alumno("3ero compu", "Matias", "Ritter");
        Profesor profe = new Profesor(30, "Aylen", "Yamal");

        Pedido pp1 = new Pedido(LocalDate.of(2025,6,4), p1, alumno, LocalTime.of(10,05,11), "PENDIENTE");

        s1.addPedido(pp1);

        s1.listadoDelDia(LocalDate.now());

        System.out.println();
        s1.top3();
    }
}
