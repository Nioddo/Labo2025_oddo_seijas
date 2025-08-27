package ejercicio_prueba_de_exepciones.personalizadas;

public class NombreNullException extends Exception {
    public NombreNullException(String mensaje) {
        super(mensaje);
    }
}
