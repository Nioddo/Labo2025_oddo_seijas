package unidad2;
import java.time.LocalDate;
import java.util.ArrayList;


public class Alumno {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private ArrayList<Double> listaDeNotas;

    public Alumno() {
        this.listaDeNotas = new ArrayList<>();
    }

    public Alumno(String nombre, String apellido, LocalDate fechaNacimiento, ArrayList<Double> listaDeNotas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.listaDeNotas = listaDeNotas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public ArrayList<Double> getListaDeNotas() {
        return listaDeNotas;
    }

    public void setListaDeNotas(ArrayList<Double> listaDeNotas) {
        this.listaDeNotas = listaDeNotas;
    }

    public void agregarNota(double nota) {
        this.listaDeNotas.add(nota);
    }

    public double menorNota() {
        if (listaDeNotas.isEmpty()) {
            return -1; // Retorna -1 si la lista está vacía
        }
        double menor = listaDeNotas.get(0);
        for (double nota : listaDeNotas) {
            if (nota < menor) {
                menor = nota;
            }
        }
        return menor;
    }

    public double mayorNota() {
        if (listaDeNotas.isEmpty()) {
            return -1; // Retorna -1 si la lista está vacía
        }
        double mayor = listaDeNotas.get(0);
        for (double nota : listaDeNotas) {
            if (nota > mayor) {
                mayor = nota;
            }
        }
        return mayor;
    }

    public static void main(String[] args) {
                Alumno alumno = new Alumno("Juan", "Pérez", LocalDate.of(2007,11,3), new ArrayList<>());

                System.out.println("Menor nota: " + alumno.menorNota()); // Debería imprimir -1
                System.out.println("Mayor nota: " + alumno.mayorNota()); // Debería imprimir -1

                alumno.agregarNota(7.5);
                alumno.agregarNota(9.0);
                alumno.agregarNota(6.5);

                System.out.println("Menor nota: " + alumno.menorNota()); // Debería imprimir 6.5
                System.out.println("Mayor nota: " + alumno.mayorNota()); // Debería imprimir 9.0
            }
        }
