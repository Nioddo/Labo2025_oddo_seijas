package unidad3herencia.flotadevehiculos;

import unidad1.Coche;

public class bicicleta extends vehiculo {


    public bicicleta(String marca, String modelo, String color, int cantruedas, int aniofabricacion) {
        super(marca, modelo, color, cantruedas, aniofabricacion);
    }

    public bicicleta() {
        super();
    }
}
