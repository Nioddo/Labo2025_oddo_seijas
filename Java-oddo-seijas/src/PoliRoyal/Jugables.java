package PoliRoyal;

public interface Jugables {
    void invocarCarta(int ctdElixir) throws ElixirInsuficienteException;
    String descripcionCarta();
    void recibirDaño(int daño);
    void evolucionarCarta(int vida);


}
