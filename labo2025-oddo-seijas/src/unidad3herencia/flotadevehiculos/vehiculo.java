package unidad3herencia.flotadevehiculos;

public class vehiculo {
    private String marca;
    private String modelo;
    private String color;
    private int cantruedas;
    private int aniofabricacion;

    public vehiculo(){
        this.marca="";
        this.modelo="";
        this.color="";
        this.cantruedas=0;
        this.aniofabricacion=0;
    }

    public vehiculo(String marca, String modelo, String color, int cantruedas, int aniofabricacion){
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
        this.cantruedas=cantruedas;
        this.aniofabricacion=aniofabricacion;
    }

    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public String getColor(){
        return color;
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

    public void setColor(String color) {
        this.color = color;
    }

    public void setCantruedas(int cantruedas) {
        this.cantruedas = cantruedas;
    }

    public void setAniofabricacion(int aniofabricacion) {
        this.aniofabricacion = aniofabricacion;
    }

}

