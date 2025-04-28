package curling;

import unidad2.Equipo;
import unidad2.Sistema_de_campeonatos_de_Curling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class campeonato_de_curling {
    private List<unidad2.Equipo> equipos;


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
                unidad2.Equipo equipo1 = equipos.get(i);
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
}

