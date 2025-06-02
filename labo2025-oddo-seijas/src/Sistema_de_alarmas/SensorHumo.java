package Sistema_de_alarmas;

public class SensorHumo extends Sensor{

    public SensorHumo(boolean estado, double medida, int umbral, int anioAdquisacion) {
        super(estado, medida, umbral, anioAdquisacion);
    }

    public SensorHumo(double medida, boolean estado, int umbral, int anioAdquisacion) {
        super();
    }
    public void alerta(){
        if (CompUmbral()==true){
            System.out.println("Llamando a los bomberos 911");
        }
    }
}
