package vacunatorio;

import java.time.LocalDate;

public class Vacuna {
    private LocalDate fechaFabricacion;
    private LocalDate fechaAplicacion;
    private String lote;
    private String numeroFabricacion;
    private String nombreComercial;

    public Vacuna(LocalDate fechaFabricacion, LocalDate fechaAplicacion, String lote, String numeroFabricacion, String nombreComercial) {
        this.fechaFabricacion = fechaFabricacion;
        this.fechaAplicacion = fechaAplicacion;
        this.lote = lote;
        this.numeroFabricacion = numeroFabricacion;
        this.nombreComercial = nombreComercial;
    }

    public String getNombreComercial() { return nombreComercial; }

    @Override
    public String toString() {
        return nombreComercial + " - Aplicada: " + fechaAplicacion;
    }
}