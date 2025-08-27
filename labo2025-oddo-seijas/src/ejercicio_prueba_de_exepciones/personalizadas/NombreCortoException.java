package ejercicio_prueba_de_exepciones.personalizadas;

public class NombreCortoException extends Exception {
    public NombreCortoException(String mensaje) {
        super(mensaje);
    }
}