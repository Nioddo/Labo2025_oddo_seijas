package eleccionesOktubre;

import Personas.PersonaUseAbs; // Asumo que esta clase existe en el paquete Personas
import enums.Color; // Asumo que este enum existe en el paquete enums

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        // 1. Crear una colección de mensajeros
        HashSet<Mensajeria> listaMensajeros = new HashSet<>();

        // 2. Crear una instancia de PartidoPolitico
        PartidoPolitico miPartido = new PartidoPolitico("Partido del Futuro", "Avenida Siempre Viva 742", 1500, listaMensajeros);

        // 3. Crear instancias de los diferentes tipos de mensajeros

        // Crear un HorarioLaboral para el Trabajador
        HorarioLaboral horario = new HorarioLaboral(LocalTime.of(9, 0), LocalTime.of(18, 0));

        // Crear un Trabajador
        // Asumo la existencia de la clase abstracta PersonaUseAbs con un constructor que recibe nombre, apellido, nacimiento y edad.
        Trabajadores trabajador1 = new Trabajadores("Juan", "Perez", LocalDate.of(1990, 5, 15), 34, 35123456, 2035123456, 50000.0, "Calle Falsa 123", horario);

        // Crear un TelefonoMovil (encendido y con crédito)
        TelefonosMoviles telefono1 = new TelefonosMoviles(12345, "S23", "Samsung", true, CompaniasTelefonicas.MOVISTAR, 1155667788, 100);

        // Crear una PalomaMensajera (que sabe volar)
        PalomasMensajeras paloma1 = new PalomasMensajeras(Color.AZUL, "Palomita", true);

        // Crear un TelefonoMovil (apagado)
        TelefonosMoviles telefono2 = new TelefonosMoviles(67890, "G50", "Motorola", false, CompaniasTelefonicas.CLARO, 1122334455, 200);

        // Crear una PalomaMensajera (que no sabe volar)
        PalomasMensajeras paloma2 = new PalomasMensajeras(Color.PURPURA, "Pichón", false);


        // 4. Agregar los mensajeros al partido político usando el método agregarMensajero
        System.out.println("Agregando mensajeros a la campaña...");
        miPartido.agregarMensajero(trabajador1);
        miPartido.agregarMensajero(telefono1);
        miPartido.agregarMensajero(paloma1);
        miPartido.agregarMensajero(telefono2); // Este no debería enviar mensaje
        miPartido.agregarMensajero(paloma2);   // Esta tampoco


        // 5. Ejecutar el método hacerCampaña
        System.out.println("\n--- Iniciando la campaña política de " + miPartido.getNombre() + " ---");
        miPartido.hacerCampaña();
        System.out.println("--- Fin de la campaña ---");
    }
}
