package fundacion;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Joven extends Paciente implements Tratamiento {
    private List<String> actividades;
    private int diasTratamiento;

    public Joven(String nombre, String apellido, LocalDate fechaNacimiento, String genero, String tipoSangre) {
        super(nombre, apellido, fechaNacimiento, genero, tipoSangre);
        this.actividades = new ArrayList<>();
        this.diasTratamiento = 0;
    }

    public void agregarActividad(String act) {
        actividades.add(act);
    }

    @Override
    public String getCategoria() {
        return "Joven";
    }

    @Override
    public String solicitarTratamiento() {
        int edad = LocalDate.now().getYear() - this.getFechaNacimiento().getYear();
        int añosRestantes = 30 - edad;
        if (actividades.size() % 2 != 0 && añosRestantes <= 2) {
            return "Lamentamos comunicarte que tu sangre aún no va a poder ser modificada porque tienes sida";
        } else {
            return "Será un tratamiento costoso, pero lo vamos a lograr tienes que pagar con carne";
        }
    }

    @Override
    public double calcularCosto() {
        int año = this.getFechaNacimiento().getYear();
        if (año % 2 != 0) {
            return this.getFechaNacimiento().getMonthValue() * 760000;
        } else {
            return this.getFechaNacimiento().getDayOfMonth() * 145400;
        }
    }

    public void sumarDia() {
        int edad = LocalDate.now().getYear() - this.getFechaNacimiento().getYear();
        if (edad >= 20 && edad <= 30) {
            diasTratamiento++;
        }
    }

    public int getDiasTratamiento() {
        return diasTratamiento;
    }
}
