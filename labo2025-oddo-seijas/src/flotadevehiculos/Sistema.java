package flotadevehiculos;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Vehiculo> flota;

    public Sistema() {
        flota = new ArrayList<>();
    }

    public String tipoVehiculoConMasCantidad() {
        int cantidadAutos=0, cantidadBicicletas=0, cantidadCamionetas=0;
            for (Vehiculo vehiculos : flota){
                if(vehiculos.getClass().getCanonicalName()=="auto"){
                    cantidadAutos++;
                } else if (vehiculos.getClass().getCanonicalName()=="camioneta") {
                    cantidadCamionetas++;
                }
                else {
                    cantidadBicicletas++;
                }

                if(cantidadAutos>cantidadCamionetas & cantidadAutos>cantidadBicicletas){
                    return "Autos";
                } else if (cantidadCamionetas>cantidadAutos & cantidadCamionetas>cantidadBicicletas) {
                    return "Camionetas";
                } else if (cantidadBicicletas>cantidadAutos & cantidadBicicletas>cantidadCamionetas) {
                    return "Bicicletas";
                }

            }








        if (cantidadAutos >= cantidadBicicletas && cantidadAutos >= cantidadCamionetas) {
            return "Autos";
        } else if (cantidadBicicletas >= cantidadAutos && cantidadBicicletas >= cantidadCamionetas) {
            return "Bicicletas";
        } else {
            return "Camionetas";
        }
    }



    public void agregarAuto(Auto a) {
        flota.add(a);
    }

    public void agregarBicicleta(Bicicleta b) {
        flota.add(b);
    }

    public void agregarCamioneta(Camioneta c) {
        flota.add(c);
    }
}
