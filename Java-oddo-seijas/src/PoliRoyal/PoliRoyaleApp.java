package PoliRoyal;

import java.util.HashMap;
import java.util.HashSet;

public class PoliRoyaleApp {
    private HashSet<Carta> cartasTotales;
    private HashSet<Jugables> cartasJugables;
    private HashMap<Jugador,Carta> cartaFav;

    public void registrarCartaFav(Jugador j, Carta c) throws FavYaIngresadoException{
        if(cartaFav.containsKey(j)){
            if(cartaFav.get(j).equals(c)){
                throw new FavYaIngresadoException("Ya tenía esta carta asignada como favorita");
            }
            else {
                cartaFav.put(j,c);
                System.out.println("Carta favorita registrada con éxito");
            }
        }
        else {
            cartaFav.put(j,c);
            System.out.println("Carta favorita registrada con éxito");
        }
    }

    public void nuevaCarta(Carta c) throws CartaInvalidaException{
        if(c.getDaño() < 0 || c.getVida() < 0){
            throw new CartaInvalidaException("Carta con valores inválidos");
        }
        else{
            cartasTotales.add(c);
            try {
                Jugables j1 = (Jugables) c;
                cartasJugables.add(j1);
            }catch (ClassCastException e){
            }

        }
    }

    public void subirNivel(Jugables c, int vidaExtra){
        c.evolucionarCarta(vidaExtra);
    }

    public void cartasJugablesTOTAL(){
        System.out.println("La cantidad de cartas actualmente jugables son: "+ cartasJugables.size());
    }

    public static void main(String[] args) {
        
    }

}
