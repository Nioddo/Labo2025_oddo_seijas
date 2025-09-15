package control_altura_peso;
import java.time.LocalDate;

public class RegistroMain {
    public static void main(String[] args) {
        RegistroPaciente paciente = new RegistroPaciente("Juan", "Pérez", LocalDate.of(1990, 5, 20));

        paciente.registrarMedicion(LocalDate.of(2023, 1, 10), 70, 175);
        paciente.registrarMedicion(LocalDate.of(2023, 6, 15), 72, 176);
        paciente.registrarMedicion(LocalDate.of(2024, 1, 10), 74, 178);

        paciente.mostrarMedicionEnFecha(LocalDate.of(2023, 6, 15));
        paciente.promedioAnual(2023);
        paciente.porcentajeCambio(LocalDate.of(2023, 1, 10), LocalDate.of(2024, 1, 10));
    }
}

