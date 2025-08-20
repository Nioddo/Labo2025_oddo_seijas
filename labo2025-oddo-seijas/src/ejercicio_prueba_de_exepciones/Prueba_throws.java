package ejercicio_prueba_de_exepciones;

public class Prueba_throws {

    public static void main(String[] args) {
        try {
            imprimirLargo(null);
        } catch (NullPointerException e) {
            System.err.println("El nombre es null (capturado en main)");
        }
    }

    public static void imprimirLargo(String nombre) throws NullPointerException {
        System.out.println("El largo del nombre es: " + nombre.length());
    }
}

