package Masterchef;

import java.time.LocalDate;
import java.util.HashSet;

public class Principiantes extends Participantes implements Cocinar, Servir{
    private HashSet<Ingredientes>IngredientesProhibidos;

    public Principiantes(String nombre, String apellido, LocalDate nacimiento, int edad, String localidad, Equipos equipo) {
        super(nombre, apellido, nacimiento, edad, localidad, equipo);
    }

    public HashSet<Ingredientes> getIngredientesProhibidos() {
        return IngredientesProhibidos;
    }

    public void setIngredientesProhibidos(HashSet<Ingredientes> ingredientesProhibidos) {
        IngredientesProhibidos = ingredientesProhibidos;
    }

    @Override
    public void prepararLugarTrabajo() {
        System.out.println("Ya guarde todos los elementos prohibidos y no voy a usar: ");
        for (Ingredientes ing : IngredientesProhibidos) {
            System.out.println("- " + ing);
        }

    }

    @Override
    public void cocinar(Plato pnew) throws ErrorCocina {
        prepararLugarTrabajo();
        if(pnew.getTipo()!=PlatoTipo.ENTRADA){
            throw new ErrorCocina("el plato no es entrada");
        }
        else {
            for(Ingredientes i : IngredientesProhibidos){
                if(pnew.getRequisitoIngredientes().containsKey(i)){
                    throw new ErrorCocina("el plato contiene un ingrediente prohibido");
                }
            }
            System.out.println("plato cocinado con exito");

           /* if (!pnew.getRequisitoIngredientes().keySet().isEmpty()) {
                HashSet<Ingredientes> copia = new HashSet<>(pnew.getRequisitoIngredientes().keySet());
                copia.retainAll(IngredientesProhibidos);

                if (!copia.isEmpty()) {
                    throw new ErrorCocina("el plato contiene un ingrediente prohibido");
                }
            }*/
        }
    }

    @Override
    public void servir(Plato pnew) throws ErrorServir {
        if(pnew.getTipo()!=PlatoTipo.ENTRADA){
            throw new ErrorServir("el plato no es entrada");
        }
        else {
            System.out.println("plato servido con exito");
        }
    }
}
