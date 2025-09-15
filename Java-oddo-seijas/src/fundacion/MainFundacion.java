package fundacion;

import java.time.LocalDate;
public class MainFundacion {
    public static void main(String[] args) {
        Sistema s = new Sistema();

        Ninio n1 = new Ninio("Gabi", "Thomas", LocalDate.of(2021, 5, 12), "M", "AB+", 7);
        Ninio n2 = new Ninio("Sofia", "Luraghi", LocalDate.of(2018, 3, 4), "F", "AB-", 5);
        Joven j1 = new Joven("Luca", "Facha pro sigma 67", LocalDate.of(1999, 10, 20), "M", "A+");
        j1.agregarActividad("Fútbol");
        j1.agregarActividad("Equitacion");

        Adulto a1 = new Adulto("Ana", "Perez", LocalDate.of(1985, 6, 2), "F", "O+");
        Gerente g1 = new Gerente("Carlos", "Fernandez", LocalDate.of(1940, 1, 15), "M", "B-");

        s.agregarPaciente(n1);
        s.agregarPaciente(n2);
        s.agregarPaciente(j1);
        s.agregarPaciente(a1);
        s.agregarPaciente(g1);


        s.ejecutarDia();


        s.mostrarPacientes();
        System.out.println(j1.solicitarTratamiento());
        System.out.println(n2.solicitarTratamiento());
        System.out.println("Costo joven: " + j1.calcularCosto());
        System.out.println("Costo niño: " + n2.calcularCosto());
        System.out.println("Cantidad de pacientes que no aplican: " + s.contarNoAplican());
    }
}
