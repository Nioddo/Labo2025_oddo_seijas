package CampeonatoArcoFlecha;

public abstract class Beneficios {
    private String nombre;
    private String creador;

    public Beneficios(String nombre, String creador) {
        this.nombre = nombre;
        this.creador = creador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }
}
