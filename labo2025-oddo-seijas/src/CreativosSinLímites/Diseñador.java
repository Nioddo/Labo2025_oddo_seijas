package CreativosSinLímites;

import Personas.PersonaUseAbs;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Diseñador extends PersonaUseAbs {
    private Tipo tipo;
    private HashMap<Proyecto, Double> asignados;

    public Diseñador(String nombre, String apellido, LocalDate nacimiento, int edad, Tipo tipo, HashMap<Proyecto, Double> asignados) {
        super(nombre, apellido, nacimiento, edad);
        this.tipo = tipo;
        this.asignados = sumarComision();
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public HashMap<Proyecto, Double> getAsignados() {
        return asignados;
    }

    public HashMap<Proyecto,Double> sumarComision(){
        for(Map.Entry<Proyecto,Double> neu : asignados.entrySet()){
            asignados.put(neu.getKey(),Sistem.calcComison(tipo,neu.getKey()));
        }
        return asignados;
    }

    public void setAsignados(HashMap<Proyecto, Double> asignados) {
        this.asignados = asignados;
    }

    public double conocerSueldo(){
        double sueldo=0;
        for(Map.Entry<Proyecto,Double> proy : asignados.entrySet()){
            sueldo+=Sistem.calcComison(tipo, proy.getKey());
        }
        return sueldo;
    }

    public int cantProy(){
        return asignados.size();
    }

    public void agregarProyecto(Proyecto pnew){
        asignados.put(pnew,Sistem.calcComison(tipo,pnew));
    }

    public Double ganaciaSinComision(Proyecto p){
        if(asignados.containsKey(p)){
            return p.getPrecio();
        }
        return 0.0;
    }

    public void sueldoDiscriminado(){
        double sueldo=0;
        for(Map.Entry<Proyecto,Double> p1 : asignados.entrySet()){
            System.out.println("Proyecto: "+p1.getKey().getNombre());
            sueldo=Sistem.calcComison(tipo,p1.getKey());
            System.out.println("Ganancia del proyecto: "+sueldo);
            sueldo=sueldo-ganaciaSinComision(p1.getKey());
            System.out.println("Cuanto representa la comision: "+sueldo);
        }
    }
}
