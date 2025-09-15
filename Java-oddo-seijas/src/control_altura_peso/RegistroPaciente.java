package control_altura_peso;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

    public class RegistroPaciente {
        private String nombre;
        private String apellido;
        private LocalDate fechaNacimiento;

        private HashMap<LocalDate, RegistroMedida> registros;
        private HashSet<LocalDate> fechasRegistradas;

        public RegistroPaciente(String nombre, String apellido, LocalDate fechaNacimiento) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.fechaNacimiento = fechaNacimiento;
            this.registros = new HashMap<>();
            this.fechasRegistradas = new HashSet<>();
        }

        public void registrarMedicion(LocalDate fecha, int pesoKg, int alturaCm) {
            if (fechasRegistradas.contains(fecha)) {
                System.out.println("Ya existe un registro para la fecha " + fecha);
                return;
            }
            registros.put(fecha, new RegistroMedida(pesoKg, alturaCm));
            fechasRegistradas.add(fecha);
            System.out.println("Registro añadido: " + fecha);
        }

        public void mostrarMedicionEnFecha(LocalDate fecha) {
            RegistroMedida reg = registros.get(fecha);
            if (reg != null) {
                System.out.println("Fecha: " + fecha);
                System.out.println("Peso: " + reg.getPesoKg() + " kg");
                System.out.println("Altura: " + reg.getAlturaCm() + " cm");
            } else {
                System.out.println("No hay registro para la fecha " + fecha);
            }
        }

        public void promedioAnual(int año) {
            int sumaPeso = 0;
            int sumaAltura = 0;
            int contador = 0;

            for (HashMap.Entry<LocalDate, RegistroMedida> entry : registros.entrySet()) {
                if (entry.getKey().getYear() == año) {
                    sumaPeso += entry.getValue().getPesoKg();
                    sumaAltura += entry.getValue().getAlturaCm();
                    contador++;
                }
            }

            if (contador > 0) {
                System.out.println("Promedio en " + año);
                System.out.println("Peso: " + (sumaPeso / contador) + " kg");
                System.out.println("Altura: " + (sumaAltura / contador) + " cm");
            } else {
                System.out.println("No hay registros para el año " + año);
            }
        }

        public void porcentajeCambio(LocalDate fechaInicio, LocalDate fechaFin) {
            RegistroMedida inicio = registros.get(fechaInicio);
            RegistroMedida fin = registros.get(fechaFin);

            if (inicio != null && fin != null) {
                double cambioAltura = ((fin.getAlturaCm() - inicio.getAlturaCm()) / (double) inicio.getAlturaCm()) * 100;
                double cambioPeso = ((fin.getPesoKg() - inicio.getPesoKg()) / (double) inicio.getPesoKg()) * 100;

                System.out.println("Cambio de altura: " + cambioAltura + "%");
                System.out.println("Cambio de peso: " + cambioPeso + "%");
            } else {
                System.out.println("No hay registros para una o ambas fechas indicadas");
            }
        }
    }

