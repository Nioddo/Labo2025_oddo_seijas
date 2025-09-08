package eleccionesOktubre;

import Personas.PersonaUseAbs;

import java.time.LocalDate;
import java.time.LocalTime;

public class Trabajadores extends PersonaUseAbs implements Mensajeria {
private int DNI;
private int cuil;
private double sueldo;
private String direccion;
private HorarioLaboral horarioLaboral;

    public Trabajadores(String nombre, String apellido, LocalDate nacimiento, int edad, int DNI, int cuil, double sueldo, String direccion, HorarioLaboral horarioLaboral) {
        super(nombre, apellido, nacimiento, edad);
        this.DNI = DNI;
        this.cuil = cuil;
        this.sueldo = sueldo;
        this.direccion = direccion;
        this.horarioLaboral = horarioLaboral;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getCuil() {
        return cuil;
    }

    public void setCuil(int cuil) {
        this.cuil = cuil;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public HorarioLaboral getHorarioLaboral() {
        return horarioLaboral;
    }

    public void setHorarioLaboral(HorarioLaboral horarioLaboral) {
        this.horarioLaboral = horarioLaboral;
    }

    @Override
    public void enviarMensaje(){
        if(horarioLaboral.estaLaburando(LocalTime.now())){
            System.out.println("Yo, "+ getNombre() +" te invito a que…"+"Vote por el partido para un mejor futuro");
        }
    }

}

