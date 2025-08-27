package ConsumoElectricidad;

import ConsumoElectricidad.Dueño;
import ConsumoElectricidad.Meses;

import java.util.HashMap;

public abstract class Vivienda {
    private String direccion;
    private int postal;
    private Dueño duenio;
    private HashMap<Integer,HashMap<Meses,Integer>> KWhpAño;

    public Vivienda(String direccion, int postal, Dueño duenio, HashMap<Integer, HashMap<Meses, Integer>> KWhpAño) {
        this.direccion = direccion;
        this.postal = postal;
        this.duenio = duenio;
        this.KWhpAño = KWhpAño;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getPostal() {
        return postal;
    }

    public void setPostal(int postal) {
        this.postal = postal;
    }

    public Dueño getDuenio() {
        return duenio;
    }

    public void setDuenio(Dueño duenio) {
        this.duenio = duenio;
    }

    public HashMap<Integer, HashMap<Meses, Integer>> getKWhpAño() {
        return KWhpAño;
    }

    public void setKWhpaño(HashMap<Integer, HashMap<Meses, Integer>> KWhpAño) {
        this.KWhpAño = KWhpAño;
    }

    abstract void agregarConsumo ();

}
