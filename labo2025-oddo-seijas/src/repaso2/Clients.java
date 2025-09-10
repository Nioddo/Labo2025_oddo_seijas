package repaso2;

import java.util.ArrayList;

public class Clients extends PersonaR {
    private int cantidadT;

    public Clients(String nombre, String apellido, int edad, int cantidadT) {
        super(nombre, apellido, edad);
        this.cantidadT = cantidadT;
    }

    public int getCantidadT() {
        return cantidadT;
    }

    public void setCantidadT(int cantidadT) {
        this.cantidadT = cantidadT;
    }
}
