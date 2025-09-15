package Sistema_de_alarmas;

public class SensorTemperatura extends Sensor{
    public SensorTemperatura(boolean estado, double medida, int umbral, int anioAdquisacion) {
        super(estado, medida, umbral, anioAdquisacion);
    }



    public void alerta(){
        if (CompUmbral()==true){
            System.out.println("¡Cuidado! La temperatura sube");
        }
    }
}
