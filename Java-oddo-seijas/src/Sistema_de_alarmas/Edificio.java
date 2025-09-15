package Sistema_de_alarmas;

import java.util.ArrayList;

public class Edificio {
    public static void main(String[] args) {
        SensorHumo sh = new SensorHumo(true, 8.0, 6, 2020);
        SensorTemperatura st = new SensorTemperatura(true, 10.0, 7, 2018);
        SensorPresion sp = new SensorPresion(true, 9.0, 5, 2019);

        SensorCompuesto sc = new SensorCompuesto(true, 7, 2021, 3, new ArrayList<>());
        sc.agregarSensor(sh);
        sc.agregarSensor(st);
        sc.agregarSensor(sp);

        sh.alerta();
        st.alerta();
        sp.alerta();

        sc.alerta();
    }
}

