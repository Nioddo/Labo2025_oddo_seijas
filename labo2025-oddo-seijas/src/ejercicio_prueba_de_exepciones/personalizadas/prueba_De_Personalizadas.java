package ejercicio_prueba_de_exepciones.personalizadas;

public class prueba_De_Personalizadas {

    public static void main(String[] args) {
        try {
            imprimirLargo(null);
            imprimirLargo("Jo");
            imprimirLargo("Nicolas");
        }
        catch (NombreNullException e) {
            System.err.println("Error: " + e.getMessage());
        }
        catch (NombreCortoException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    public static void imprimirLargo(String nombre)
            throws NombreNullException, NombreCortoException {
        if (nombre == null) {
            throw new NombreNullException("El nombre no puede ser null");
        }
        if (nombre.length() < 3) {
            throw new NombreCortoException("El nombre es demasiado corto");
        }
        System.out.println("El largo del nombre es: " + nombre.length());
    }
}



