package eleccionesOktubre;

import enums.Color;

public class PalomasMensajeras implements Mensajeria {
    private Color color;
    private String nombre;
    private static String especie="Mensajera";
    private boolean sabevolar;

    public PalomasMensajeras(Color color, String nombre, boolean sabevolar) {
        this.color = color;
        this.nombre = nombre;
        this.sabevolar = sabevolar;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static String getEspecie() {
        return especie;
    }

    public static void setEspecie(String especie) {
        PalomasMensajeras.especie = especie;
    }

    public boolean isSabevolar() {
        return sabevolar;
    }

    public void setSabevolar(boolean sabevolar) {
        this.sabevolar = sabevolar;
    }

    @Override
    public void enviarMensaje(){
        if(sabevolar==true){
            System.out.println("Lanzando un papelito que dice: "+"Vote por el partido para un mejor futuro");
        }
    }

}
