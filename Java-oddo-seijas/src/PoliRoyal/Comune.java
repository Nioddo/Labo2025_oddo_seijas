package PoliRoyal;

public class Comune extends Carta implements Jugables{
    private static int costoElixir=3;

    public Comune(String nombre, int daño, int vida, Arena arena) {
        super(nombre, daño, vida, arena);
    }

    @Override
    public void fraseIconica() {
        System.out.println("Soy una carta común y mi costo de elixir es: "+ costoElixir);
    }

    @Override
    public void invocarCarta(int ctdElixir) throws ElixirInsuficienteException {
            if(ctdElixir>costoElixir){
                System.out.println("Elixir suficiente para que esta carta sea usada");
            }
            else {
                throw new ElixirInsuficienteException("No hay elixir suficiente");
            }
    }

    @Override
    public String descripcionCarta() {
        return "Soy una carta común pero no por eso soy débil!";
    }

    @Override
    public void recibirDaño(int daño) {
        if(getVida()>daño){
            setVida(getVida()-daño);
            System.out.println("Sigo en combate hasta el final!");
        }
        else{
            System.out.println("Mori en batalla protegiendo a mi rey!");
        }
    }

    @Override
    public void evolucionarCarta(int vida) {
        setVida(getVida()+vida);
    }
}
