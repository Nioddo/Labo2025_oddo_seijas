package fundacion;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private List<Paciente> todos;
    private List<Tratamiento> enTratamiento;

    public Sistema() {
        this.todos = new ArrayList<>();
        this.enTratamiento = new ArrayList<>();
    }

    public void agregarPaciente(Paciente p) {
        todos.add(p);
        if (p instanceof Tratamiento) {
            enTratamiento.add((Tratamiento) p);
        }
    }

    public void ejecutarDia() {
        for (Tratamiento t : enTratamiento) {
            if (t instanceof Ninio) {
                ((Ninio) t).sumarDia();
            } else if (t instanceof Joven) {
                ((Joven) t).sumarDia();
            }
        }
    }

    public int contarNoAplican() {
        int count = 0;
        for (Paciente p : todos) {
            if (p instanceof Adulto || p instanceof Gerente) {
                count++;
            }
        }
        return count;
    }

    public void mostrarPacientes() {
        for (Paciente p : todos) {
            System.out.println(p.getNombre() + " " + p.getApellido() + " - " + p.getCategoria());
        }
    }
}