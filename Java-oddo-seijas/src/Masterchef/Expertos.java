package Masterchef;

import java.time.LocalDate;

public class Expertos extends Participantes implements Cocinar, Servir{
    private static int tiempoLImite=80;
    private int tiempoRestante;


    public Expertos(String nombre, String apellido, LocalDate nacimiento, int edad, String localidad, Equipos equipo) {
        super(nombre, apellido, nacimiento, edad, localidad, equipo);
        this.tiempoRestante = tiempoLImite;
    }

    public static int getTiempoLImite() {
        return tiempoLImite;
    }

    public static void setTiempoLImite(int tiempoLImite) {
        Expertos.tiempoLImite = tiempoLImite;
    }

    public int getTiempoRestante() {
        return tiempoRestante;
    }

    public void setTiempoRestante(int tiempoRestante) {
        this.tiempoRestante = tiempoRestante;
    }

    @Override
    public void prepararLugarTrabajo() {
        tiempoRestante-=5;
        System.out.println("Perdi 5 minutos preparando la mesa por lo que mi tiempo restante es: "+ tiempoRestante);
    }    // aca tengo miedo de hacer hardcodeo entonces cree el atributo tiemporestante para llevar un control de cuanto tiempo queda y el 80 me da miedo que este hardcodeado


    @Override
    public void cocinar(Plato pnew) throws ErrorCocina {
        if(pnew.getTiempoPreparacion()>tiempoRestante){
            throw new ErrorCocina("no alcanza el tiempo para relizar el plato");
        }
    }

    @Override
    public void servir(Plato pnew) throws ErrorServir {
        System.out.println("plato servido con exito");
    }

}
