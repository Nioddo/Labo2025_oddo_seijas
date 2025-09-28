package Masterchef;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Intermedios extends Participantes implements Cocinar, Servir{
    private HashMap<Ingredientes,Integer> stockIngrediente;

    public Intermedios(String nombre, String apellido, LocalDate nacimiento, int edad, String localidad, Equipos equipo, HashMap<Ingredientes, Integer> stockIngrediente) {
        super(nombre, apellido, nacimiento, edad, localidad, equipo);
        this.stockIngrediente = stockIngrediente;
    }

    public HashMap<Ingredientes, Integer> getStockIngrediente() {
        return stockIngrediente;
    }

    public void setStockIngrediente(HashMap<Ingredientes, Integer> stockIngrediente) {
        this.stockIngrediente = stockIngrediente;
    }

    @Override
    public void prepararLugarTrabajo() {
        System.out.println("Mi stock a utilizar es de: ");
        for(Map.Entry<Ingredientes,Integer> ing : stockIngrediente.entrySet()){
            if(ing.getValue()>1){
                System.out.println("- "+ing.getKey()+" "+ing.getValue());
            }
        }
    }

    @Override
    public void cocinar(Plato pnew) throws ErrorCocina {
        prepararLugarTrabajo();
        if(pnew.getTipo()!=PlatoTipo.PRINCIPAL){
            throw new ErrorCocina("el plato no es principal");
        }
        else{
            if(!stockIngrediente.keySet().containsAll(pnew.getRequisitoIngredientes().keySet())){
                throw new ErrorCocina("el participante no tiene los ingredientes necesarios para realizar el plato");
            }
            else{
                for(Ingredientes i : pnew.getRequisitoIngredientes().keySet()){
                    if(stockIngrediente.get(i)<pnew.getRequisitoIngredientes().get(i)){
                        throw new ErrorCocina("el participante no tiene la cantidad de ingrediente necesario para realizar el plato");
                    }
                }
                System.out.println("plato realizado con exito");
            }
        }
    }

    @Override
    public void servir(Plato pnew) throws ErrorServir {
        if(pnew.getTipo()!=PlatoTipo.PRINCIPAL){
            throw new ErrorServir("el plato no es principal");
        }
        else{
            System.out.println("plato servido con exito");

        }
    }
}
