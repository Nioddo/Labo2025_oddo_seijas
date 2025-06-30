package gestionMascotas;

public class Pez extends Mascota {
    private static int vidas=10;


    public Pez(String nombre, String tipo, Dueño dueño, int alegria) {
        super(nombre, tipo, dueño, alegria);
    }

    public static int getVidas() {
        return vidas;
    }

    public static void setVidas(int vidas) {
        Pez.vidas = vidas;
    }

    @Override
    public void saludar(){

    }
}
