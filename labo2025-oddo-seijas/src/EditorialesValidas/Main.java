package EditorialesValidas;

import SistemaDeAlmuerzos.Persona;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Persona autor1 = new Persona("Gabriel", "García Márquez",12);
        Persona autor2 = new Persona("Julio", "Cortázar",12);

        Editorial editorial1 = Editorial.EL_ATENEO;
        Editorial editorial2 = Editorial.ALIANZA;

        Libro libro1 = new Libro(
                "Cien años de soledad",
                autor1,
                123456789,
                editorial1,
                LocalDate.of(1967, 5, 30)
        );

        Libro libro2 = new Libro(
                "Rayuela",
                autor2,
                987654321,
                editorial2,
                LocalDate.of(1963, 6, 28)
        );

        // Mostrar información
        System.out.println("Libro 1: " + libro1.getTitulo() + " de " + libro1.getAutor().getNombre());
        System.out.println("Libro 2: " + libro2.getTitulo() + " de " + libro2.getAutor().getNombre());
    }
}