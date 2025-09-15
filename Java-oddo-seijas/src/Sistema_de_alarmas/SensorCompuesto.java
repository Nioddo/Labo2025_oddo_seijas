package Sistema_de_alarmas;

import java.util.ArrayList;
import java.util.List;

public class SensorCompuesto extends Sensor {

    private List<Sensor> sensores;

    public SensorCompuesto(boolean estado, double medida, int umbral, int anioAdquisacion, List<Sensor> sensores) {
        super(estado, medida, umbral, anioAdquisacion);
        this.sensores = sensores;
    }

    public SensorCompuesto(List<Sensor> sensores) {
        this.sensores = sensores;
    }

    public void agregarSensor(Sensor s) {
        if (s != null) {
            sensores.add(s);
        }
    }

    @Override
    public boolean CompUmbral() {
        if (sensores.isEmpty()) {
            return false;
        }

        double suma = 0;
        int activos = 0;

        for (Sensor s : sensores) {
            if (s.getEstado()) {  // solo toma sensores conectados
                suma += s.getMedida();
                activos++;
            }
        }

        // Evita división por cero
        if (activos == 0) return false;

        double promedio = suma / 3.0;  // regla: dividir por 3
        return promedio > getUmbral();
    }

    public void alerta() {
        if (CompUmbral()) {
            System.out.println("⚠️ Alarma del sensor compuesto activada");
        }
    }
}
