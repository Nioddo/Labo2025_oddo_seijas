package SistemaDeAlmuerzos;

import java.time.LocalDate;
import java.time.LocalTime;

public  class Pedido {
    private LocalDate FechaCreacion;
    private Plato plato;
    private Persona solicitante;
    private LocalTime HoraEntrega;
    private Estado Estado;

    public Pedido(LocalDate fechaCreacion, Plato plato, Persona solicitante, LocalTime horaEntrega, String estado) {
        this.FechaCreacion = fechaCreacion;
        this.plato = plato;
        this.solicitante = solicitante;
        this.HoraEntrega = horaEntrega;
    }

    public LocalDate getFechaCreacion() {
        return FechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        FechaCreacion = fechaCreacion;
    }

    public Plato getPlato() {
        return plato;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
    }

    public Persona getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Persona solicitante) {
        this.solicitante = solicitante;
    }

    public LocalTime getHoraEntrega() {
        return HoraEntrega;
    }

    public void setHoraEntrega(LocalTime horaEntrega) {
        HoraEntrega = horaEntrega;
    }


}
