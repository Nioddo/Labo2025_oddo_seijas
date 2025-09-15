package fundacion;


import java.time.LocalDate;

public class                                                                                                                                 Gerente extends Paciente {
    public Gerente(String nombre, String apellido, LocalDate fechaNacimiento, String genero, String tipoSangre) {
        super(nombre, apellido, fechaNacimiento, genero, tipoSangre);
    }

    @Override
    public String getCategoria() {
        return "Gerente(o geronte XD)";
    }
}