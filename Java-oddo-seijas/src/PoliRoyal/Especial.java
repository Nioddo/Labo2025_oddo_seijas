package PoliRoyal;

public class Especial extends Carta implements Jugables{
    private int nivelDeDesbloqueo;
    private int costoElixir;
    private int bonus;

    public Especial(String nombre, int daño, int vida, Arena arena, int nivelDeDesbloqueo, int costoElixir, int bonus) {
        super(nombre, daño, vida, arena);
        this.nivelDeDesbloqueo = nivelDeDesbloqueo;
        this.costoElixir = costoElixir;
        this.bonus = bonus;
    }


    @Override
    public void fraseIconica() {
        System.out.println("Soy una carta especial de nivel "+nivelDeDesbloqueo+ " y mi costo de elixir actual es: "+costoElixir);
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
        return "Soy una carta especial y puedo contra todo!";
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
        bonus += 2;
    }
}
