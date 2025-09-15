package SistemaDeAlmuerzos;

public class Alumno extends Persona {
    private String division;

    public Alumno() {
        super();
        this.division="A-1";
    }

    public Alumno(String division, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.division = division;
    }



    public String getDivision() {
        return division;
    }


    public void setDivision(String division) {
        this.division = division;
    }
}
