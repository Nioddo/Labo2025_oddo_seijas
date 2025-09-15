package ControlCalorias;

import java.util.HashSet;


public class Familia {
    private HashSet<PersonaFamilia> familia;

    public Familia(HashSet<PersonaFamilia> familia) {
        this.familia = familia;
    }

    public HashSet<PersonaFamilia> getFamilia() {
        return familia;
    }

    public void setFamilia(HashSet<PersonaFamilia> familia) {
        this.familia = familia;
    }
    public Double PromFamiliar(){
        double prom=0.0;
        for (PersonaFamilia p1: familia){
            prom=p1.ctdCalorias();
        }
        return prom/familia.size();
    }

    public PersonaFamilia mas(){
        double prom=0.0;
        double local;
        PersonaFamilia ele=null;
        for (PersonaFamilia p1: familia){
            local=p1.ctdCalorias();
            if(prom<local){
                prom=local;
                ele=p1;
            }
        }
        return ele;

    }

    public PersonaFamilia menos(){
        double prom=Double.MAX_VALUE;
        double local;
        PersonaFamilia ele=null;
        for (PersonaFamilia p1: familia){
            local=p1.ctdCalorias();
            if(prom>local){
                prom=local;
                ele=p1;
            }
        }
        return ele;

    }
}
