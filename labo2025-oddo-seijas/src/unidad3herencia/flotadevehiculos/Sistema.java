package unidad3herencia.flotadevehiculos;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<auto> autos;
    private ArrayList<bicicleta> bicicletas;
    private ArrayList<camioneta> camionetas;

    public Sistema() {
        autos = new ArrayList<>();
        bicicletas = new ArrayList<>();
        camionetas = new ArrayList<>();
    }

    public String tipoVehiculoConMasCantidad() {
        int cantidadAutos = autos.size();
        int cantidadBicicletas = bicicletas.size();
        int cantidadCamionetas = camionetas.size();

        if (cantidadAutos >= cantidadBicicletas && cantidadAutos >= cantidadCamionetas) {
            return "Autos";
        } else if (cantidadBicicletas >= cantidadAutos && cantidadBicicletas >= cantidadCamionetas) {
            return "Bicicletas";
        } else {
            return "Camionetas";
        }
    }



    public void agregarAuto(auto a) {
        autos.add(a);
    }

    public void agregarBicicleta(bicicleta b) {
        bicicletas.add(b);
    }

    public void agregarCamioneta(camioneta c) {
        camionetas.add(c);
    }
}
