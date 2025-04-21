package unidad1;

public class Cancion {

    private String titulo;
    private String autor;

    public Cancion() {
        this.titulo = "";
        this.autor = "";
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

        public static void main(String[] args) {
            // Usando constructor por defecto
            Cancion c1 = new Cancion();
            c1.setTitulo("Imagine");
            c1.setAutor("John Lennon");

            // Usando constructor parametrizado
            Cancion c2 = new Cancion("Bohemian Rhapsody", "Queen");

            // Mostrando resultados
            System.out.println("Canción 1: " + c1.getTitulo() + " de " + c1.getAutor());
            System.out.println("Canción 2: " + c2.getTitulo() + " de " + c2.getAutor());
        }
    }


