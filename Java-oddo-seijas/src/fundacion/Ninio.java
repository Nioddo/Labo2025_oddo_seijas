package fundacion;

    import java.time.LocalDate;

    public class Ninio extends Paciente implements Tratamiento {
        private int tolerancia; // 1 a 10
        private int diasTratamiento;

        public Ninio(String nombre, String apellido, LocalDate fechaNacimiento, String genero, String tipoSangre, int tolerancia) {
            super(nombre, apellido, fechaNacimiento, genero, tipoSangre);
            this.tolerancia = tolerancia;
            this.diasTratamiento = 0;
        }

        @Override
        public String getCategoria() {
            return "Niño";
        }

        @Override
        public String solicitarTratamiento() {
            int edad = LocalDate.now().getYear() - this.getFechaNacimiento().getYear();
            if (edad > 3) {
                return "Tu tratamiento tardará esta cantidad de días: " + (tolerancia * 2);
            } else {
                return "Aún es chico para probar el tratamiento";
            }
        }

        @Override
        public double calcularCosto() {
            return tolerancia * 450000;
        }

        public void sumarDia() {
            int edad = LocalDate.now().getYear() - this.getFechaNacimiento().getYear();
            if (edad > 3) {
                diasTratamiento++;
            }
        }

        public int getDiasTratamiento() {
            return diasTratamiento;
        }
    }

