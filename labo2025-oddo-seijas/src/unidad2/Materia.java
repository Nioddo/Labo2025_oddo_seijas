import java.util.ArrayList;

public class Materia {
    private String nombre;
    private ArrayList<String> listaDeContenidos;
    private ArrayList<Alumno> alumnosInscriptos;

    // Constructor
    public Materia(String nombre) {
        this.nombre = nombre;
        this.listaDeContenidos = new ArrayList<>();
        this.alumnosInscriptos = new ArrayList<>();
    }

    // Getter y Setter para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter para listaDeContenidos
    public ArrayList<String> getListaDeContenidos() {
        return listaDeContenidos;
    }

    public void setListaDeContenidos(ArrayList<String> listaDeContenidos) {
        this.listaDeContenidos = listaDeContenidos;
    }

    // Getter y Setter para alumnosInscriptos
    public ArrayList<Alumno> getAlumnosInscriptos() {
        return alumnosInscriptos;
    }

    public void setAlumnosInscriptos(ArrayList<Alumno> alumnosInscriptos) {
        this.alumnosInscriptos = alumnosInscriptos;
    }

    // Método para agregar contenido a la materia
    public void agregarContenido(String contenido) {
        listaDeContenidos.add(contenido);
    }

    // Método para inscribir un alumno
    public void inscribirAlumno(Alumno alumno) {
        alumnosInscriptos.add(alumno);
    }
}
