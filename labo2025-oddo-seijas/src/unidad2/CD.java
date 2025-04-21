package unidad2;
import com.sun.tools.javac.Main;
import unidad1.Cancion;

import java.util.ArrayList;
public class CD {
    private ArrayList<Cancion> canciones;
    String nombre;

    public CD(){
        this.canciones= new ArrayList<Cancion>();
        canciones.add(new Cancion("luna de miel", "virus"));
        this.nombre ="after chabon";
    }

    public CD(ArrayList<Cancion> canciones, String nombre){
        this.canciones = canciones;
        this.nombre = nombre;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int numeroCanciones(ArrayList<Cancion> canciones){
    return canciones.size();
    }

    public static void verCancion(int posicion,ArrayList<Cancion> canciones) {
        System.out.println("la cacion de la posicion:"+ posicion +" es "+ canciones.get(posicion));
    }
    public static void grabaCancion(int posicion, Cancion nuevaCancion, ArrayList<Cancion> canciones){
        canciones[posicion] = nuevaCancion;

    }




        public static void main(String[] args) {

    }


}
