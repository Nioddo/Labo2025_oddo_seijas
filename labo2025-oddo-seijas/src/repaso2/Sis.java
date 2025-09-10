package repaso2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Sis {
    private ArrayList<Ticket> tickets;
    private ArrayList<Desarollador> desarolladores;

    public int estTickets(EstadoT estado){
        int cdt=0;
        for (Ticket T : tickets){
            if(T.getEstado()==estado){
                cdt++;
            }
        }
        return cdt;
    }
    public int cdtTickets(){
        return tickets.size();
    }

    public Ticket ticketsinresolv() {
        Ticket masAntiguo = null;
        LocalDateTime fechaMin = LocalDateTime.MAX;

        for (Ticket t : tickets) {
            if (t.getEstado() == EstadoT.ABIERTO && t.getCreacion().isBefore(fechaMin)) {
                fechaMin = t.getCreacion();
                masAntiguo = t;
            }
        }

        return masAntiguo;
    }

    public void dep(Desarollador D){
        for(Ticket T : tickets){
            for(Desarollador dep: T.getDesarolladores()){
                if(dep == D){
                    System.out.println(T);
                }
            }
        }
    }









    public Desarollador olddevelopers(){
        LocalDate entMin=LocalDate.MAX;
        Desarollador dep=null;
        for(Desarollador D:desarolladores) {
            if(D.getEntrada().isBefore(entMin)){
                entMin= D.getEntrada();
                dep=D;
            }

        }
        return dep;
    }



public void depelospers(Ticket Te){
    for(Desarollador D : Te.getDesarolladores()){
        System.out.println(D.getNombre()+" "+D.getApellido());
    }
}

public static void main(String[] args) {
            Desarollador d1 = new Desarollador("franco","marotta",17, LocalDate.of(2021,3,3));
        Clients c1 = new Clients("juampi","baquro",16,0);
    Ticket t1 = new THardware(c1,"placa rota",null,null,new ArrayList<String>(),EstadoT.ABIERTO,);


}
}