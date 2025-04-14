package unidad1;

public class Persona {

    private String nombre;
    private int edad;
    private String direccion;

    public Persona() {
        this.nombre = "Luciano";
        this.edad = 16;
        this.direccion = "Griveo 3223";
    }


    public Persona(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void mostrar() {
        System.out.println("Su nombre es: " + getNombre());
        System.out.println("La edad es: " + getEdad());
        System.out.println("La dirección es: " + getDireccion());
    }

    public static void main(String[] args) {
        String nombre = "Luca";
        int edad = 24;
        String direccion = "Griveo 3223";

        Persona p1 = new Persona();  // Con constructor por defecto
        Persona p2 = new Persona(nombre, edad, direccion);  // Con constructor personalizado

        p2.mostrar();
    }
}
