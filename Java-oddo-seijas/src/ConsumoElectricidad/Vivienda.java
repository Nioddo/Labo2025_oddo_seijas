package ConsumoElectricidad;

import ConsumoElectricidad.Dueño;
import ConsumoElectricidad.Meses;

import java.util.HashMap;

public abstract class Vivienda {
    private String direccion;
    private int postal;
    private Dueño duenio;
    private HashMap<Integer,HashMap<Meses,Double>> KWhpAño;

    public Vivienda(String direccion, int postal, Dueño duenio, HashMap<Integer, HashMap<Meses, Double>> KWhpAño) {
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

    public HashMap<Integer, HashMap<Meses, Double>> getKWhpAño() {
        return KWhpAño;
    }

    public void setKWhpaño(HashMap<Integer, HashMap<Meses, Double>> KWhpAño) {
        this.KWhpAño = KWhpAño;
    }

    abstract int dameVlor();

    void agregarConsumo (Meses mes,int año,Double kw){
        if(!getKWhpAño().containsKey(año)) {
            System.out.println("año no registrado");
        }
        else{
            HashMap<Meses, Double> KWhpMes = getKWhpAño().get(año);
            if (!KWhpMes.containsKey(mes)){

                HashMap<Meses, Double> KWhpMesant = getKWhpAño().get(año-1);
                Double mesanterior=KWhpMesant.get(mes);
                if(kw <= mesanterior*0.9){
                    double consumo =(kw*dameVlor())*0.95;
                    KWhpMes.put(mes,consumo);
                    KWhpAño.put(año,KWhpMes);
                }
                else{
                    KWhpMes.put(mes,kw*dameVlor());
                    KWhpAño.put(año,KWhpMes);

                }

            }
            else{
                System.out.println("el mes ya esta registrado");
            }
        }
    }
}

