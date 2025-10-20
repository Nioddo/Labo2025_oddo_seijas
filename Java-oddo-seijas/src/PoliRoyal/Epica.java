package PoliRoyal;

public class Epica extends Carta{
    private int segundosDeEspera;

    public Epica(String nombre, int daño, int vida, Arena arena, int segundosDeEspera) {
        super(nombre, daño, vida, arena);
        this.segundosDeEspera = segundosDeEspera;
    }

    @Override
    public void fraseIconica() {
        System.out.println("Soy una carta épica, me jugaron y me desbloqueo en: "+segundosDeEspera);
    }
}
