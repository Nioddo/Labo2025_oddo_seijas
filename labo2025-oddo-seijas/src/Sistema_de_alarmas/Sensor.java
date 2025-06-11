package Sistema_de_alarmas;

public abstract class Sensor {
    private boolean estado;
    private double medida;
    private double umbral;
    private int anioAdquisacion;

    public Sensor(boolean estado, double medida, int umbral, int anioAdquisacion) {
        this.estado = estado;
        this.medida = medida;
        this.umbral = umbral;
        this.anioAdquisacion = anioAdquisacion;
    }

    public Sensor() {
        this.medida = 5.5;
        this.estado = true;
        this.umbral = 6.0;
        this.anioAdquisacion = 2007;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getUmbral() {
        return umbral;
    }

    public void setUmbral(double umbral) {
        this.umbral = umbral;
    }

    public double getMedida() {
        return medida;
    }

    public void setMedida(double medida) {
        this.medida = medida;
    }

    public int getAnioAdquisacion() {
        return anioAdquisacion;
    }

    public void setAnioAdquisacion(int anioAdquisacion) {
        this.anioAdquisacion = anioAdquisacion;
    }

    public boolean CompUmbral(){
        if (medida>umbral){
            return true;
        }
        return false;
    }
}
