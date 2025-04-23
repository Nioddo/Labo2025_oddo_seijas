package unidad2;
import com.sun.tools.javac.Main;
import unidad1.Cancion;
import java.util.Scanner;

import java.util.ArrayList;
public class CD {
    private ArrayList<Cancion> canciones;
    String nombre;

        public CD(){
            this.canciones = new ArrayList<Cancion>();
            canciones.add(new Cancion("Luna de miel", "Virus"));
            this.nombre = "After Chabón";
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

        public static void verCancion(int posicion, ArrayList<Cancion> canciones) {
            if (posicion >= 0 && posicion < canciones.size()) {
                System.out.println("La canción en la posición " + posicion + " es: " + canciones.get(posicion));
            } else {
                System.out.println("Posición inválida.");
            }
        }

        public static void grabaCancion(int posicion, Cancion nuevaCancion, ArrayList<Cancion> canciones){
            if (posicion >= 0 && posicion < canciones.size()) {
                canciones.set(posicion, nuevaCancion);
            } else {
                System.out.println("Posición inválida.");
            }
        }

        public static void agregarCancion(Cancion nuevaCancion, ArrayList<Cancion> canciones) {
            canciones.add(nuevaCancion);
        }

        public static void eliminarCancion(int posicion, ArrayList<Cancion> canciones) {
            if (posicion >= 0 && posicion < canciones.size()) {
                canciones.remove(posicion);
            } else {
                System.out.println("Posición inválida.");
            }
        }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CD miCD = new CD();

        System.out.println("Número de canciones en el CD: " + numeroCanciones(miCD.getCanciones()));

        System.out.print("Ingresa la posición de la canción que querés ver: ");
        int posVer = scanner.nextInt();
        scanner.nextLine();
        verCancion(posVer, miCD.getCanciones());

        System.out.print("Posición a reemplazar: ");
        int posReemplazo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nuevo título: ");
        String nuevoTitulo = scanner.nextLine();

        System.out.print("Nuevo autor: ");
        String nuevoAutor = scanner.nextLine();

        Cancion nueva = new Cancion(nuevoTitulo, nuevoAutor);
        grabaCancion(posReemplazo, nueva, miCD.getCanciones());

        System.out.println("Canción reemplazada en la posición " + posReemplazo);
        verCancion(posReemplazo, miCD.getCanciones());

        System.out.print("Título de la nueva canción a agregar: ");
        String tituloNueva = scanner.nextLine();
        System.out.print("Autor de la nueva canción: ");
        String autorNueva = scanner.nextLine();
        Cancion nuevaCancion = new Cancion(tituloNueva, autorNueva);
        agregarCancion(nuevaCancion, miCD.getCanciones());
        System.out.println("Canción agregada al final.");
        verCancion(miCD.getCanciones().size() - 1, miCD.getCanciones());

        System.out.print("Posición de la canción que querés eliminar: ");
        int posEliminar = scanner.nextInt();
        scanner.nextLine();
        eliminarCancion(posEliminar, miCD.getCanciones());
        System.out.println("Canción eliminada.");

        System.out.println("Lista final de canciones:");
        for (int i = 0; i < miCD.getCanciones().size(); i++) {
            System.out.print(i + ": ");
            verCancion(i, miCD.getCanciones());
        }

        scanner.close();
    }


}
