package PoliRoyal;

public abstract class Carta {
    private String nombre;
    private int daño;
    private int vida;
    private Arena arena;

    public Carta(String nombre, int daño, int vida, Arena arena) {
        this.nombre = nombre;
        this.daño = daño;
        this.vida = vida;
        this.arena = arena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Arena getArena() {
        return arena;
    }

    public void setArena(Arena arena) {
        this.arena = arena;
    }

    public abstract void fraseIconica();
}
