package unidad2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


    public class Sistema_de_campeonatos_de_Curling {
        private List<Equipo> equipos;


        public void Sistema_de_campeonatos_de_Curling() {
            equipos = new ArrayList<>();
        }


        public void generarFixture() {
            if (equipos.size() < 2) {
                System.out.println("No hay suficientes equipos para generar un fixture.");
                return;
            }

            String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
            int diaIndex = 0;

            for (int i = 0; i < equipos.size(); i++) {
                for (int j = i + 1; j < equipos.size(); j++) {
                    Equipo equipo1 = equipos.get(i);
                    Equipo equipo2 = equipos.get(j);

                    // Buscar un turno en común
                    String turnoAsignado = buscarTurnoComun(equipo1.getDisponibilidadHoraria(), equipo2.getDisponibilidadHoraria());

                    if (turnoAsignado == null) {
                        // Si no hay turno en común, lo asignamos al turno del primer equipo
                        turnoAsignado = equipo1.getDisponibilidadHoraria();
                    }

                    diaIndex++;
                }
            }
            System.out.println("Fixture generado correctamente.\n");
        }

        private String buscarTurnoComun(String turno1, String turno2) {
            if (turno1.equals(turno2)) {
                return turno1;
            } else {
                return null;
            }
        }



        public static void main(String[] args) {
            Sistema_de_campeonatos_de_Curling sistema = new Sistema_de_campeonatos_de_Curling();
            Scanner scanner = new Scanner(System.in);
            int opcion;

            do {
                System.out.println("\n--- MENÚ ---");
                System.out.println("1. Registrar nuevo equipo");
                System.out.println("2. Mostrar equipos registrados");
                System.out.println("3. Generar fixture");
                System.out.println("4. Mostrar fixture");
                System.out.println("5. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir salto de línea

                switch (opcion) {
                    case 3:
                        sistema.generarFixture();
                        break;
                    case 5:
                        System.out.println("Saliendo del sistema...");
                        break;
                    default:
                        System.out.println("Opción inválida. Intente nuevamente.");
                }
            } while (opcion != 5);
        }
    }
