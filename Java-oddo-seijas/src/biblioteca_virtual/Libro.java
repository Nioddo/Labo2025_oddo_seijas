package biblioteca_virtual;

public abstract class Libro {
    private String nombre;
    private String autor;
    private Genero genero;

    public Libro(String nombre, String autor, Genero genero) {
        this.nombre = nombre;
        this.autor = autor;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
