package repaso2;

import java.time.LocalDate;

public class Desarollador extends PersonaR{
    private LocalDate entrada;

    public Desarollador(String nombre, String apellido, int edad, LocalDate entrada) {
        super(nombre, apellido, edad);
        this.entrada = entrada;
    }

    public LocalDate getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalDate entrada) {
        this.entrada = entrada;
    }
}
