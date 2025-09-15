package fundacion;

import java.time.LocalDate;

public class Adulto extends Paciente {
    public Adulto(String nombre, String apellido, LocalDate fechaNacimiento, String genero, String tipoSangre) {
        super(nombre, apellido, fechaNacimiento, genero, tipoSangre);
    }

    @Override
    public String getCategoria() {
        return "Adulto";
    }
}