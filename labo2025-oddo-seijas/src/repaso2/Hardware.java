package repaso2;

public class Hardware {
    private Dipositivo dispositivo;
    private Boolean repuesto;

    public Hardware(Dipositivo dispositivo, Boolean repuesto) {
        this.dispositivo = dispositivo;
        this.repuesto = repuesto;
    }

    public Dipositivo getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(Dipositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public Boolean getRepuesto() {
        return repuesto;
    }

    public void setRepuesto(Boolean repuesto) {
        this.repuesto = repuesto;
    }
}
