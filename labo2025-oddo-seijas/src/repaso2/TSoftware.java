package repaso2;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class TSoftware extends Ticket{
    private Software software;
    private static int intentos=3;

    public TSoftware(Clients cliente, String desc, LocalDateTime creacion, LocalDateTime finalizacion, ArrayList<String> anotaciones, EstadoT estado, ArrayList<Desarollador> desarolladores, Software software) {
        super(cliente, desc, creacion, finalizacion, anotaciones, estado, desarolladores);
        this.software = software;
    }

    public Software getSoftware() {
        return software;
    }

    public void setSoftware(Software software) {
        this.software = software;
    }

    public static int getIntentos() {
        return intentos;
    }

    public static void setIntentos(int intentos) {
        TSoftware.intentos = intentos;
    }

    @Override
    public Boolean comprobacion(){
        if(software.isParche()==Boolean.TRUE && intentos > 0 && getEstado()==EstadoT.ENPROGRESO){
            actEstado(EstadoT.RESUELTO);
            return true;
        }
        else{
            return false;
        }
    }
}
