package repaso2;

import SistemaDeAlmuerzos.Persona;

import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class Ticket {
        private Clients cliente;
        private String desc;
        private  LocalDateTime creacion;
        private LocalDateTime finalizacion;
        private ArrayList<String> anotaciones;
        private EstadoT estado;
        private ArrayList<Desarollador> desarolladores;

    public Ticket(Clients cliente, String desc, LocalDateTime creacion, LocalDateTime finalizacion, ArrayList<String> anotaciones, EstadoT estado, ArrayList<Desarollador> desarolladores) {
        this.cliente = cliente;
        this.desc = desc;
        this.creacion = LocalDateTime.now();
        this.finalizacion = finalizacion;
        this.anotaciones = anotaciones;
        this.estado = estado;
        this.desarolladores = desarolladores;
    }

    public Clients getCliente() {
        return cliente;
    }

    public void setCliente(Clients cliente) {
        this.cliente = cliente;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public LocalDateTime getCreacion() {
        return creacion;
    }

    public void setCreacion(LocalDateTime creacion) {
        this.creacion = creacion;
    }

    public LocalDateTime getFinalizacion() {
        return finalizacion;
    }

    public void setFinalizacion(LocalDateTime finalizacion) {
        this.finalizacion = finalizacion;
    }

    public ArrayList<String> getAnotaciones() {
        return anotaciones;
    }

    public void setAnotaciones(ArrayList<String> anotaciones) {
        this.anotaciones = anotaciones;
    }

    public EstadoT getEstado() {
        return estado;
    }

    public void setEstado(EstadoT estado) {
        this.estado = estado;
    }

    public ArrayList<Desarollador> getDesarolladores() {
        return desarolladores;
    }

    public void setDesarolladores(ArrayList<Desarollador> desarolladores) {
        this.desarolladores = desarolladores;
    }

    public void addComentario(String comentario){
        anotaciones.add(comentario);
    }
    public void actEstado(EstadoT estadonew){
        estado=estadonew;
        if(estadonew==EstadoT.RESUELTO || estadonew==EstadoT.CANCELADO){
            finalizacion=LocalDateTime.now();
            anotaciones.add("finalizacion");
            System.out.println("Actulizacion exitosa");
        }
    }
    public abstract Boolean comprobacion();

}
