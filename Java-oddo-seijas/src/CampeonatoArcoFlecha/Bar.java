package CampeonatoArcoFlecha;

import java.util.HashSet;

public class Bar {
    private int clientes;
    private double dineroRescaudado;
    private HashSet<Diana> dianas;
    private HashSet<Beneficios> beneficios;
    private HashSet<Acumulables> beneficiosAcumulables;

    public Bar(int clientes, double dineroRescaudado, HashSet<Diana> dianas, HashSet<Beneficios> beneficios, HashSet<Acumulables> beneficiosAcumulables) {
        this.clientes = clientes;
        this.dineroRescaudado = dineroRescaudado;
        this.dianas = dianas;
        this.beneficios = beneficios;
        this.beneficiosAcumulables = beneficiosAcumulables;
    }

    public int getClientes() {
        return clientes;
    }

    public void setClientes(int clientes) {
        this.clientes = clientes;
    }

    public double getDineroRescaudado() {
        return dineroRescaudado;
    }

    public void setDineroRescaudado(double dineroRescaudado) {
        this.dineroRescaudado = dineroRescaudado;
    }

    public HashSet<Diana> getDianas() {
        return dianas;
    }

    public void setDianas(HashSet<Diana> dianas) {
        this.dianas = dianas;
    }

    public HashSet<Beneficios> getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(HashSet<Beneficios> beneficios) {
        this.beneficios = beneficios;
    }

    public HashSet<Acumulables> getBeneficiosAcumulables() {
        return beneficiosAcumulables;
    }

    public void setBeneficiosAcumulables(HashSet<Acumulables> beneficiosAcumulables) {
        this.beneficiosAcumulables = beneficiosAcumulables;
    }

    public int contarBeneficiosTragos() {
        int contador = 0;
        for (Beneficios b : beneficios) {
            if (b instanceof Tragos) {
                contador++;
            }
        }
        return contador;
    }

}
