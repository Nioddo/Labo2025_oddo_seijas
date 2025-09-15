package Drones;

import java.time.LocalDate;

public class Vigilancia extends Dron {
private int memoria;

    public Vigilancia(String nombre, LocalDate fechaAdquisicion, int id, Estado estado, int bateria, int contador, int memoria) {
        super(nombre, fechaAdquisicion, id, estado, bateria, contador);
        this.memoria = memoria;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    @Override
    boolean evMision(double Latitud, double Longitud){
    double distancia =CalcDistancia.calculo(Latitud,Longitud,Dron.getLatitudOrigen(),Dron.getLongitudOrigen());
    double cantFotos = distancia /2;
    double memoriaNecesaria = cantFotos*12;
    if(memoria>memoriaNecesaria){
        return true;
    }
    else{
        return false;
    }
    }
}
