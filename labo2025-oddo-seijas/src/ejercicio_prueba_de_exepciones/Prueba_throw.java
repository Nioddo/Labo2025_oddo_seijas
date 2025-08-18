package ejercicio_prueba_de_exepciones;

public class Prueba_throw {
    public static void main(String[] args) {
        String nombre = null;
        try {
                throw new NullPointerException ("no hay numero");
        }
        catch (NullPointerException exception){
            System.err.println("el nombre es un null");
        }
    }
}
