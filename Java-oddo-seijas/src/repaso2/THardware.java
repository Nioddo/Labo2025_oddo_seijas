package repaso2;

import SistemaDeAlmuerzos.Persona;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class THardware extends Ticket{
    private Hardware hardware;

    public THardware(Clients cliente, String desc, LocalDateTime creacion, LocalDateTime finalizacion, ArrayList<String> anotaciones, EstadoT estado, ArrayList<Desarollador> desarolladores, Hardware hardware) {
        super(cliente, desc, creacion, finalizacion, anotaciones, estado, desarolladores);
        this.hardware = hardware;
    }

    public Hardware getHardware() {
        return hardware;
    }

    public void setHardware(Hardware hardware) {
        this.hardware = hardware;
    }

    @Override
    public Boolean comprobacion(){
        if (hardware.getRepuesto()==Boolean.TRUE && getEstado()==EstadoT.ENPROGRESO){
            actEstado(EstadoT.RESUELTO);
            return true;
        }
        else{
            return false;
        }
    }

}
