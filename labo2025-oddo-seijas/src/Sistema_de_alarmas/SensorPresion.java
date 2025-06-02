package Sistema_de_alarmas;

public class SensorPresion extends Sensor{

    public SensorPresion(boolean estado, double medida, int umbral, int anioAdquisacion) {
        super(estado, medida, umbral, anioAdquisacion);
    }

    public SensorPresion(double medida, boolean estado, int umbral, int anioAdquisacion) {
        super();
    }
    public void alerta(){
        if (CompUmbral()==true){
            System.out.println("Sensor de presión activado");
        }
    }
}
