package biblioteca;

import java.time.LocalDate;

public class LibroDigital extends libro{
    private formato_digital formato_digital;
    private int cantidad_idiomas;

    public LibroDigital(int isbn, LocalDate fecha_publicacion, String titulo, int codigo_verificacion, String idioma, LocalDate fecha_adquicision, formato_digital formato_digital, int cantidad_idiomas) {
        super(isbn, fecha_publicacion, titulo, codigo_verificacion, idioma, fecha_adquicision);
        this.formato_digital = formato_digital;
        this.cantidad_idiomas = cantidad_idiomas;
    }

    public formato_digital getFormato_digital() {
        return formato_digital;
    }

    public void setFormato_digital(formato_digital formato_digital) {
        this.formato_digital = formato_digital;
    }

    public int getCantidad_idiomas() {
        return cantidad_idiomas;
    }

    public void setCantidad_idiomas(int cantidad_idiomas) {
        this.cantidad_idiomas = cantidad_idiomas;
    }

}
