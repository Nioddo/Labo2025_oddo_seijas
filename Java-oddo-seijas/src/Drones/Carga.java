package Drones;

import java.time.LocalDate;

public class Carga extends Dron{
    private int carga;

    public Carga(String nombre, LocalDate fechaAdquisicion, int id, Estado estado, int bateria, int contador, int carga) {
        super(nombre, fechaAdquisicion, id, estado, bateria, contador);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }


    @Override
    boolean evMision(double Latitud, double Longitud){
            if(getBateria()>50 && CalcDistancia.calculo(Latitud,Longitud,Dron.getLatitudOrigen(),Dron.getLongitudOrigen())==30.0){
                return true;
            }
            else{
            return false;
        }
}

}
