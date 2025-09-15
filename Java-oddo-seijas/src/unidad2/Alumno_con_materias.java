package unidad2;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Alumno_con_materias {
    private ArrayList<Materia> materias;
    private ArrayList<Alumno> alumnos;


    public Alumno_con_materias() {
        ArrayList<Double> notas = new ArrayList<>();
        notas.add(10d);
        materias.add(new Materia("Fracciones"));
        alumnos.add(new Alumno("juan", "seijas", LocalDate.of(2007,11,3), notas));
    }

    public Alumno_con_materias(ArrayList<Materia> materias, ArrayList<Alumno> alumnos) {
        this.materias = new ArrayList<Materia>();
        this.alumnos = new ArrayList<Alumno>();
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void agregarMateria(Materia m1) {
        materias.add(m1);
    }

    public double promedioEdadAlumnos() {

        int tamanio = alumnos.size();
        double prom = 0;
        int suma = 0;
        for (Alumno alumno : alumnos) {
            LocalDate fActual = LocalDate.now();
            Period periodo = Period.between(alumno.getFechaNacimiento(), fActual);
            int edad = fActual.getYear();
            suma += edad;

        }
        prom = suma / tamanio;
        return prom;


    }

    public double promedioNotasAlumno() {
        double sumaNotas = 0;
        int cantidadNotas = 0;

        for (Alumno alumno : alumnos) {
            for (Double nota : alumno.getListaDeNotas()) {
                sumaNotas += nota;
                cantidadNotas++;

            }
        }

        if (cantidadNotas == 0) {
            return 0;
        }

        return sumaNotas / cantidadNotas;
    }
}
