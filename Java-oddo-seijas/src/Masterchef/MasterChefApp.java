package Masterchef;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class MasterChefApp {
    public static void main(String[] args) {

        HashMap<Ingredientes, Integer> reqEntrada = new HashMap<>();
        reqEntrada.put(Ingredientes.HUEVOS, 2);
        reqEntrada.put(Ingredientes.HARINA, 1);
        Plato entrada = new Plato("Tortilla Clásica", 15, reqEntrada, PlatoTipo.ENTRADA);

        HashMap<Ingredientes, Integer> reqPrincipal = new HashMap<>();
        reqPrincipal.put(Ingredientes.CARNE, 2);
        reqPrincipal.put(Ingredientes.LECHE, 1);
        Plato principal = new Plato("Estofado de Carne", 60, reqPrincipal, PlatoTipo.PRINCIPAL);

        HashMap<Ingredientes, Integer> reqEntradaProhibida = new HashMap<>();
        reqEntradaProhibida.put(Ingredientes.AZUCAR, 2);
        reqEntradaProhibida.put(Ingredientes.HARINA, 1);
        Plato entradaProhibida = new Plato("Pan Dulce de Entrada", 20, reqEntradaProhibida, PlatoTipo.ENTRADA);

        Plato platoLargo = new Plato("Plato muy complejo", 90, new HashMap<>(), PlatoTipo.PRINCIPAL);

        HashSet<Ingredientes> prohibidos = new HashSet<>();
        prohibidos.add(Ingredientes.AZUCAR);
        Principiantes p1 = new Principiantes("Juan", "Perez", LocalDate.of(2000, 5, 10), 25, "Madrid", Equipos.ROJO);
        p1.setIngredientesProhibidos(prohibidos);

        HashMap<Ingredientes, Integer> stock = new HashMap<>();
        stock.put(Ingredientes.CARNE, 3);
        stock.put(Ingredientes.LECHE, 1);
        stock.put(Ingredientes.HUEVOS, 5);
        Intermedios p2 = new Intermedios("Ana", "Gomez", LocalDate.of(1995, 8, 22), 30, "Barcelona", Equipos.VERDE, stock);

        Expertos p3 = new Expertos("Carlos", "Ruiz", LocalDate.of(1980, 1, 15), 45, "Sevilla", Equipos.AZUL);


        p1.prepararLugarTrabajo();
        p2.prepararLugarTrabajo();
        p3.prepararLugarTrabajo();


        try {
            p1.cocinar(entrada);
        } catch (ErrorCocina e) {
            System.out.println("- Error al cocinar: " + e.getMessage());
        }

        try {
            p1.servir(entrada);
        } catch (ErrorServir e) {
            System.out.println("- Error al cocinar: " + e.getMessage());
        }

        try {
            p2.cocinar(principal);
        } catch (ErrorCocina e) {
            System.out.println("- Error al cocinar: " + e.getMessage());
        }

        try {
            p2.servir(principal);
        } catch (ErrorServir e) {
            System.out.println("- Error al cocinar: " + e.getMessage());
        }

        try {
            p3.cocinar(principal);
        } catch (ErrorCocina e) {
            System.out.println("- Error al cocinar: " + e.getMessage());
        }

        try {
            p3.servir(principal);
        } catch (ErrorServir e) {
            System.out.println("- Error al cocinar: " + e.getMessage());
        }

        try {
            p1.cocinar(entradaProhibida);
        } catch (ErrorCocina e) {
            System.out.println("- Error al cocinar: " + e.getMessage());
        }

        try {
            p1.cocinar(principal);
        } catch (ErrorCocina e) {
            System.out.println("- Error al cocinar: " + e.getMessage());
        }




        p2.getStockIngrediente().put(Ingredientes.CARNE, 1);
        try {
            p2.cocinar(principal);

        }
        catch (ErrorCocina e) {
            System.out.println("- Error al cocinar: " + e.getMessage());
        }


        try {
             p3.cocinar(platoLargo);

        }
        catch (ErrorCocina e) {
            System.out.println("- Error al cocinar: " + e.getMessage());
        }

        try {
            p3.cocinar(entrada);

        }
        catch (ErrorCocina e) {
            System.out.println("- Error al cocinar: " + e.getMessage());
        }


    }
}
