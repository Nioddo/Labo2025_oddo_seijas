package biblioteca;

import java.time.LocalDate;

public abstract class libro {
    private int isbn;
    private LocalDate fecha_publicacion;
    private String titulo;
    private int codigo_verificacion;
    private String idioma;
    private static String editorial = "Polineo";
    private LocalDate fecha_adquicision;

    public libro(int isbn, LocalDate fecha_publicacion, String titulo, int codigo_verificacion, String idioma, LocalDate fecha_adquicision) {
        this.isbn = isbn;
        this.fecha_publicacion = fecha_publicacion;
        this.titulo = titulo;
        this.codigo_verificacion = codigo_verificacion;
        this.idioma = idioma;
        this.fecha_adquicision = fecha_adquicision;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public LocalDate getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(LocalDate fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCodigo_verificacion() {
        return codigo_verificacion;
    }

    public void setCodigo_verificacion(int codigo_verificacion) {
        this.codigo_verificacion = codigo_verificacion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public static String getEditorial() {
        return editorial;
    }

    public static void setEditorial(String editorial) {
        libro.editorial = "Polineo";
    }

    public LocalDate getFecha_adquicision() {
        return fecha_adquicision;
    }

    public void setFecha_adquicision(LocalDate fecha_adquicision) {
        this.fecha_adquicision = fecha_adquicision;
    }

    public void mostrarinforequerida(int isbn){
        System.out.println("isbn: "+ getIsbn() + "codigo_verificacion: " + getCodigo_verificacion());
    }
}
