package unidad2;

import curling.Jugador;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
        private String nombreEquipo;
        private String barrio;
        private ArrayList<Jugador> jugadores;
        private String disponibilidadHoraria;

        public Equipo(String nombreEquipo, String barrio, String disponibilidadHoraria) {
            this.nombreEquipo = nombreEquipo;
            this.barrio = barrio;
            this.disponibilidadHoraria = disponibilidadHoraria;
            this.jugadores = new ArrayList<>();
        }

        public boolean numeroCamisetaRepetido(int numero) {
            for (Jugador jugador : jugadores) {
                if (jugador.getNumeroCamiseta() == numero) {
                    return true;
                }
            }
            return false;
        }

        public void agregarJugador(Jugador jugador) {
            if (jugadores.size() < 11) {
                jugadores.add(jugador);
            } else {
                System.out.println("El equipo ya tiene 11 jugadores registrados.");
            }
        }

        public String getNombreEquipo() {
            return nombreEquipo;
        }

        public String getDisponibilidadHoraria() {
            return disponibilidadHoraria;
        }

        public void mostrarEquipo() {
            System.out.println("Equipo: " + nombreEquipo);
            System.out.println("Barrio: " + barrio);
            System.out.println("Disponibilidad: " + disponibilidadHoraria);
            System.out.println("Jugadores:");
            for (Jugador jugador : jugadores) {
                System.out.print("- " + jugador.getNombre());
                if (jugador.esCapitan()) {
                    System.out.print(" (Capitán)");
                }
                System.out.println(", Fecha de nacimiento: " + jugador.getFechaNacimiento() + ", Camiseta N°: " + jugador.getNumeroCamiseta());
            }
        }
    }

