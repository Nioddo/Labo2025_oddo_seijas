package ConsumoElectricidad;

import java.time.LocalDate;
import java.util.HashMap;

public class MainConsumo {
    public static void main(String[] args) {
        // --- Creamos dueños ---
        Dueño duenio1 = new Dueño("Juan", "Perez", LocalDate.of(1980, 5, 12), 43, 12345678);
        Dueño duenio2 = new Dueño("Ana", "Gomez", LocalDate.of(1990, 7, 20), 33, 87654321);

        // --- Creamos mapas de consumos por año ---
        HashMap<Integer, HashMap<Meses, Double>> consumosDepto = new HashMap<>();
        HashMap<Integer, HashMap<Meses, Double>> consumosCasa = new HashMap<>();

        // Inicializamos los años
        consumosDepto.put(2024, new HashMap<>()); // año anterior
        consumosDepto.put(2025, new HashMap<>()); // año actual
        consumosCasa.put(2024, new HashMap<>());
        consumosCasa.put(2025, new HashMap<>());

        // --- Creamos viviendas ---
        Vivienda depto1 = new Departamento("Calle Falsa 123", 1000, duenio1, consumosDepto, 3);
        Vivienda casa1 = new Casa("Av. Siempre Viva 742", 2000, duenio2, consumosCasa, 120, 80);

        // --- Registramos consumos año 2024 (base para comparación) ---
        depto1.agregarConsumo(Meses.ENERO, 2024, 100.0); // 100 kw
        depto1.agregarConsumo(Meses.FEBRERO, 2024, 120.0);
        casa1.agregarConsumo(Meses.ENERO, 2024, 200.0);
        casa1.agregarConsumo(Meses.FEBRERO, 2024, 150.0);

        // --- Registramos consumos año 2025 ---
        depto1.agregarConsumo(Meses.ENERO, 2025, 80.0); // 20% menos que año anterior -> aplica 5% descuento
        depto1.agregarConsumo(Meses.FEBRERO, 2025, 130.0); // más que año anterior -> no descuento
        casa1.agregarConsumo(Meses.ENERO, 2025, 180.0); // menos del 10% -> aplica 5% descuento
        casa1.agregarConsumo(Meses.FEBRERO, 2025, 160.0); // más que año anterior -> no descuento

        // --- Intentamos registrar un mes ya cargado ---
        depto1.agregarConsumo(Meses.ENERO, 2025, 90.0); // debe avisar "el mes ya esta registrado"

        // --- Intentamos registrar un año no creado ---
        casa1.agregarConsumo(Meses.MARZO, 2023, 50.0); // debe avisar "año no registrado"

        // --- Mostramos resultados ---
        System.out.println("\n--- Consumos Departamento ---");
        consumosDepto.forEach((año, mapaMeses) -> {
            System.out.println("Año: " + año);
            mapaMeses.forEach((mes, kw) -> {
                System.out.println(mes + " -> " + kw + " kWh");
            });
        });

        System.out.println("\n--- Consumos Casa ---");
        consumosCasa.forEach((año, mapaMeses) -> {
            System.out.println("Año: " + año);
            mapaMeses.forEach((mes, kw) -> {
                System.out.println(mes + " -> " + kw + " kWh");
            });
        });
    }
}
