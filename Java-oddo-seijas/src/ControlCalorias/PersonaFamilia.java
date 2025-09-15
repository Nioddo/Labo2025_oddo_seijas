package ControlCalorias;

import Personas.PersonaUse;
import Personas.PersonaUseAbs;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PersonaFamilia extends PersonaUseAbs {
    private HashMap<Plato,Integer> consumidos;

    public PersonaFamilia(String nombre, String apellido, LocalDate nacimiento, int edad, HashMap<Plato, Integer> consumidos) {
        super(nombre, apellido, nacimiento, edad);
        this.consumidos = consumidos;
    }

    public HashMap<Plato, Integer> getConsumidos() {
        return consumidos;
    }

    public void setConsumidos(HashMap<Plato, Integer> consumidos) {
        this.consumidos = consumidos;
    }

    public int ctdCalorias() {
        int cdt=0;
        for (Map.Entry<Plato, Integer> cal : consumidos.entrySet()) {
            Plato p=cal.getKey();
            Integer can=cal.getValue();
            cdt+=p.cantCalorias()*can;
        }
        return cdt;
    }
}
