package ejercicio_prueba_de_exepciones;

public class Prueba_bloque_trycatch {
    public static void main(String[] args) {
        String nombre = null;
        try {
            System.out.println("El largo del nombre es:" + nombre.length());
        }
        catch (NullPointerException exception){
            System.err.println("el nombre es un null");
        }
    }
}
