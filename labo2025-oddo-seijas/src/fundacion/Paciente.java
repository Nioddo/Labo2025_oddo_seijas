package fundacion;

import java.time.LocalDate;

public abstract class Paciente {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private String genero;
    private String tipoSangre;

    public Paciente(String nombre, String apellido, LocalDate fechaNacimiento, String genero, String tipoSangre) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.tipoSangre = tipoSangre;
    }

    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public String getGenero() { return genero; }
    public String getTipoSangre() { return tipoSangre; }

    public abstract String getCategoria();
}
