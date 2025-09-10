package CampeonatoArcoFlecha;

import enums.Dificultad;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, ColoresDiana> puntajesDiana1 = new HashMap<>();
        puntajesDiana1.put(10, ColoresDiana.AMARILLO);
        puntajesDiana1.put(8, ColoresDiana.ROJO);
        puntajesDiana1.put(5, ColoresDiana.VERDE);

        HashMap<Integer, ColoresDiana> puntajesDiana2 = new HashMap<>();
        puntajesDiana2.put(10, ColoresDiana.AMARILLO);
        puntajesDiana2.put(8, ColoresDiana.ROJO);
        puntajesDiana2.put(6, ColoresDiana.VERDE);
        puntajesDiana2.put(3, ColoresDiana.BLANCO);

        HashMap<Integer, ColoresDiana> puntajesDiana3 = new HashMap<>();
        puntajesDiana3.put(50, ColoresDiana.ROJO);
        puntajesDiana3.put(25, ColoresDiana.BLANCO);

        Diana dianaCircular = new Circulares("Diana Olímpica", Dificultad.DIFICIL, puntajesDiana1);
        Diana dianaRectangular = new Rectangulares("Blanco de Paja", Dificultad.MEDIO, puntajesDiana2, 30, 50);
        Diana dianaCuadrada = new Cuadradas("Cubo de Práctica", Dificultad.FACIL, puntajesDiana3, 40);

        HashSet<String> listaTragos = new HashSet<>();
        listaTragos.add("Cerveza");
        listaTragos.add("Vino");

        HashSet<String> listaGaseosas = new HashSet<>();
        listaGaseosas.add("Coca-Cola");

        HashSet<String> listaComidas = new HashSet<>();
        listaComidas.add("Hamburguesa");

        Beneficios beneficioTragos1 = new Tragos("Happy Hour", "Barman Pepe", listaTragos);
        Gaseosa beneficioGaseosa = new Gaseosa("Refresco Gratis", "Coca-Cola Inc.", listaGaseosas);
        Comida beneficioComida = new Comida("Combo Campeón", "Chef Gordon", listaComidas);
        Beneficios beneficioTragos2 = new Tragos("Noche de Mojitos", "Barman Luis", new HashSet<>(){{ add("Mojito"); }});

        HashSet<Diana> dianasDelBar = new HashSet<>();
        dianasDelBar.add(dianaCuadrada);
        dianasDelBar.add(dianaCircular);

        HashSet<Beneficios> beneficiosDelBar = new HashSet<>();
        beneficiosDelBar.add(beneficioTragos1);
        beneficiosDelBar.add(beneficioGaseosa);
        beneficiosDelBar.add(beneficioComida);
        beneficiosDelBar.add(beneficioTragos2);

        HashSet<Acumulables> acumulablesDelBar = new HashSet<>();
        acumulablesDelBar.add(beneficioGaseosa);
        acumulablesDelBar.add(beneficioComida);

        Bar barPrincipal = new Bar(50, 150000.0, dianasDelBar, beneficiosDelBar, acumulablesDelBar);

        Sistema sistema = new Sistema();
        sistema.dianas = new HashSet<>();
        sistema.dianas.add(dianaCircular);
        sistema.dianas.add(dianaRectangular);
        sistema.dianas.add(dianaCuadrada);


        System.out.println(dianaCircular.calcArea());
        System.out.println(dianaRectangular.calcArea());
        System.out.println(dianaCuadrada.calcArea());

        Circulares.setRadio(20);
        System.out.println(dianaCircular.calcArea());

        System.out.println(beneficioGaseosa.aplicarDescuentoExtra());
        System.out.println(beneficioComida.aplicarDescuentoExtra());

        System.out.println(barPrincipal.contarBeneficiosTragos());

        Diana dianaGanadora = sistema.dianaConMasPuntajes();
        System.out.println(dianaGanadora.getNombre());
    }
}