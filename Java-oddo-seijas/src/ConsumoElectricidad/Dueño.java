package ConsumoElectricidad;

import Personas.PersonaUseAbs;

import java.time.LocalDate;

public class Dueño extends PersonaUseAbs {
    private int dni;

    public Dueño(String nombre, String apellido, LocalDate nacimiento, int edad, int dni) {
        super(nombre, apellido, nacimiento, edad);
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
