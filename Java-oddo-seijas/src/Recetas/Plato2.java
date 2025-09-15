package Recetas;
//En una plataforma de recetas culinarias se definirán distintos platos que se podrán realizan indicando nombre del plato, nivel de dificultad (Fácil, medio o avanzado) y una lista de pasos para realizarlo.


public abstract class Plato2 {
    private String nombre;
    private Dificultad dificultad;
    private String pasos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Dificultad getDificultad() {
        return dificultad;
    }

    public void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }

    public String getPasos() {
        return pasos;
    }

    public void setPasos(String pasos) {
        this.pasos = pasos;
    }

    abstract void MostrarPasos();

}

