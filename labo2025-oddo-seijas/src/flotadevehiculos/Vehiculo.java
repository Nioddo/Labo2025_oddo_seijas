package flotadevehiculos;

import enums.Color;

public class Vehiculo {
    private String marca;
    private String modelo;
    private Color color;
    private int cantruedas;
    private int aniofabricacion;

    public Vehiculo(){
        this.marca="";
        this.modelo="";
        this.cantruedas=0;
        this.aniofabricacion=0;
    }

    public Vehiculo(String marca, String modelo, String color, int cantruedas, int aniofabricacion){
        this.marca=marca;
        this.modelo=modelo;
        this.cantruedas=cantruedas;
        this.aniofabricacion=aniofabricacion;
    }

    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getCantruedas(){
        return  cantruedas;
    }
    public int getAniofabricacion(){
        return  aniofabricacion;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCantruedas(int cantruedas) {
        this.cantruedas = cantruedas;
    }

    public void setAniofabricacion(int aniofabricacion) {
        this.aniofabricacion = aniofabricacion;
    }

}

